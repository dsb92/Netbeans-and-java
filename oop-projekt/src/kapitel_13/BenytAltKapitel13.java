package kapitel_13;
import javax.swing.*;
public class BenytAltKapitel13
{
	public static void main(String[] arg)
	{
		JTabbedPane faneblade = new JTabbedPane();
		faneblade.add("1 LytTilMusen", new LytTilMusen());
		faneblade.add("2 Linjetegning", new Linjetegning());
		faneblade.add("3 Linjetegning2", new Linjetegning2());
		faneblade.add("4 Kruseduller", new Kruseduller());
		faneblade.add("5 LytTilKnap", new LytTilKnap());
		faneblade.add("6 Tastetryk", new Tastetryk());
                faneblade.add("7 Mus", new Mus());  // Tilf�jet min egen. 
                faneblade.add("8 LytTilKnap_2", new LytTilKnap_2());
		JFrame vindue = new JFrame("BenytAltKapitel13");
		vindue.add( faneblade );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagerer p� luk
		vindue.pack();                  // lad vinduet selv bestemme sin st�rrelse
		vindue.setVisible(true);                                  // �bn vinduet
	}
}