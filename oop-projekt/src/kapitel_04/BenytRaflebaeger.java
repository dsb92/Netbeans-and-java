package kapitel_04;
public class BenytRaflebaeger
{
	public static void main(String[] arg)
	{	
		Raflebaeger b�ger;
		boolean toSeksere;
		int antalFors�g;

		b�ger = new Raflebaeger(3);   // opret et bæger med 3 terninger
		toSeksere=false;
		antalFors�g = 0;
		while (toSeksere==false)
		{
			b�ger.ryst();              // kast alle terningerne
			System.out.print("B�ger: " + b�ger + " sum: " + b�ger.sum());
			System.out.println(" Antal 6'ere: "+b�ger.antalDerViser(6)
			                 + " antal 5'ere: "+b�ger.antalDerViser(5));
			if (b�ger.antalDerViser(6) == 2)
			{
				toSeksere = true;
			}
			antalFors�g++;
		}
		System.out.println("Du fik to seksere efter "+ antalFors�g+" fors�g.");
	}
}