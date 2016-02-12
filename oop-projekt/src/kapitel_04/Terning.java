package kapitel_04;
/** En klasse der beskriver 6-sidede terninger */
public class Terning
{
	/** antallet af �jne p� den side p� terningen, der vender opad lige nu */
	public int v�rdi;

	/** konstrukt�r der opretter en terning */
	public Terning()
	{
		kast(); // kald kast() der sætter værdi til noget fornuftigt
	}

	/** kaster terningen, s� den f�r en anden v�rdi */
	public void kast()
	{
		// find en tilfældig side
		double tilf�ldigtTal = Math.random();
		v�rdi = (int) (tilf�ldigtTal * 6 + 1);
	}

	/** giver en beskrivelse af terningen som en streng */
	public String toString()
	{
		String svar = ""+v�rdi;  // v�rdi som streng, f.eks. "4"
		return svar;
	}
}