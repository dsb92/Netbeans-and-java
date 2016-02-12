package Opgave_1;
// Skriv et program, der rafler med to terning-objekter, indtil der slås to 6'er


public class BenytTerning 
{
	public static void main(String[] arg) 
	{
	   Terning t, t1;
           t = new Terning();
           t1 = new Terning();
  
           int antalSlag = 1;
           
           while (t.værdi !=6 || t1.værdi !=6)
           {
               
               
               System.out.println("Antal slag: "+antalSlag+" Terning 1: "+t.værdi+" Terning 2: "+t1.værdi);
               antalSlag++;
               t.kast();
               t1.kast();
               
           }
           
           System.out.println("Antal slag: "+antalSlag+" Terning 1: "+t.værdi+" Terning 2: "+t1.værdi);
           System.out.println("Vi slog to 6'er efter "+antalSlag+" slag");
           
 
	}
}


