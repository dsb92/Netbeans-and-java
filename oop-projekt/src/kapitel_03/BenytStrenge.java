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
		
                int strengensL�ngde;
                    strengensL�ngde = s.length();
                
                System.out.println("s er "+strengensL�ngde+" tegn lang*"); //Mellemvariablen    
                
                System.out.println("s er "+s.length()+" tegn lang");       
        
                System.out.println("s med store bogstaver: "+s.toUpperCase());
		System.out.println("Tekst p� plads nummer 4 og frem: "+s.substring(4));
		System.out.println("Det f�rste g er p� plads nummer: "+s.indexOf("g"));
	}
}
//Evt. Mellemvariabler. 
