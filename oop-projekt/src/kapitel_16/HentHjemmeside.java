//Evt. opgave 2: Skriv om, s� den sp�rger om den lokale maskine ('localhost') port 8001 og brug den
// til at teste Hjemmesidevaert (der k�res i en seperat proces)
package kapitel_16;
import java.io.*;
import java.net.*;
public class HentHjemmeside
{
	public static void main(String[] arg)
	{
		try {
			Socket forbindelse = new Socket("www.esperanto.dk",80); //opg2: new Socket("localhost",8001)
			OutputStream bin�rUd  = forbindelse.getOutputStream();
			InputStream  bin�rInd = forbindelse.getInputStream();
			PrintWriter    ud  = new PrintWriter(bin�rUd);
			BufferedReader ind = new BufferedReader(new InputStreamReader(bin�rInd));
			ud.println("GET /index.html HTTP/0.9"); //opg2: ("GET /xx.html HTTP/1.1")
			ud.println("Host: www.esperanto.dk");   //opg2: ("GET /favicon.ico HTTP/1.1")
			ud.println();
			ud.flush();              // send anmodning afsted til v�rten
			String s = ind.readLine();
			while (s != null) {      // readLine() giver null n�r datastr�mmen lukkes
				System.out.println("modt: "+s);
				s = ind.readLine();
			}
			forbindelse.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}