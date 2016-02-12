package kapitel_21;
public class YdreKlasseMedLokalKlasse
{
	private int a1 = 1;					// Objektvariabler beh�ver ikke v�re final

	public void pr�vLokaltObjekt(final int a2) // Bem�rk: final
	{
		final int a3 = 3;                        // Bem�rk: final

		class LokalKlasse {                      // defin�r lokal klasse
			int a4 = 4;
			public void udskriv()
			{
				System.out.println( a4 );
				System.out.println( a3 );
				System.out.println( a2 );
				System.out.println( a1 );
			}
		} // slut p� lokal klasse

		LokalKlasse lokal = new LokalKlasse(); // opret lokalt objekt fra klassen
		lokal.udskriv();
	}

	public static void main(String[] arg){
		YdreKlasseMedLokalKlasse ydre = new YdreKlasseMedLokalKlasse();
		ydre.pr�vLokaltObjekt(2);
	}
}