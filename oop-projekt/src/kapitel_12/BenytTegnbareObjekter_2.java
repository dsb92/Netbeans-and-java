//12.6 Opgaver1: Version 2 med Hus objektet indført.
package kapitel_12;
import javax.swing.*;
public class BenytTegnbareObjekter_2
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "TegnbareObjekter 2" ); 
		vindue.add( new TegnbareObjekter_2() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(300,300);
		vindue.setVisible(true);
		while (true) {
			try { Thread.sleep(3000); } catch (Exception e) {}// vent 3 sek.
			vindue.repaint();                                 // gentegn skÃ¦rm
		}
	}	
}