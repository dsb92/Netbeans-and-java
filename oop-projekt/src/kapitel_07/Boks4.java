package kapitel_07;
public class Boks4 
{
	private double l�ngde;              // objektvariabel
	private double bredde;              // objektvariabel
	private double h�jde;               // objektvariabel
	private static int antalBokse;      // klassevariabel

	public Boks4(double lgd, double b, double h)
	{
		// lgd, b og h er lokale variabler
		l�ngde = lgd;
		bredde = b;
		h�jde  = h;
		antalBokse = antalBokse + 1;
	}

	public static int l�sAntalBokse()   // klassemetode
	{
		return antalBokse;
	}

	public double volumen()
	{
		// vol er en lokal variabel
		double vol;
		vol = l�ngde*bredde*h�jde;
		return vol; 
	}
}