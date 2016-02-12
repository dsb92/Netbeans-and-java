//12.6 Opgaver2: Tilf�je "ikke-Tegnbar't objekt" til tegnbarelisten.
// Se fejlmeddelese nederst. 
package kapitel_12;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class TegnbareObjekter_3 extends JPanel
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

	public TegnbareObjekter_3()
	{
		Stjerne s = new Stjerne();
		tegnbare.add(s);
		
                Point p = new Point();
                tegnbare.add(p);
                
		tegnbare.add( new Rektangel(10,10,30,30) );
		tegnbare.add( new Rektangel(15,15,20,20) );

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
}
