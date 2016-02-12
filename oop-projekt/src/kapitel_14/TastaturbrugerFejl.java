// 14.3.1 Fange undtagelser eller sende dem videre
import java.io.*;

public class TastaturbrugerFejl
{
	public static void main(String[] arg) // throws IOException
	{
	   BufferedReader ind = new BufferedReader(new InputStreamReader(System.in));
           String linje;
           try
           {
           linje = ind.readLine();  
           System.out.println("Du skrev: "+linje);
           } 
           catch (Exception u) 
           {
               u.printStackTrace();
           }
           
 
	}
}


//Enten fanges med try-catch i metodekroppen eller 
//sendes direkte til kalderes med throws i metodehovedet.