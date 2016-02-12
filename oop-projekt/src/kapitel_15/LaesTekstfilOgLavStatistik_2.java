
//Udvid LaesTekstfilOgLavStatistik.java s�dan, at linier, der starter med "#" er kommentarer, som
//ignoreres, og afpr�v om programmet virker.

import java.io.*;
import java.util.*;

public class LaesTekstfilOgLavStatistik_2
{
	public static void main(String[] args)
	{
		int antalPersoner = 0;
		int sumAlder = 0;

		try
		{
			BufferedReader ind = new BufferedReader(new FileReader("skrevet fil.txt"));
			String linie = ind.readLine();
			while (linie != null)
			{
				if (!linie.startsWith("#")) try
				{
					StringTokenizer bidder = new StringTokenizer(linie);
					String navn = bidder.nextToken();
					String k�n = bidder.nextToken();
					int alder = Integer.parseInt(bidder.nextToken());

					System.out.println(navn+" er "+alder+" �r.");
					antalPersoner++;
					sumAlder+=alder;
				}
				catch (Exception u)
				{
					System.out.println("Fejl. Linien springes over.");
					u.printStackTrace();
				}
				linie = ind.readLine();
			}
			System.out.println("Aldersgennemsnittet er: "+sumAlder/antalPersoner);
		}
		catch (FileNotFoundException u)
		{
			System.out.println("Filen kunne ikke findes");
		}
		catch (Exception u)
		{
			System.out.println("Fejl ved l�sning af fil");
			u.printStackTrace();
		}
	}
}