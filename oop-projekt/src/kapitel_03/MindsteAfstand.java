package kapitel_03;
import java.awt.*;
import java.util.*;

public class MindsteAfstand
{
	public static void main(String[] arg)
	{
		ArrayList<Point> punktliste;    // Punkt-liste:
		Point origo, p1, p2, p3;        // Variablerne defineres til Point-objektet
		double minDist = 10000;         // Definerer minDist variabel i typen double/kommatal
		punktliste = new ArrayList<Point>(); // Ny punkt-liste  
		origo = new Point(0,0);
		p1 = new Point(0,65);
		p2 = new Point(50,50);
		p3 = new Point(120,10);
		
		punktliste.add(p1);   //Tilføjer de angivne punkter til listen 
		punktliste.add(p2);
		punktliste.add(p3);
		
		for (Point p : punktliste)  //Gennemløb af punkliste
		{
			double dist;

			dist = origo.distance(p); //afstand til (0,0)
			if (dist<minDist)
			{
				minDist=dist;
			}
		}

		System.out.println("Den mindste afstand mellem punkterne "
			+ punktliste + " og (0,0) er "+minDist);
	}
}