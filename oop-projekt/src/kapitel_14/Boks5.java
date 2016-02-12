package kapitel_14;
public class Boks5
{
	private double l�ngde;
	private double bredde;
	private double h�jde;

	public Boks5(double lgd, double b, double h)
	{
		s�tM�l(lgd,b,h);
	}

	public void s�tM�l(double lgd, double b, double h)
	{
		if (lgd<=0||b<=0||h<=0) throw new IllegalArgumentException("Ugyldige m�l.");
		l�ngde = lgd;
		bredde = b;
		h�jde  = h;
	}

	public double volumen()
	{
		return l�ngde*bredde*h�jde; 
	}
}