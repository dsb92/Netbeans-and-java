package Opgave_1_2_3;
import java.util.*;

public class Raflebæger
{
	/** listen af terninger, der er i raflebÃ¦geret */
	public ArrayList<Terning> terninger;

	public Raflebæger(int antalTerninger)
	{
		terninger = new ArrayList<Terning>();
		for (int i=0; i<antalTerninger; i++)
		{
			Terning t;
			t = new Terning();
			tilføj(t);
		}
	}

	/** lÃ¦gger en terning i bÃ¦geret */
	public void tilføj(Terning t)
	{
		terninger.add(t);
	}

	/** ryster bÃ¦geret, sÃ¥ alle terningerne bliver 'kastet' og fÃ¥r en ny vÃ¦rdi */
	public void ryst()
	{
		for (Terning t : terninger) 
		{
			t.kast();
		}
	}

	/** finder summen af alle terningernes vÃ¦rdier */
	public int sum()
	{
		int resultat=0;
		for (Terning t : terninger) 
		{
			resultat = resultat + t.værdi;
		}
		return resultat;
	}

	/** finder antallet af terninger, der viser en bestemt vÃ¦rdi */
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

	/** beskriver bÃ¦gerets indhold som en streng */
	public String toString()
	{// (listens toString() kalder toString() pÃ¥ hver terning)
		return terninger.toString();
	}
}