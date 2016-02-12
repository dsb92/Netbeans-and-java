package kapitel_15;
import java.io.*;
public class SkrivTekstfil 
{
	public static void main(String[] arg) throws IOException
	{
		FileWriter fil = new FileWriter("skrevet fil.txt");
		PrintWriter ud = new PrintWriter(fil);
		for (int i=0; i<5; i++)
		{
			String navn = "person"+i;
			String k�n;
			if (Math.random()>0.5) k�n = "m"; else k�n = "k";
			int alder = 10+(int) (Math.random()*60);

			ud.println(navn+" "+k�n+" "+alder);
		}
		ud.close(); // luk s� alle data skrives til disken
		System.out.println("Filen er gemt.");
	}
}

//teksdaten bliver gemt i filen. 