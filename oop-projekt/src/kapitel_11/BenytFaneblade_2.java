package kapitel_11;
import javax.swing.*;
// min egen version af JTabbedPane fra bogen.


public class BenytFaneblade_2
{
	public static void main(String[] arg) 
	{
	   JTabbedPane faneblade = new JTabbedPane();

		faneblade.add("Grafikpanel", new Grafikpanel());
		faneblade.add("Grafikpanel2", new Grafikpanel_2());
		faneblade.add("PanelMedBorderLayout", new PanelMedBorderLayout());
		faneblade.add("PanelMedGridBagLayout", new PanelMedGridBagLayout());

		JFrame vindue = new JFrame("Faneblade");
		vindue.add( faneblade );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagerer på luk
		vindue.pack();                  // lad vinduet selv bestemme sin størrelse
		vindue.setVisible(true);                                  // Åbn vinduet
           
 
	}
}


