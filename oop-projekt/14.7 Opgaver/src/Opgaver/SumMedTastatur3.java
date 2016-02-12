// Opgave 1: Flyt try-catch sådan så programmet smider summet væk og prøver igen UDEN
// at spørge brugeren
package Opgaver;

public class SumMedTastatur3
{
	public static void main(String[] arg)
	{
		Tastatur t = new Tastatur();
		boolean stop = false;
                

		while (!stop)
		{
			System.out.print("Hvor mange tal vil du lægge sammen? ");
			try 
			{
				double antalTal = t.læsTal();
				double sum = 0;
                                

				for (int i=0; i<antalTal; i=i+1)
				{
					System.out.print("Indtast tal: ");
					sum = sum + t.læsTal();
				}
				System.out.println("Summen er: "+sum);                             
                                System.out.print("Vil du prøve igen (j/n)? ");  // Er blevet flyttet op fra catch-blokken ind i try                                
                                if ("n".equals(t.læsLinje())) stop = true;      // --||--
			} 	
                        
                        catch (Exception u) 
                        {
				System.out.println("Indtastningsfejl - " + u);
			}
			  
		}
                
	}
}


