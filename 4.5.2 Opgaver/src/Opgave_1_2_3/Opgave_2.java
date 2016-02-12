package Opgave_1_2_3;
// 


public class Opgave_2
{
	public static void main(String[] arg) 
	{
	   Raflebæger bæger;
		
		int antalForsøg;

		bæger = new Raflebæger(12);   // opret et bÃ¦ger med 3 terninger
		
		antalForsøg = 0;
		while (antalForsøg<50)
		{
			bæger.ryst();              // kast alle terningerne
			System.out.print("Bæger: " + bæger + " sum: " + bæger.sum());
			System.out.println(" Antal 6'ere: "+bæger.antalDerViser(6));
		
			antalForsøg++;
		}

 
	}
}


