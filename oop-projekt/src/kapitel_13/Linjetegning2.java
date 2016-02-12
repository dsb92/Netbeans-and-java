package kapitel_13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Linjetegning2 extends JPanel implements MouseListener
{
	private Point trykpunkt;
	private Point slippunkt;

	public Linjetegning2()
	{
		this.addMouseListener(this);
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);            // tegn f�rst baggrunden på panelet
		g.drawString("1:"+trykpunkt+"  2:"+slippunkt,10,10);
		if (trykpunkt != null && slippunkt != null)
		{
			g.setColor(Color.BLUE);
			g.drawLine(trykpunkt.x, trykpunkt.y, slippunkt.x, slippunkt.y);
		}
	}

	public void mousePressed(MouseEvent h�ndelse)	// kr�ves af MouseListener
	{
		trykpunkt = h�ndelse.getPoint();
	}

	public void mouseReleased(MouseEvent h�ndelse)	// kr�ves af MouseListener
	{
		slippunkt = h�ndelse.getPoint();
		repaint();
	}

	//--------------------------------------------------------------------
	//  Ubrugte h�ndelser (skal defineres for at implementere interfacet)
	//--------------------------------------------------------------------
	public void mouseClicked(MouseEvent event) {}	// kr�ves af MouseListener
	public void mouseEntered (MouseEvent event) {}	// kr�ves af MouseListener
	public void mouseExited (MouseEvent event) {}	// kr�ves af MouseListener
}