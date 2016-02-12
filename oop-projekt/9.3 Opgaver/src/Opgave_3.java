// Lav et program, der viser et digitalur som tekst (vink: Brug et Date-objekt).
//Sørg for at uret opdateres hvert sekund (vink: se 9.4.1, Simple animationer)
// Facitliste:
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Opgave_3 extends Frame
{
	Date d = new Date();
	//GregorianCalendar k = new GregorianCalendar();

	private void tegnStreg(Graphics g, double v, double l)
	{
		v = v * Math.PI * 2;
		g.drawLine(400,300,400+(int)(Math.cos(v)*l), 300+(int)(Math.sin(v)*l));
	}

	public void paint(Graphics g)
	{
		// genbrug det samme Date-objekt, opdater bare dets tid
		d.setTime(System.currentTimeMillis());
		//k.setTime(d);

		g.drawOval(100,35,600,600);
		tegnStreg(g, d.getSeconds()/60.0, 300);
		tegnStreg(g, d.getMinutes()/60.0, 250);
		tegnStreg(g, d.getHours()/24.0, 150);

		//tegnStreg(g, k.get(Calendar.SECOND)/60.0, 300);
		//tegnStreg(g, k.get(Calendar.MINUTE)/60.0, 250);
		//tegnStreg(g, k.get(Calendar.HOUR)/12.0, 150);
		repaint(1000);
	}

	public static void main(String[] arg)
	{
		Opgave_3 vindue = new Opgave_3();   // opret vinduet
           
                vindue.setSize(750,650);  
                vindue.setVisible(true); 
	}
}
