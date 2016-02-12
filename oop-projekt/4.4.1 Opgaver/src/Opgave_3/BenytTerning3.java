// Med 12 terninger , udskriver øjne og summen af dem samt hvor mange 6'er der kom. 
// Benyt ArrayList-klassen til at holde styr på terninger (ellers vil der være alt for meget skrive arbejde)
// Fra facitlisten: 
package Opgave_3;
import java.util.*;


public class BenytTerning3
{
	static public void main(String[] args)
	{

		Vector liste = new Vector();
		for (int i = 0; i < 12; i++) liste.addElement(new Terning());

		int antalSlag = 0;

		while (antalSlag < 10)
		{
			antalSlag++;

			Terning t;
			for (int i = 0; i < liste.size(); i++)
			{
				t = (Terning) liste.elementAt(i);
				t.kast();
			}

			int seksere = 0;
			int sum = 0;
			for (int i = 0; i < liste.size(); i++)
			{
				t = (Terning) liste.elementAt(i);
				sum = sum + t.værdi;
				if (t.værdi == 6) seksere++;
			}

			System.out.println("Terninger: "+liste);
			System.out.println("Sum : "+sum+ "   Antal slag : " + antalSlag + "  Antal seksere : " + seksere);
		}
	}
}
