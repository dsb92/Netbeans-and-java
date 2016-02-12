package Opgave_2;
// Skriv et program, der rafler med fire terninger, indtil der slås tre eller fire 6'er. 
// Udskriv dernæst antal øjne for hver terning.


public class BenytTerning2
{
	public static void main(String[] arg) 
	{
	   Terning terning1 = new Terning();
           Terning terning2 = new Terning();
           Terning terning3 = new Terning();
           Terning terning4 = new Terning();
           
           int antalSlag = 1;
           
           while (terning1.værdi !=6 && terning1.værdi ==6 || terning2.værdi !=6 || terning3.værdi !=6 || terning4.værdi !=6)
           {
               System.out.println("Antal slag: "+antalSlag+" Terning 1: "+terning1.værdi+" Terning 2: "+terning2.værdi+" Terning 3: "+terning3.værdi+" Terning 4: "+terning4.værdi);
               antalSlag++;
               terning1.kast();
               terning2.kast();
               terning3.kast();
               terning4.kast();
            
           } 
              System.out.println("Antal slag: "+antalSlag+" Terning 1: "+terning1.værdi+" Terning 2: "+terning2.værdi+" Terning 3: "+terning3.værdi+" Terning 4: "+terning4.værdi);
         
              System.out.println("Vi slog tre eller fire 6'er efter: "+antalSlag+" slag.");
        
       }
       
	}



