/*
5. Lav den tilsvarende LaesKomprimeretTekstfilOgLavStatistik.java.
*/
package kapitel_15;
import java.io.*;
import java.util.*;
import java.util.zip.*;

public class Opgave_6 // LaesKomprimeretTekstfilOgLavStatistik
{
	public static void main(String[] args)
	{
		int antalPersoner = 0;
		int sumAlder = 0;

		try
		{
			GZIPInputStream zfil = new GZIPInputStream(new FileInputStream("skrevet fil.txt.gz"));
			BufferedReader ind =
				new BufferedReader(new InputStreamReader(zfil));

			String linie = ind.readLine();
			while (linie != null)
			{
				try
				{
					StringTokenizer bidder = new StringTokenizer(linie);

					String navn = bidder.nextToken();
					String køn = bidder.nextToken();
					int alder = Integer.parseInt(bidder.nextToken());

					System.out.println(navn+" er "+alder+" år.");
					antalPersoner = antalPersoner + 1;
					sumAlder = sumAlder + alder;
				} catch (Exception u)
				{
					System.out.println("Fejl. Linien springes over.");
					u.printStackTrace();
				}
				linie = ind.readLine();
			}

			System.out.println("Aldersgennemsnittet er: "+sumAlder/antalPersoner);
		} catch (FileNotFoundException u)
		{
			System.out.println("Filen kunne ikke findes.");
		} catch (Exception u)
		{
			System.out.println("Fejl ved læsning af fil.");
			u.printStackTrace();
		}
	}
}