package kapitel_05;
import kapitel_04.*;
public class SnydeMedBaeger
{
	public static void main(String[] arg)
	{
		Raflebaeger bæger = new Raflebaeger(0); // opret et bæger med nul terninger

		Terning t = new Terning();
		bæger.tilføj(t);    // fÃ¸j en almindelig terning til bÃ¦geret

		FalskTerning2 ft = new FalskTerning2();
		ft.sætSnydeværdi(6);
		bæger.tilføj(ft);   // tilfÃ¸j() fÃ¥r et objekt af typen Terning,
		                    // og dermed ogsÃ¥ af typen FalskTerning2.

		ft = new FalskTerning2();
		ft.snydeværdi=6;
		t=ft;               // t bruges som mellemvariabel for sjov.
		bæger.tilføj(t);

		for (int i=1; i<10; i++)
		{
			bæger.ryst();
		}
	}
}