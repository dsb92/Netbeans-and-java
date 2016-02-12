package Opgave_1;
import java.util.*;
// 


public class BenytBil
{
	public static void main(String[] arg) 
	{
	   Bil b;
           Person p;
           
           b = new Bil("Rød", "Lamborghini", 15000, 3500000);
           p = new Person ();
     
           b.vis(); 
           
           System.out.println();
           
           p.enSætterSigInd("Rasmus");
           p.enSætterSigInd("Per");
           p.hvemSidderIBilen(2);
           
           
           System.out.println("Bilen kører 1000 kilometer.");
           
           b.kør(1000);
           
           System.out.println("Den er nu kun "+b.pris()+" kroner værd");
           
           
           
           
           
           
           
           
           
	}
}


