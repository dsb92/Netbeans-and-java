package kapitel_03;
// BenytStrenge.java
// Viser brugen af String-klassen og dens metoder.
public class BenytStrenge
{
	public static void main(String[] arg)
	{
		String s;
		s = "Ude godt";
		System.out.println("Strengen s indeholder: "+s);
		
                int strengensLængde;
                    strengensLængde = s.length();
                
                System.out.println("s er "+strengensLængde+" tegn lang*"); //Mellemvariablen    
                
                System.out.println("s er "+s.length()+" tegn lang");       
        
                System.out.println("s med store bogstaver: "+s.toUpperCase());
		System.out.println("Tekst på plads nummer 4 og frem: "+s.substring(4));
		System.out.println("Det første g er på plads nummer: "+s.indexOf("g"));
	}
}
//Evt. Mellemvariabler. 
