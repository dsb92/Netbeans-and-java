import java.awt.*;

/**
 * Mellemklasse mellem 'Felt' og underliggende klasser
 */
public class Grund2 extends Felt
{
	Spiller ejer;
	double pris;
	double grundleje;

	public Grund2(String navn, double pris, double leje)
	{
		this.navn=navn;
		this.pris=pris;
		this.grundleje=leje;
	}

	public double beregnLeje()
	{
		return grundleje;
	}

	public void landet(Spiller sp)
	{
		System.out.println(sp.navn+" er landet på "+navn);
		if (sp==ejer)
		{                                                // spiller ejer feltet
			System.out.println("Dette er "+sp.navn+"s egen grund");
		}
		else if (ejer!=null)
		{                                                 // feltet ejes af den anden spiller
			double leje = beregnLeje();
			System.out.println("Husleje: "+leje);
			sp.betal(ejer, leje);                           // denne spiller betaler til ejeren
		}
		else
		{                                                 // der er ingen ejer, så køb grunden
			if (sp.konto > pris)
			{
				System.out.println(sp.navn+" køber "+navn+" for "+pris);
				ejer=sp;
				sp.transaktion( -pris );
			}
			else System.out.println(sp.navn+" har ikke penge nok til at købe "+navn);
		}
	}

	public void tegn(Graphics g)
	{
		super.tegn(g);
		if (ejer != null) {
			g.setColor(Color.blue);
			g.drawString(ejer.navn,pos.x,pos.y+10);
		}
	}
}
