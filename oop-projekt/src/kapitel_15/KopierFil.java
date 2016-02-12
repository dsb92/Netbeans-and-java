package kapitel_15;
import java.io.*;


public class KopierFil
{
	public static void main(String[] arg) throws IOException
	{
		InputStream is = new FileInputStream("skrevet fil.txt");   //Erstattet med fil.txt, da bog.html ikke er lavet/eksisterer.
		OutputStream os = new FileOutputStream("kopieretFil fil.txt");

		// brug evt. buffere i læsning og skrivning (mere effektivt)        punkt A
		// is = new BufferedInputStream(is);
		// os = new BufferedOutputStream(os);

		// husk starttidpunkt, så vi kan måle hvor lang tid det teger
		is = new BufferedInputStream(is);
                os = new BufferedOutputStream(os);
                
                long starttid = System.currentTimeMillis();

		// læs og skriv én byte ad gangen (ret ineffektivt)                 punkt B
                // Eller læs og skriv i større klumper ( mere effektiv)
		byte[] data = new byte[4096]; //4 kilobyte
                int lgd = is.read(data);
		while (lgd != -1)
		{
			os.write(data, 0, lgd);
                        lgd = is.read(data);
		}

		is.close();
		os.close();
		long sluttid = System.currentTimeMillis();
		System.out.println("Kopiering tog "+ (sluttid-starttid)*0.001 +" sek.");

	}
}