package kapitel_05;
import kapitel_04.*;

public class FalskTerning1 extends Terning
{
	/** tilsidesæt kast med en "bedre" udgave */
	public void kast()
	{
		// udskriv så vi kan se at metoden bliver kaldt
		// System.out.println("[kast() på FalskTerning1] ");

		værdi = (int) (6*Math.random() + 1);

		// er det 1 eller 2? Så lav det om til 6!
		if ( værdi <= 2 ) værdi = 6;
	}
}