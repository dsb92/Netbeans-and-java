package Opgave_2;
// 


public class Transportmiddel 
{
	public static void main(String[] arg) 
	{
	   Bil b = new Bil("Bil", "Rød", "Ferrari", 5000, 4000000);
           Cykel c = new Cykel("Cykel", "Blå", "Winther", 100, 3000);
           Skib s = new Skib("Skib", "Blå", "Maersk", 2000, 3000000);
      
           b.vis();
           System.out.println();
           c.vis();
           System.out.println();
           s.vis();
           System.out.println();
           
           System.out.println("Bilen kører 30000 km");
           b.kør(30000);
           System.out.println("Bilen er nu kun "+b.pris()+" kr. værd");
         
           System.out.println();
           
           System.out.println("Cyklisten cykler 2000 km");
           c.cykel(2000);
           System.out.println("Cyklen er nu kun "+c.pris()+" kr. værd");
           
           System.out.println();
           
           System.out.println("Skibet sejler 100000 km");
           s.sejle(2000);
           System.out.println("Skibet er nu kun "+s.pris()+" kr. værd");
           
           
          
 
	}
}


