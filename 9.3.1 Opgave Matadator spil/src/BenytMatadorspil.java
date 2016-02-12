
public class BenytMatadorspil
{
	public static void main(String[] arg)
	{
		Matadorspil_version2 spil = new Matadorspil_version2();
		spil.spillere.add(new Spiller("S�ren",50000));   // opret spiller S�ren
		spil.spillere.add(new Spiller("Gitte",50000));   // opret spiller Gitte

		// l�b gennem 20 runder (40 ture)
		for (spil.spillersTur=0; spil.spillersTur<40; spil.spillersTur++)
		{
			// tag skiftevis S�ren og Gitte (% er forklaret i afsnit 2.11.4)
			Spiller sp = spil.spillere.get(spil.spillersTur % spil.spillere.size());
			int slag = (int)(Math.random()*6)+1;     // og sl�r et terningkast (1-6)
			System.out.println("***** "+sp.navn+" p� felt "+sp.feltnr+" sl�r "+slag);

			for (int i=1; i<=slag; i=i+1)                  // nu rykkes der
			{
				// g� til n�ste felt. Hvis vi n�r over antal felter s� t�l fra 0
				sp.feltnr = (sp.feltnr + 1) % spil.felter.size();
				Felt felt = spil.felter.get(sp.feltnr);

				if (i<slag) felt.passeret(sp); // kald passeret() p� passerede felter
				else felt.landet(sp);          // kald landet() p� sidste felt
				try { Thread.sleep(300); } catch (Exception e) {} // vent 0.3 sek
			}
			try { Thread.sleep(3000); } catch (Exception e) {} // tur slut, vent 3 sek
		}
	}
}