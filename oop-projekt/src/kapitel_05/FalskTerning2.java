package kapitel_05;
import kapitel_04.*;
public class FalskTerning2 extends Terning
{
	public int snydev�rdi;

	public void s�tSnydev�rdi(int nySnydev�rdi)
	{
		snydev�rdi = nySnydev�rdi;
	}

	public void kast()
	{
		//System.out.println("[kast() på FalskTerning2] ");

		v�rdi = (int) (6*Math.random() + 1);

		// 1 eller 2? Så lav det om til snydeværdi!
		if ( v�rdi <= 2 ) v�rdi = snydev�rdi;
	}
}