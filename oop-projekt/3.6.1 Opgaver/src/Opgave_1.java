// Ret Datoer-programmet sådan, at Jacobs fødselsdato ikke går tabt (opret et tredje objekt, i stedet for at ændre i jacob-objektet
// Datoer.java
// Viser brugen af Date-klassen og dens metoder.

import java.util.*; // Date-klassen er i pakken java.util

public class Opgave_1
{
	public static void main (String[] arg)
	{
		Date netopNu;
		Date jacob;
                Date halvAlder;

		netopNu = new Date();                    // dags dato og tidspunkt lige nu
		jacob = new Date(71,0,1,12,00);          // 1. januar 1971 kl. 12:00
        
		System.out.println("Dags dato: "+netopNu.toString());
		System.out.println("Jacob blev født "+jacob); // .toString() implicit

		// Lad os regne Jacobs alder ud (i millisekunder)
		long nuMs;
		long jacobMs;
		long alderMs;

		nuMs = netopNu.getTime();
		jacobMs = jacob.getTime();
		alderMs = nuMs - jacobMs;
                halvAlder = new Date(nuMs-alderMs/2);
                
               
 
		// Hvornår var han halvt så gammel?	
		System.out.println("Jacob var halvt så gammel " + halvAlder);
	}
}