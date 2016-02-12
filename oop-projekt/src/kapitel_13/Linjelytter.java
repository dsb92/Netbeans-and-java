package kapitel_13;
import java.awt.event.*;

public class Linjelytter implements MouseListener
{
	public Linjetegning panelet;                 // Reference til panelet

	public void mousePressed(MouseEvent h�ndelse)  // kr�ves af MouseListener
	{
		panelet.trykpunkt = h�ndelse.getPoint();
	}

	public void mouseReleased(MouseEvent h�ndelse) // kr�ves af MouseListener
	{
		panelet.slippunkt = h�ndelse.getPoint();
		panelet.repaint(); // Gentegn panelet lige om lidt.
	}

	//--------------------------------------------------------------------
	//  Ubrugte h�ndelser (skal defineres for at implementere interfacet)
	//--------------------------------------------------------------------
	public void mouseClicked(MouseEvent event) {}  // kr�ves af MouseListener
	public void mouseEntered (MouseEvent event) {} // kr�ves af MouseListener
	public void mouseExited (MouseEvent event) {}  // kr�ves af MouseListener
}