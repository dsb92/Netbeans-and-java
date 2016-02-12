package kapitel_16;
public class BenytFtpForbindelse 
{
	public static void main(String[] a) throws Exception
	{
		FtpForbindelse f = new FtpForbindelse();
		// bem�rk - v�r altid MEGET FORSIGTIG med at angive adgangskoder i en fil!!
		f.forbind("pingo.cv.ihk.dk","nordfalk","adgangskoden");

		f.sendKommando("HELP");    // f� liste over kommandoer som tjenesten kender
		f.modtagTekst("LIST");     // f� liste over filer p� v�rten

		String indhold = "Indhold af en lille fil med navnet:\ntil.txt";
		f.sendTekst("STOR fil.txt", indhold);       // gem en tekstfil p� v�rten

		indhold = f.modtagTekst("RETR fil.txt");    // hent filen igen 
		System.out.println("Fil hentet med indholdet: "+indhold);
	}
}