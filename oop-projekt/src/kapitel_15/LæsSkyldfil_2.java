package kapitel_15;
import java.io.*;
import java.util.*;

public class L�sSkyldfil_2
{
	public static void main(String[] arg) throws IOException
	{
		BufferedReader ind = new BufferedReader (new FileReader("skrevet skyld.txt"));
		String linje = ind.readLine();
                int alderssum = 0;

		while (linje != null)
		{
			String [] bidder = linje.split(" ");
                        alderssum = alderssum + Integer.parseInt ( bidder[1]);
                        linje = ind.readLine();                    
		}
                System.out.println("Summen af tallene er: "+alderssum);
	}
}

// filen indl�ses og kommer med teksdataen lavet i SkrivTekstfil.java
// Hver gang SkrivTekstfil.java k�res, kommer der et nyt output med nye dataer. ed nye dataer, hvis SkrivTekstfil.java k�res. 