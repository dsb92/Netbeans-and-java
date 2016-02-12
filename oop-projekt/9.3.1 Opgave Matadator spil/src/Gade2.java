import java.awt.*;
/**
 * En gade der kan bebygges
 */
public class Gade2 extends Grund2
{
	int antalHuse;                                         // antal huse og pris
	double huspris;

  public Gade2(String navn, double pris, double leje, double huspris)
	{
		super(navn, pris, leje);
		this.huspris=huspris;
		antalHuse = 0;
  }

  public void landet(Spiller sp)
	{
		if (sp==ejer)
		{                                                    // eget felt; byg hus
			if (antalHuse<5 && sp.konto>huspris) bygHus();
		}

		super.landet(sp);
  }

  public void bygHus()
	{
		System.out.println(ejer.navn+" bygger et hus på "+navn+" for "+huspris);
		ejer.transaktion( -huspris );
		antalHuse = antalHuse + 1;
  }

	public double beregnLeje()
	{
		return grundleje + antalHuse * huspris;
	}

	/*
	public void toString()          // beskrivelse af feltet som en streng
	{
		if (huse == 0) return navn;
		else if (huse == 5) return navn + "(hotel)";
		else return navn + "(" + antalHuse + " huse)";
	}
	*/
	public void tegn(Graphics g)
	{
		super.tegn(g);
		if (antalHuse > 0) g.drawString(antalHuse + " huse",pos.x,pos.y+20);
	}
}
