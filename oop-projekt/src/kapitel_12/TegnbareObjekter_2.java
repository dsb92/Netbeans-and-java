// 12.6. Opgaver1: tilføjer hus-objektet og sætter dens værdier. 
package kapitel_12;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class TegnbareObjekter_2 extends JPanel
{
	ArrayList<Tegnbar> tegnbare = new ArrayList<Tegnbar>();
	GrafiskRaflebaeger bæger = new GrafiskRaflebaeger();

	public void sætPositioner()
	{
		for (Tegnbar t : tegnbare) {
			int x = (int) (Math.random()*200);
			int y = (int) (Math.random()*200);
			t.sætPosition(x,y);
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
		bæger.tilføj(t);
		tegnbare.add(t);

		t = new GrafiskTerning();
		bæger.tilføj(t);
		tegnbare.add(t);

		tegnbare.add(bæger);

		sætPositioner();
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		sætPositioner();

		for (Tegnbar t : tegnbare) t.tegn(g);
	}
}