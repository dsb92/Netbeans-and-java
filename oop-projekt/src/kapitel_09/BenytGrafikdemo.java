package kapitel_09;
import javax.swing.*;

public class BenytGrafikdemo
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame("Grafikdemo");     // opret et vindue p� sk�rmen
		vindue.add( new Grafikdemo() );               // vis panelet i vinduet
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagerer p� luk
		vindue.setSize(500,200);                      // s�t vinduets st�rrelse
		vindue.setVisible(true);                      // �bn vinduet
	}
}