package kapitel_16;
import java.io.*;
import java.net.*;
public class HentHjemmesideMedURL
{
	public static void main(String[] arg)
	{
		try {
			URL url = new URL("http://www.esperanto.dk");
			InputStream binærInd = url.openStream();
			BufferedReader ind = new BufferedReader(new InputStreamReader(binærInd));
			String s = ind.readLine();
			while (s != null)
			{
				System.out.println("modt: "+s);
				s = ind.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}