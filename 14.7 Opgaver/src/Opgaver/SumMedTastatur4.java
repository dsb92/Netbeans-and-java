// Opgave 2: Ret programmet, så det tæller antallet af gange, en sum blev påbegyndt. 
package Opgaver;

public class SumMedTastatur4
{
	public static void main(String[] arg)
	{
		Tastatur t = new Tastatur();
		boolean stop = false;
                int påbegyndtSum = 0;       //varibel påbegyndtSum erklæres som startværdi til 0

		while (!stop)
		{
			System.out.print("Hvor mange tal vil du lægge sammen? ");
			try 
			{
				double antalTal = t.læsTal();
				double sum = 0;
                                påbegyndtSum++; // antallet af sum tælles op hver gang
                                

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
              System.out.println("Antal gange en sum blev påbegyndt: " + påbegyndtSum);   // variablen placeres uden for while-løkken 
	}
}


