package kapitel_04;
import java.util.*;
public class Boks2medThis
{
	private double l�ngde;
	private double bredde;
	private double h�jde;

	public void s�tM�l(double l�ngde, double bredde, double h�jde)
	{
		if (l�ngde<=0 || bredde<=0 || h�jde<=0) 
		{
 			System.out.println("Ugyldige m�l. Bruger standardm�l.");
			this.l�ngde = 10.0;
			this.bredde = 10.0;
			this.h�jde  = 10.0;
		} else {
			this.l�ngde = l�ngde;
			this.bredde = bredde;
			this.h�jde  = h�jde;
		}
	}

	public double volumen()
	{
		return bredde*h�jde*l�ngde; 
	}

	public void f�jTilListe(ArrayList l)
	{
		l.add(this);
	}
}