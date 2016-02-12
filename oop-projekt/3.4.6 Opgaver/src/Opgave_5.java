// Skriv et program, der finder og fjerner alle forekomster af ordet "måske" fra en tekst, uanset om det er skrevet med store eller små bogstaver.


public class Opgave_5
{
	public static void main(String[] arg) 
	{
	   String s1,s2, s3, s4;
           s1 = "måskeMåske med måske stort måske eller måske småt";
           
           s2 = "måske";
     
           s3 = "s2.toUpperCase()";
           
           s4 = "s3.toLowerCase()";
           
           int i;
           i = s1.indexOf(s2);
     
           while(i!=-1)
               
           {
               String før,efter;
               før = s1.substring(0,i);
               efter = s1.substring(i+5);
               
               s1 = før+efter;
               s3=s4;
               
               System.out.println(s1);
             
               i =s1.indexOf(s2);
          
           }
        
	}
}


