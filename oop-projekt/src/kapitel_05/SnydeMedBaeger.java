package kapitel_05;
import kapitel_04.*;
public class SnydeMedBaeger
{
	public static void main(String[] arg)
	{
		Raflebaeger b�ger = new Raflebaeger(0); // opret et b�ger med nul terninger

		Terning t = new Terning();
		b�ger.tilf�j(t);    // føj en almindelig terning til bægeret

		FalskTerning2 ft = new FalskTerning2();
		ft.s�tSnydev�rdi(6);
		b�ger.tilf�j(ft);   // tilføj() får et objekt af typen Terning,
		                    // og dermed også af typen FalskTerning2.

		ft = new FalskTerning2();
		ft.snydev�rdi=6;
		t=ft;               // t bruges som mellemvariabel for sjov.
		b�ger.tilf�j(t);

		for (int i=1; i<10; i++)
		{
			b�ger.ryst();
		}
	}
}