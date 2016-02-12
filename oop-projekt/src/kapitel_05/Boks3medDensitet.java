package kapitel_05;
import kapitel_04.*;
public class Boks3medDensitet extends Boks3
{
	private double densitet;

	public Boks3medDensitet()
	{
		// super(); kaldes automatisk hvis intet andet angives
		densitet = 10.0;
	}

	public Boks3medDensitet(double lgd, double b,	
					double h, double densitet)
	{
		// v�lg en anden konstrukt�r i superklassen 
		// end den uden parametre
		super(lgd,b,h); 
		this.densitet = densitet;
	}

	public double v�gt()
	{
		// superklassen udregner volumen for os
		return volumen() * densitet; 
	}
}