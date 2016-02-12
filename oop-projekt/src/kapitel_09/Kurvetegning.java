package kapitel_09;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Kurvetegning extends JPanel
{
	ArrayList<Color> farver;//objektvariabel kendt i konstrukt�r og paintComponent
	int forskydning = 50;  // en forskydning i farvevalget (bruges i afsnit 9.4.1)

	public Kurvetegning()  // forbered punkterne i konstrukt�ren
	{
		farver = new ArrayList<Color>();
		for (int i=0; i<400; i++)
		{
			Color farve = new Color(i%256, (i*2)%256, (i*4)%256);
			farver.add(farve);
		}

		JFrame vindue = new JFrame("Kurvetegning");   // opret et vindue p� sk�rmen
		vindue.add( this );                           // vis dette panel i vinduet
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // reagerer p� luk
		vindue.setSize(400,300);                      // s�t vinduets st�rrelse
		vindue.setVisible(true);                      // �bn vinduet
	}

	public void paintComponent(Graphics g) // tegn punkterne
	{
		super.paintComponent(g);            // tegn f�rst baggrunden p� panelet

		g.drawString("Kurvetegning", forskydning%400, forskydning%300);
		for (int x=0; x<farver.size(); x++)
		{
			int y = 140 - (int) (130*Math.sin(0.05*x));
			int i = (x+forskydning)%400;
			Color farve = farver.get(i);
			g.setColor(farve);
			g.fillRect(x, y, 5, 5);
		}
	}
}