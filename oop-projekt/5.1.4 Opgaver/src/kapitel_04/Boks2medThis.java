package kapitel_04;
import java.util.*;
public class Boks2medThis
{
	private double længde;
	private double bredde;
	private double højde;

	public void sætMål(double længde, double bredde, double højde)
	{
		if (længde<=0 || bredde<=0 || højde<=0) 
		{
 			System.out.println("Ugyldige mål. Bruger standardmål.");
			this.længde = 10.0;
			this.bredde = 10.0;
			this.højde  = 10.0;
		} else {
			this.længde = længde;
			this.bredde = bredde;
			this.højde  = højde;
		}
	}

	public double volumen()
	{
		return bredde*højde*længde; 
	}

	public void føjTilListe(ArrayList l)
	{
		l.add(this);
	}
}