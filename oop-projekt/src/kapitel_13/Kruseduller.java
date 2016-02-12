package kapitel_13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Kruseduller extends JPanel
                         implements MouseListener, MouseMotionListener
{
	public Kruseduller()
	{
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	Point punkt;

	public void mousePressed(MouseEvent h�ndelse) // kr�ves af MouseListener
	{
		punkt = h�ndelse.getPoint();
	}

	public void mouseDragged(MouseEvent h�ndelse) // kr�ves af MouseMotionListener
	{
		Point gammeltPunkt = punkt;
		punkt =	 h�ndelse.getPoint();
		Graphics g = getGraphics();
		g.drawLine(gammeltPunkt.x, gammeltPunkt.y, punkt.x, punkt.y);
	}

	public void mouseReleased (MouseEvent h�ndelse){} // kr�ves af MouseListener
	public void mouseClicked (MouseEvent event) {}    // kr�ves af MouseListener
	public void mouseEntered (MouseEvent event) {}    // kr�ves af MouseListener
	public void mouseExited (MouseEvent event) {}     // kr�ves af MouseListener
	public void mouseMoved (MouseEvent h�ndelse){} //kr�ves af MouseMotionListener
}