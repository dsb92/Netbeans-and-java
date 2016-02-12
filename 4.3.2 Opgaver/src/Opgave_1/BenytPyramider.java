package Opgave_1;
// Opret 3 pyramider og udregn volumen af dem.


public class BenytPyramider
{
	public static void main(String[] arg) 
	{
	   Pyramide pyramide1, pyramide2, pyramide3;
           pyramide1 = new Pyramide();
           pyramide2 = new Pyramide();
           pyramide3 = new Pyramide();
           
           pyramide1.side  = 6.5;
           pyramide1.side2 = 4.5;
           pyramide1.højde = 12.5;
           
           pyramide2.side  = 13.0;
           pyramide2.side2 = 9.0;
           pyramide2.højde = 25.0;
           
           pyramide3.side  = 26.0;
           pyramide3.side2 = 18;
           pyramide3.højde = 50;
           
           double v1, v2, v3;
           
           v1 = pyramide1.volumen();
           v2 = pyramide2.volumen();
           v3 = pyramide3.volumen();
           
           System.out.println("Volumen af pyramide nr. 1 er: " + v1);
           System.out.println("Volumen af pyramide nr.2 er: " + v2);
           System.out.println("Volumen af pyramide nr. 3 er: " + v3);
    
	}
}


