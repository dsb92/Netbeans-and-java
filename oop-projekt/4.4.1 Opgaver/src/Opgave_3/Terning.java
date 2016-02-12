package Opgave_3;
/** En klasse der beskriver 6-sidede terninger */
public class Terning
{
	/** antallet af øjne på den side på terningen, der vender opad lige nu */
	public int værdi;

	/** konstruktør der opretter en terning */
	public Terning()
	{
		kast(); // kald kast() der sÃ¦tter vÃ¦rdi til noget fornuftigt
	}

	/** kaster terningen, så den får en anden værdi */
	public void kast()
	{
		// find en tilfÃ¦ldig side
		double tilfældigtTal = Math.random();
		værdi = (int) (tilfældigtTal * 6 + 1);
	}

	/** giver en beskrivelse af terningen som en streng */
	public String toString()
	{
		String svar = ""+værdi;  // værdi som streng, f.eks. "4"
		return svar;
	}
}
