package kapitel_05;

// Matadorspil for to spillere
import java.util.*;


class Bryggeri extends Felt
{
	Spiller ejer;
	double pris;
	double grundleje;

	public Bryggeri(String navn, double pris)
	{
		this.navn = navn;
		this.pris = pris;
	}

	public void landet(Spiller sp)
	{
		System.out.println(sp.navn+" er landet på "+navn);
		if (sp==ejer)
		{                                       // spiller ejer selv grunden
			System.out.println("Dette er "+sp.navn+"s egen grund");
		}
		else if (ejer==null)
		{                                       // ingen ejer grunden, så køb den
			if (sp.konto > pris)
			{
				System.out.println(sp.navn+" køber "+navn+" for "+pris);
				ejer=sp;
				sp.transaktion( -pris );
			}
			else System.out.println(sp.navn+" har ikke penge nok til at købe "+navn);
		}
		else
		{                                       // feltet ejes af anden spiller
			grundleje = 800*((int) (Math.random()*6+1));
                        System.out.println("Husleje: "+grundleje);
			sp.betal(ejer, grundleje);            // spiller betaler til ejeren
		}
	}
}



