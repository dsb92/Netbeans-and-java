// Skriv et "Palindrom"


public class Opgave_6
{
	public static void main(String[] arg) 
	{
	   String s1, s2;
           s1 = "regninger";
           
           s2 = "reg" + s1.substring(3);
           
           
           if (s1.equals(s2))
               System.out.println("s1 og s2 er ens.");
           else System.out.println("s1 og s2 er IKKE ens.");
      
 
	}
}


