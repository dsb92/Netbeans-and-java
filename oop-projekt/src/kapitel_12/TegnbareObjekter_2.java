// 12.6. Opgaver1: tilf�jer hus-objektet og s�tter dens v�rdier. 
package kapitel_12;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class TegnbareObjekter_2 extends JPanel
{
	ArrayList<Tegnbar> tegnbare = new ArrayList<Tegnbar>();
	GrafiskRaflebaeger b�ger = new GrafiskRaflebaeger();

	public void s�tPositioner()
	{
		for (Tegnbar t : tegnbare) {
			int x = (int) (Math.random()*200);
			int y = (int) (Math.random()*200);
			t.s�tPosition(x,y);
		}
	}

	public TegnbareObjekter_2()
	{
		Stjerne s = new Stjerne();
		tegnbare.add(s);
		
		tegnbare.add( new Rektangel(10,10,30,30) );
		tegnbare.add( new Rektangel(15,15,20,20) );

		Hus h = new Hus(50,100,100,100);
                tegnbare.add(h);
                
                GrafiskTerning t;
		t = new GrafiskTerning();
		b�ger.tilf�j(t);
		tegnbare.add(t);

		t = new GrafiskTerning();
		b�ger.tilf�j(t);
		tegnbare.add(t);

		tegnbare.add(b�ger);

		s�tPositioner();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		s�tPositioner();

		for (Tegnbar t : tegnbare) t.tegn(g);
	}
}