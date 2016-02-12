package Opgave_2;

// kan evt. bruge super() for at kalde superklassens variabler og metoder. 
// I dette tilfælde tilføjes en ny variable og konstruktøren skal derfor initialisere dem.


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
		// vælg en anden konstruktør i superklassen 
		// end den uden parametre
		super(lgd,b,h);     //se boks 3. Fjern densitet og d. 
		this.densitet = densitet;
	}

	public double vægt()
	{
		// superklassen udregner volumen for os
		return volumen() * densitet; 
	}
}


