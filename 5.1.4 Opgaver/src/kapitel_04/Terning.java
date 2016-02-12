package kapitel_04;
/** En klasse der beskriver 6-sidede terninger */
public class Terning
{
	/** antallet af øjne på den side på terningen, der vender opad lige nu */
	public int værdi;

	/** konstrukt�r der opretter en terning */
	public Terning()
	{
		kast(); // kald kast() der sætter værdi til noget fornuftigt
	}

	/** kaster terningen, så den for en anden værdi */
	public void kast()
	{
		// find en tilfældig side
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