package kapitel_13;
import java.awt.*;
import java.awt.event.*;

public class Muselytter implements MouseListener
{
	public void mousePressed(MouseEvent h�ndelse)	// kr�ves af MouseListener
	{
		Point trykpunkt = h�ndelse.getPoint();
		System.out.println("Mus trykket ned i "+trykpunkt);
	}

	public void mouseReleased(MouseEvent h�ndelse)	// kr�ves af MouseListener
	{
		Point slippunkt = h�ndelse.getPoint();
		System.out.println("Mus sluppet i "+slippunkt);
	}

	public void mouseClicked(MouseEvent h�ndelse)	// kr�ves af MouseListener
	{
		System.out.println("Mus klikket i "+h�ndelse.getPoint());
	}

	//--------------------------------------------------------------------
	//  Ubrugte hændelser (skal defineres for at implementere MouseListener)
	//--------------------------------------------------------------------
	public void mouseEntered (MouseEvent event) {}	// kræves af MouseListener
	public void mouseExited (MouseEvent event) {}	// kræves af MouseListener
}