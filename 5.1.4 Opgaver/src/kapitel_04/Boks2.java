package kapitel_04;
public class Boks2
{
	private double l�ngde;
	private double bredde;
	private double h�jde;

	public void s�tM�l(double lgd, double b, double h)
	{
		if (lgd<=0 || b<=0 || h<=0)
		{
			l�ngde = 10.0;
			bredde = 10.0;
			h�jde  = 10.0;
 			System.out.println("Ugyldige m�l. Bruger standardm�l.");
		} else {
			l�ngde = lgd;
			bredde = b;
			h�jde  = h;
		}
	}

	public double volumen()
	{
		double vol;
		vol = l�ngde*bredde*h�jde;
		return vol; 
	}
}