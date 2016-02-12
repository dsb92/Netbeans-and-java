package kapitel_17;
import java.awt.*;
import javax.swing.*;

public class Opgave_1_17_3
{
	public static void main(String[] arg)
	{
		JFrame f = new JFrame();
		f.setSize(400,300);
		f.setBackground(Color.WHITE);
		f.setVisible(true);
		Graphics g = f.getGraphics();
                Graphics g1 = f.getGraphics();
		new Bold(g,  0, 0);         //Start position for animation
		new Bold(g, 50,10);
		new Bold(g,100,50);
		new Bold(g,150,90);
                new Firkant(g1,  0, 150);     //Start position for animation, kræver kun x og y selvom det er en rektangel
                new Firkant(g1,  50,200);     // Vil have, at firkanterne starter efter y-position ved 150 (Kig på y-grænse ved Boldsklassen), sådan så
                new Firkant(g1,  100,250);    // figuerne ikke blandes sammen, og kører ind over hinanden... 
                new Firkant(g1,  150,300);
	}
}