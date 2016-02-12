//Evt. opgave 2: Skriv om, så den spørger om den lokale maskine ('localhost') port 8001 og brug den
// til at teste Hjemmesidevaert (der køres i en seperat proces)
package kapitel_16;
import java.io.*;
import java.net.*;
public class HentHjemmeside
{
	public static void main(String[] arg)
	{
		try {
			Socket forbindelse = new Socket("www.esperanto.dk",80); //opg2: new Socket("localhost",8001)
			OutputStream binærUd  = forbindelse.getOutputStream();
			InputStream  binærInd = forbindelse.getInputStream();
			PrintWriter    ud  = new PrintWriter(binærUd);
			BufferedReader ind = new BufferedReader(new InputStreamReader(binærInd));
			ud.println("GET /index.html HTTP/0.9"); //opg2: ("GET /xx.html HTTP/1.1")
			ud.println("Host: www.esperanto.dk");   //opg2: ("GET /favicon.ico HTTP/1.1")
			ud.println();
			ud.flush();              // send anmodning afsted til værten
			String s = ind.readLine();
			while (s != null) {      // readLine() giver null når datastrømmen lukkes
				System.out.println("modt: "+s);
				s = ind.readLine();
			}
			forbindelse.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}