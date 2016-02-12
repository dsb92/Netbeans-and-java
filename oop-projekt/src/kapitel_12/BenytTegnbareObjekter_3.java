//12.6 Opgaver2: Version 3 med et ikke-TegnbareObjekt indført i tegnbarelisten.
// Se fejlmeddelsen i TegnbareObjekter_3 for opgave 2)
package kapitel_12;
import javax.swing.*;
public class BenytTegnbareObjekter_3
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "TegnbareObjekter 3" ); 
		vindue.add( new TegnbareObjekter_3() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(300,300);
		vindue.setVisible(true);
		while (true) {
			try { Thread.sleep(3000); } catch (Exception e) {}// vent 3 sek.
			vindue.repaint();                                 // gentegn skÃ¦rm
		}
	}	
}