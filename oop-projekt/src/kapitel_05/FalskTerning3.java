package kapitel_05;
import kapitel_04.*;
public class FalskTerning3 extends Terning
{
	public void kast ()
	{
		super.kast(); // kald den oprindelige kast-metode

		// blev det 1 eller 2? Så lav det om til en 6'er!
		if ( v�rdi <= 2 ) v�rdi = 6;
	}
}