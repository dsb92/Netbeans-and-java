package kapitel_13;
import java.awt.event.*;
public class Linjelytter2 extends MouseAdapter
{
	public Linjetegning panelet;

	public void mousePressed(MouseEvent h�ndelse)
	{
		panelet.trykpunkt = h�ndelse.getPoint();
	}

	public void mouseReleased(MouseEvent h�ndelse)
	{
		panelet.slippunkt = h�ndelse.getPoint();
		panelet.repaint();
	}
}