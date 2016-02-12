package Opgave_4;
import java.util.*;
// Tal = plat eller krone, dvs. plat = 1 og krone = 2. Evt. find en løsning på at skrive det i strenge/tekst


public class BenytMønt
{
	public static void main(String[] arg) 
	{
	
          Mønt m;
          m = new Mønt();   //opretter en mønt
          
          int krone = 0;
          int antalKast = 0;
          
          while(antalKast<100)
          {
              m.kast();
              antalKast = antalKast + 1;
              System.out.println("kast: "+antalKast+" Udfald: "+m.værdi);
              if (m.værdi == 2) krone++;               //1 = plat, 2 = krone
          }
            
          System.out.println("Antal krone: "+krone);
	}
}


