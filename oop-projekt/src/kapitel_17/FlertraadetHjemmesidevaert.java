package kapitel_17;
import java.net.*;
public class FlertraadetHjemmesidevaert
{
	public static void main(String[] arg)
	{
		try {
			ServerSocket værtssokkel = new ServerSocket(8001);

			while (true)
			{
				Socket forbindelse = værtssokkel.accept();
				Anmodning a = new Anmodning(forbindelse);
				new Thread(a).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//Programmet afprøves ved at åbne adressen localhost:8001/xx.html hhv. yy, zz, og qq i en netlæser(browser).
//Man ser, at anmodningerne xx, yy og zz behandles samtidigt. 