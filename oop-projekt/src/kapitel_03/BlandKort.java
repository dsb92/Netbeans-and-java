package kapitel_03;
import java.util.*;
 
public class BlandKort
{
	public static void main(String[] arg)
	{
		ArrayList<String> bunke = new ArrayList<String>();

		// Opbyg bunken
		for (int n=2; n<9; n++)
		{
			bunke.add("ruder"+n);  // ruder
			bunke.add("kl�r"+n);   // kl�r
			bunke.add("spar"+n);   // spar
		}

		System.out.println("F�r blanding: "+bunke);   // bunke.toString() kaldes
		int antalKort = bunke.size();

		// Bland bunken
		for (int n=0; n<100; n++)
		{
			int nr = (int) (Math.random() * antalKort); // find en tilf�ldig plads

			String kort = bunke.get(nr);                // tag et kort ud
			bunke.remove(nr);

			nr = (int) (Math.random() * antalKort);
			bunke.add(nr, kort);                        // s�t det ind et andet sted
		}
		
		System.out.println("Efter blanding: "+bunke);
	}
}