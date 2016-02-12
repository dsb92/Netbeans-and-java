
import java.util.*;

public class Raflebaeger
{
	/** listen af terninger, der er i raflebægeret */
	public ArrayList<Terning> terninger;

	public Raflebaeger(int antalTerninger)
	{
		terninger = new ArrayList<Terning>();
		for (int i=0; i<antalTerninger; i++)
		{
			Terning t;
			t = new Terning();
			tilføj(t);
		}
	}

	/** lægger en terning i bægeret */
	public void tilføj(Terning t)
	{
		terninger.add(t);
	}

	/** ryster bægeret, så alle terningerne bliver 'kastet' og får en ny værdi */
	public void ryst()
	{
		for (Terning t : terninger) 
		{
			t.kast();
		}
	}

	/** finder summen af alle terningernes værdier */
	public int sum()
	{
		int resultat=0;
		for (Terning t : terninger) 
		{
			resultat = resultat + t.værdi;
		}
		return resultat;
	}

	/** finder antallet af terninger, der viser en bestemt værdi */
	public int antalDerViser(int værdi)
	{
		int resultat;
		resultat = 0;
		for (Terning t : terninger) 
		{
			if (t.værdi==værdi) 
			{
				resultat = resultat + 1;
			}
		}
		return resultat;
	}

	/** beskriver bægerets indhold som en streng */
	public String toString()
	{// (listens toString() kalder toString() på hver terning)
		return terninger.toString();
	}
}