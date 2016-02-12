// 
import javax.swing.*;

public class BenytOpgave_5
{
	public static void main(String[] arg) 
	{
	    
        
            Opgave_5 panel = new Opgave_5();        // opret panelet

		JFrame vindue = new JFrame("Skak-spil");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagerer på luk
		vindue.setSize(400,330);                       // sæt vinduets størrelse
		vindue.setVisible(true); 
        
           
 
	}
}


