package Opgave_1;
import kapitel_04.*;
/* Lav en LudoTerning, der arver fra Terning. 
   Tilsidesæt(omdefinere) to String() med en, der giver "*" på en 3'er og
   globus på en 4er (vink: kopiér Terning's toString()-metode over i LudoTerning
   og ret i den). Afprøv klassen
 */ 


public class LudoTerning extends Terning
{
	// tilsidesæt toString()
    public String toString()
	{
		if(værdi ==3) return "*";      //hvis øjne viser 3, returneres svaret med "*"
                if(værdi ==4) return "globus"; //hvis øjne viser 4, returneres svaret med "globus"
                String svar = ""+værdi;
                return svar;

	}
}


