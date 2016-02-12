
import javax.swing.*;

public class BenytOpgave_1
{
	public static void main(String[] arg)
	{
		Opgave_1 panel = new Opgave_1();        // opret panelet

		JFrame vindue = new JFrame("Grafikpanel ver. 2");    // opret et vindue på skærmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagerer på luk
		vindue.setSize(400,330);                       // sæt vinduets størrelse
		vindue.setVisible(true);                      //åbn vinduet
	}
}