// Skriv et program, der udskriver datoen for i morgen, om en uge og om et år.
import java.util.*; // Date-klassen er i pakken java.util

public class Opgave_2
{
	public static void main(String[] arg) 
	{
	    Date iDag; 
            Date iMorgen;
            Date om_en_uge;
            Date om_et_år;
            
            iDag = new Date();
            iMorgen = new Date(112,2,5,19,47);
            om_en_uge = new Date(112,2,11,19,47);
            om_et_år = new Date (113,2,5,19,47);
            
            System.out.println("Datoen i dag er: " +iDag);
            System.out.println("Datoen i morgen er: " +iMorgen.toString());
            System.out.println("Datoen om en uge er: " +om_en_uge);
            System.out.println("Datoen om et år er: " +om_et_år);
            
            
           
 
	}
}


