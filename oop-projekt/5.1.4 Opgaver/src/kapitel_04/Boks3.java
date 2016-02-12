package kapitel_04;
/** En boks med en l�ngde, bredde og h�jde */
public class Boks3
{
	private double l�ngde;
	private double bredde;
	private double h�jde;

	/** konstrukt�r der opretter en standardboks */
	public Boks3()
	{
		System.out.println("Standardboks oprettes");
		l�ngde = 10.0;
		bredde = 10.0;
		h�jde  = 10.0;
	}

	/** en anden konstrukt�r der f�r bredde, h�jde og l�ngde */
	public Boks3(double lgd, double b, double h)
	{
		System.out.println("Boks oprettes med lgd="+lgd+" b="+b+" h="+h);
		s�tM�l(lgd,b,h);
	}

	/** s�tter boksens bredde, h�jde og l�ngde */
	public void s�tM�l(double lgd, double b, double h)
	{
		if (lgd<=0 || b<=0 || h<=0) 
		{
 			System.out.println("Ugyldige m�l. Bruger standardm�l.");
			l�ngde = 10.0;
			bredde = 10.0;
			h�jde  = 10.0;
		} else {
			l�ngde = lgd;
			bredde = b;
			h�jde  = h;
		}
	}

	/** udregner boksens rumfang */
	public double volumen()
	{
		double vol = l�ngde*bredde*h�jde ;
		return vol;
	}
}