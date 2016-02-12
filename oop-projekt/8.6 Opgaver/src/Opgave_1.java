// Lav et program, der simulerer kast med 6 terninger. Der udføres f.eks. 100 kast. 
// Optæl i et array hyppigheden af summen af øjenantallene.

import java.util.*;

public class Opgave_1
{
	public static void main(String[] arg) 
	{
	   Raflebaeger bæger = new Raflebaeger(6);
           int [] hyp = new int [37];      //indgangen 6 til 36 bruges.
           
           
           for( int antalSlag = 0; antalSlag<100; antalSlag++)
        
           {
               bæger.ryst();
           
           hyp[bæger.sum()]++;
                   
           }

           for(int v=6; v<=36; v++)
               
               System.out.println("Antal slag med "+v+" øjne : " + hyp[v]);
   
	}
}


