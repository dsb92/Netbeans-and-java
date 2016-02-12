
import javax.swing.*;

public class BenytGrafikpanel
{
	public static void main(String[] arg)
	{
		Grafikpanel panel = new Grafikpanel();        // opret panelet

		JFrame vindue = new JFrame("Grafikpanel");    // opret et vindue p� sk�rmen
		vindue.add( panel );                          // vis panelet i vinduet

		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagerer p� luk
		vindue.setSize(350,70);                       // s�t vinduets st�rrelse
		vindue.setVisible(true);                      // �bn vinduet
	}
}