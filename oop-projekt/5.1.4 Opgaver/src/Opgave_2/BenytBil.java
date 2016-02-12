package Opgave_2;
import java.util.*;
// 


public class BenytBil
{
	public static void main(String[] arg) 
	{
	   Bil b;
           
           b = new Bil("Rød", "Lamborghini", 15000, 3500000);
           
           b.vis(); 
           
           System.out.println();
           
           
           System.out.println("Bilen kører 1000 kilometer.");
           
           b.kør(1000);
           
           System.out.println("Den er nu kun "+b.pris()+" kroner værd");
      
	}
}


