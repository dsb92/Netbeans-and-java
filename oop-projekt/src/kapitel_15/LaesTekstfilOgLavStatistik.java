package kapitel_15;
import java.io.*;
import java.util.*;
public class LaesTekstfilOgLavStatistik
{
	public static void main(String[] arg)
	{
		int antalPersoner = 0;
		int sumAlder = 0;

		try 
		{
			Scanner sc = new Scanner(new FileReader("skrevet fil.txt"));

			while (sc.hasNext())
			{
				try 
				{
					String navn = sc.next(); // l�s tekst til f�rste mellemrum
					String k�n = sc.next();  // l�s tekst til n�ste mellemrum
					int alder = sc.nextInt();// l�s �t tal 

					System.out.println(navn+" er "+alder+" �r.");
					antalPersoner = antalPersoner + 1;
					sumAlder = sumAlder + alder;
				} 
				catch (Exception u) 
				{
					System.out.println("Fejl. Linjen springes over.");
					u.printStackTrace();
				}
				sc.hasNextLine();          // hop til n�ste linje
			}

			System.out.println("Aldersgennemsnittet er: "+sumAlder/antalPersoner);
		} 
		catch (FileNotFoundException u)
		{
			System.out.println("Filen kunne ikke findes.");
		} 
		catch (Exception u) 
		{
			System.out.println("Fejl ved l�sning af fil.");
			u.printStackTrace();
		}
	}
}