package kapitel_04;
public class BenytTerning
{
	public static void main(String[] arg)
	{
		Terning t;
		t = new Terning();	// opret terning

		// Sl� nu med terningen indtil vi f�r en sekser
		boolean sekser = false;
		int antalKast = 0;

		while (sekser==false)
		{
			t.kast();
			antalKast = antalKast + 1;
			System.out.println("kast "+antalKast+": "+t.værdi);
			if (t.værdi == 6) sekser = true;
		}

		System.out.println("Vi slog en 6'er efter "+antalKast+" slag.");
	}
}