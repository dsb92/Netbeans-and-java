// Opgave2 : Lav et program, der læser fra en teksfil, skyld.txt, og udskriver summen
// af tallene i hver linje med navnet foranstillet (f.eks. Anne: 450). Filen kunne f.eks. indeholde:
//Anne 300 150
// Peter 18 300 900 -950
// Lis 1000 13.5
package kapitel_15;
import java.io.*;

public class SkrivSkyldfil
{
	public static void main(String[] arg) throws IOException
	{
		FileWriter skyld = new FileWriter("skrevet skyld.txt");
		PrintWriter ud = new PrintWriter(skyld);
		for (int i=1; i<5; i++)
		{
			String navn = "person"+i;
                        int tal = -100+(int) (Math.random()*1000);
                        double tal2 = -100+(int) (Math.random()*1000);
                        
                        ud.println(navn+ " "+tal+" "+tal2);
                        
                        
		}
		ud.close(); // luk så alle data skrives til disken
		System.out.println("Filen er gemt.");
	}
}


