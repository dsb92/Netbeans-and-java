package kapitel_02;
//
// Beregning af rumfang for en cylinder
//
public class Cylinderberegning
{
	public static void main(String[] arg) 
	{
		double radius = 5.0;
		
                double 
                h�jde = 12.5;
                

		//beregn rumfang
		double volumen = radius * radius * h�jde * 3.14159;

		System.out.println("Cylinderens h�jde: " + h�jde);
		System.out.println("Cylinderens radius: " + radius);
		System.out.println("Cylinderens volumen: " + volumen);
	}
}