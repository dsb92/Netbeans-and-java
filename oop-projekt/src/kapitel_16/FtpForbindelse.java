package kapitel_16;
import java.io.*;
import java.net.*;
import java.util.*;

/** Denne klasse er af pladshensyn skrevet meget kompakt. Den beste måde at
    forstå den er at prøve den fra et program, f.eks BenytFtpForbindelse, og
    bruge trinvis gennemgang til at følge med i hvordan den fungerer. */

public class FtpForbindelse
{
	private Socket kontrol;
	private PrintStream ud;
	private BufferedReader ind;

	/** Modtager værtens svar, der godt kan løbe over flere linjer. Sidste linje
	    er en svarkode på tre cifre, uden en bindestreg '-' på plads nummer 4 */
	private String l�sSvar() throws IOException
	{
		while (true) {
			String s = ind.readLine();
			System.out.println("modt: "+s);
			if (s.length()>=3 && s.charAt(3)!='-' && Character.isDigit(s.charAt(0))
			    && Character.isDigit(s.charAt(1)) && Character.isDigit(s.charAt(2)))
				return s;   // afslut løkken og returner sidste linje med statuskode
		}
	}

	public String sendKommando(String kommando) throws IOException
	{
		System.out.println("send: "+kommando);
		ud.println(kommando);
		ud.flush();         // sørg for at data sendes til værten før vi læser svar
		return l�sSvar();
	}

	public void forbind(String v�rt, String bruger, String kode)throws IOException
	{
		kontrol = new Socket(v�rt,21);
		ud  = new PrintStream(kontrol.getOutputStream());
		ind = new BufferedReader(new InputStreamReader(kontrol.getInputStream()));
		l�sSvar();                     // Læs velkomst fra vært
		sendKommando("USER "+bruger);  // Send brugernavn
		sendKommando("PASS "+kode);    // Send adgangskode
	}

	/** Få en forbindelse beregnet til at overføre data (filer) til/fra værten */
	private Socket skafDataforbindelse() throws IOException 
	{
		String maskineOgPortnr = sendKommando("PASV");
		StringTokenizer st = new StringTokenizer(maskineOgPortnr, "(,)");
		if (st.countTokens() < 7) throw new IOException("Ikke logget ind");
		st.nextToken(); // spring over 5 bidder før portnummer kommer
		st.nextToken(); st.nextToken(); st.nextToken(); st.nextToken();
		int portNr = 256*Integer.parseInt(st.nextToken())
		               + Integer.parseInt(st.nextToken());
		return new Socket(kontrol.getInetAddress(), portNr); // forbind til porten
	}

	public void sendTekst(String kommando, String data) throws IOException
	{
		Socket df = skafDataforbindelse();
		PrintStream dataUd = new PrintStream( df.getOutputStream() );
		sendKommando(kommando);        // f.eks STOR fil.txt
		dataUd.print(data);
		dataUd.close();
		df.close();
		l�sSvar();
	}

	public String modtagTekst(String kommando) throws IOException
	{
		Socket df = skafDataforbindelse();
		BufferedReader dataInd = new BufferedReader(new InputStreamReader(
		                                                     df.getInputStream()));
		sendKommando(kommando); // f.eks LIST eller RETR fil.txt
		StringBuilder sb = new StringBuilder();
		String s = dataInd.readLine();
		while (s != null) {
			System.out.println("data: "+s);
			sb.append(s+"\n");
			s = dataInd.readLine();
		}
		dataInd.close();
		df.close();
		l�sSvar();
		return sb.toString(); // returnér en streng med de data vi fik fra værten
	}
}