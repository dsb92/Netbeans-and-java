package kapitel_05;
import kapitel_04.*;

public class FalskTerning1 extends Terning
{
	/** tilsides�t kast med en "bedre" udgave */
	public void kast()
	{
		// udskriv s� vi kan se at metoden bliver kaldt
		// System.out.println("[kast() p� FalskTerning1] ");

		v�rdi = (int) (6*Math.random() + 1);

		// er det 1 eller 2? S� lav det om til 6!
		if ( v�rdi <= 2 ) v�rdi = 6;
	}
}