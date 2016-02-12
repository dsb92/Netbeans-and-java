//Skriv et program, der fjerner den første forekomst af ordet "måske" fra en teskt. 
//Ændre derefter programmet, så det fjerner alle forekomster af ordet (brug en løkke)


public class Opgave_4
{
	public static void main(String[] arg) 
	{
	   String s1, s2;
           
           s1 = "måskeOrdet måske betyder måske et måske ja måske og måske nej";
           s2 = "måske";            //"måske" er sæt til at være en variabel
           
           int i;
           i = s1.indexOf(s2);  //hvor alle måske'er er i s1.
           
           while(i!=-1)
           {
           
           String før,efter;
           før = s1.substring(0,i);   // fra start til slut af ordet "måske"
           efter = s1.substring(i+5); // fra måske til næste streng i sætningen.
           
           s1 = før+efter;  // sætter det sammen. 
           
           System.out.println(s1);
           
           i = s1.indexOf(s2);
           
           }
       
	}
}


