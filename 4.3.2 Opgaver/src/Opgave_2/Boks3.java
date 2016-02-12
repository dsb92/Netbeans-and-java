package Opgave_2;
/** En boks med en længde, bredde og højde */
public class Boks3
{
	private double længde;
	private double bredde;
	private double højde;
        private double densitet;

	/** konstruktør der opretter en standardboks */
	public Boks3()
	{
		System.out.println("Standardboks oprettes");
		længde = 10.0;
		bredde = 10.0;
		højde  = 10.0;
                densitet = 10.0;
	}

	/** en anden konstrukt�r der f�r bredde, h�jde og l�ngde */
	public Boks3(double lgd, double b, double h, double d)
	{
		System.out.println("Boks oprettes med lgd="+lgd+" b="+b+" h="+h+" d="+d);
		sætMål(lgd,b,h,d);
	}

	/** sætter boksens bredde, højde og længde */
	public void sætMål(double lgd, double b, double h, double d)
	{
		if (lgd<=0 || b<=0 || h<=0 || d<=0) 
		{
 			System.out.println("Ugyldige mål. Bruger standardmål.");
			længde = 10.0;
			bredde = 10.0;
			højde  = 10.0;
                        densitet = 10.0;
		} else {
			længde = lgd;
			bredde = b;
			højde  = h;
                        densitet = d;
		}
	}

	/** udregner boksens rumfang */
	public double volumen()
	{
		double vol = længde*bredde*højde ;
		return vol;
	}
        
        public double vægt()
	{
		
		return volumen() * densitet; 
	}
}