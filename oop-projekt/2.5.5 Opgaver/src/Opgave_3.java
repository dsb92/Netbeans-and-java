// Lav et program, der udskriver 2-tabellen, 3-tabellen,.. op til 10-tabellen.


public class Opgave_3
{
	public static void main(String[] args)
	{
		for (int n = 1; n<=10; n++)           // n = tabeller.
                {
                    System.out.println(n + "- tabellen: ");
                    
                        for (int m = 1; m<=10; m++)   // m = tal der skal ganges med n.
                    
                     System.out.println(n + " * " + m + " er " + n*m);
                     
                     System.out.println();     
                
                }
                    
                     
            
            
	}
}
