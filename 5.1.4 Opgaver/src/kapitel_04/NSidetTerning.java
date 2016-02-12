package kapitel_04;
/** En klasse der beskriver 4-, 8- 12- og 20-sidede terninger */
public class NSidetTerning
{
	/** hvor mange sider har terningen (normalt 6) */
	private int sider;

	/** den side p� terningen, der vender opad lige nu */
	private int v�rdi;

	/** konstrukt�r der opretter en standardterning med 6 sider */
	public NSidetTerning ()
	{
		sider = 6;
		kast(); // sæt værdi til noget
	}

	/** konstrukt�r der opretter en terning med et vist antal sider */
	public NSidetTerning (int antalSider)
	{
		if (antalSider >= 3) sider = antalSider;
		else sider = 6;
		kast();
	}

	/** kaster terningen, s� den f�r en anden v�rdi */
	public void kast ()
	{
		// find en tilf�ldig side
		double tilf�ldigtTal = Math.random();
		v�rdi = (int) (tilf�ldigtTal * sider + 1);
	}

	/** giver antallet af �jne p� den side p� terningen, der vender opad */
	public int hentV�rdi ()
	{
		return v�rdi;
	}

	/** �ndrer terningen til at vende en bestemt side opad */
	public void s�tV�rdi (int nyV�rdi)
	{
		if (nyV�rdi > 0 && nyV�rdi <= sider) v�rdi = nyV�rdi;
		else System.out.println("Ugyldig v�rdi");
	}

	/** giver en beskrivelse af terningen som en streng.
	    Hvis den ikke har 6 sider udskrives også antal af sider */
	public String toString ()
	{
		String svar = ""+v�rdi;  // værdi som streng, f.eks. "4"
		if (sider!= 6) svar = svar+"("+sider+"s)";
		return svar;
	}
}