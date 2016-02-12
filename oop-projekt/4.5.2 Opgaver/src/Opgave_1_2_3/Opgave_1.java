package Opgave_1_2_3;
// Opgave 1:
// Med 4 terninger, indtil der slås tre eller fire 6'er. Udskriv antal øjne for hver terning.


public class Opgave_1
{
	public static void main(String[] arg) 
	{
	   Raflebæger bæger;
		boolean treSeksere;
                boolean fireSeksere;
		int antalForsøg;

		bæger = new Raflebæger(4);   // opret et bæger med 3 terninger
		treSeksere=false;
                fireSeksere=false;
		antalForsøg = 0;
		while (treSeksere==false || fireSeksere==false)
		{
			bæger.ryst();              // kast alle terningerne
			System.out.println("Bæger: " + bæger);
			
			if (bæger.antalDerViser(6) == 3)
			{
				treSeksere = true;                              
			}
                        else if (bæger.antalDerViser(6) == 4)
                        {
                            fireSeksere = true;
                        }
			antalForsøg++;
		}
                    System.out.println("Vi slog "+bæger.antalDerViser(6)+" seksere efter "+antalForsøg+" forsøg.");
 
	}
}


