
/*
4. Skriv et program, Diff.java, der sammenligner to tekstfiler linie for linie og udskriver de
	 linier, der er forskellige.

Programmet herunder tager ikke højde for at der kan være
indsat nogle linier i den ene eller den anden fil.
*/
package kapitel_15;
import java.io.*;
import java.util.*;

public class Grep
{
	public static void main(String[] args) throws IOException
	{
		String filnavn = "skrevet fil.txt";
		String filnavn2 = "skrevet fil2.txt";

		// Hvis der er to kommandolinie-parametre fortolkes de som filnavne
		if (args.length >= 2) {
			filnavn = args[0];
			filnavn2 = args[1];
		}

		BufferedReader ind = new BufferedReader(new FileReader(filnavn));
		BufferedReader ind2 = new BufferedReader(new FileReader(filnavn2));
		String linie = ind.readLine();
		String linie2 = ind2.readLine();

		while (linie != null && linie2 != null)
		{
			if (!linie.equals(linie2)) {
				System.out.println("1: "+ linie);
				System.out.println("2: "+ linie2);
			}
			linie = ind.readLine();
			linie2 = ind2.readLine();
		}

		// Resten af første fil
		while (linie != null)
		{
			System.out.println("1: "+ linie);
			linie = ind.readLine();
		}

		// Resten af anden fil
		while (linie2 != null)
		{
			System.out.println("2: "+ linie2);
			linie2 = ind2.readLine();
		}

	}
}
