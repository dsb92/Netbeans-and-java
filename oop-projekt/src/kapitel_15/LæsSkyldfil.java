package kapitel_15;
import java.io.*;
import java.util.*;

public class L�sSkyldfil
{
	public static void main(String[] arg) throws IOException
	{
		FileReader skyld = new FileReader("skrevet skyld.txt");
		BufferedReader ind = new BufferedReader(skyld);

		String linje = ind.readLine();
		while (linje != null)
		{
			System.out.println("L�st: "+linje);
			linje = ind.readLine();
		}
	}
}

// filen indl�ses og kommer med teksdataen lavet i SkrivTekstfil.java
// Hver gang SkrivTekstfil.java k�res, kommer der et nyt output med nye dataer. ed nye dataer, hvis SkrivTekstfil.java k�res. 