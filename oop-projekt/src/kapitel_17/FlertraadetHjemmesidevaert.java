package kapitel_17;
import java.net.*;
public class FlertraadetHjemmesidevaert
{
	public static void main(String[] arg)
	{
		try {
			ServerSocket v�rtssokkel = new ServerSocket(8001);

			while (true)
			{
				Socket forbindelse = v�rtssokkel.accept();
				Anmodning a = new Anmodning(forbindelse);
				new Thread(a).start();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//Programmet afpr�ves ved at �bne adressen localhost:8001/xx.html hhv. yy, zz, og qq i en netl�ser(browser).
//Man ser, at anmodningerne xx, yy og zz behandles samtidigt. 