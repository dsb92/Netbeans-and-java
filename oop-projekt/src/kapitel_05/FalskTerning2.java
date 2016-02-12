package kapitel_05;
import kapitel_04.*;
public class FalskTerning2 extends Terning
{
	public int snydeværdi;

	public void sætSnydeværdi(int nySnydeværdi)
	{
		snydeværdi = nySnydeværdi;
	}

	public void kast()
	{
		//System.out.println("[kast() pÃ¥ FalskTerning2] ");

		værdi = (int) (6*Math.random() + 1);

		// 1 eller 2? SÃ¥ lav det om til snydevÃ¦rdi!
		if ( værdi <= 2 ) værdi = snydeværdi;
	}
}