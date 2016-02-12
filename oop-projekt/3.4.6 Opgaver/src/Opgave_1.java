// Skriv et program, der finder positionen af det første mellemrum i en streng. (vink: Brug metoden indexOf(" "))


public class Opgave_1
{
	public static void main(String[] arg) 
	{

            String s;
            s = "Mellemrum er godt";
            
            int i = s.indexOf(" ");
            
            if (i==-1)
                
            {
                System.out.println("Der er ingen mellemrum");
            }
            
            else
            {
                System.out.println("Der er mellemum i nummer: " +i);
            }
            
     
            
	}
}

            
           
        
 
	



