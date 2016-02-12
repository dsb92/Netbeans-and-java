//Skriv Alder2 om til at indeholde flere aldersgrænser
public class Opgave_1
{
	public static void main(String[] arg) 
	{
           int alder;
           alder = 15;
           
           if (alder >=18)
               System.out.println("Du er myndig");
           else if (alder >=13) System.out.println("Du må ikke ryge, da du er for ung");
           else if (alder >=2)  System.out.println("Du er stadig et barn og skal omgås med en forældre");
           
            
            System.out.println("Du er " +alder+ " år");
	}
}
	
                