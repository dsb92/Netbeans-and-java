// Opgave 4 i 2.5.5 opgaver s. 47


public class Opgave_4
{
	public static void main(String[] arg) 
	{
	   
           
           for (int x = 0; x<=10; x++)
           {
               int y = 3*x*x+6*x+9;
               System.out.println("y-værdien for x = " + x + " er : " +y);
               
               
           }
           
           System.out.println();
              
           for (int x = 0; x<=100; x=x+10)
           {
               int y = 3*x*x+6*x+9;
               System.out.println("y-værdien for x = " + x + " er : " +y);
           }
	}
}


