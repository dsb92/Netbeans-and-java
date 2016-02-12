package Opgave_1;
// Definér klassen Pyramide. Objekterne skal have variablerne side og højde (definér en konstruktør)
// og en metode til at udregne volumen (side*side*højde/4)
// Skriv en BenytPyramider, som opretter 3 pyramider og udregner volumen af dem.


public class Pyramide
{
	double side;
        double side2;
        double højde;
        
        double volumen()
        {
            double vol;
            vol = (side*side2*højde)/4;
            return vol;
        }
    
    
}


