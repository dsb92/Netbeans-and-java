package kapitel_12;
import java.applet.*;
import java.awt.*;
import java.util.*;


class Hus implements Tegnbar
{
	int h�jde;
        int bredde;
        int x;
        int y;

        public Hus(int x1, int y1, int width1, int height1)
	{
		x = x1;
                y = y1;
                h�jde = height1;
                bredde = width1;
	}

	public void s�tPosition(int x1, int y1)
	{
		x = x1;
		y = y1;
	}

	public void tegn(Graphics g)
	{	
                g.drawRect(x, (int) (y+h�jde/3), bredde, (int) (h�jde*2/3));
                g.drawLine(x, (int) (y+h�jde/3), (int) (x+bredde/3), y);
                g.drawLine((int) (x+bredde/3), y, (int) (x+bredde*2/3), y);
                g.drawLine((int) (x+bredde*2/3), y, x+bredde, (int) (y+h�jde/3));
	}
}



