package kapitel_12;
import java.awt.*;
public class Rektangel extends Rectangle implements Tegnbar
{
	public Rektangel(int x1, int y1, int width1, int height1)
	{
		super(y1,x1,width1,height1);
	}

	public void s�tPosition(int x1, int y1)
	{
		x = x1;
		y = y1;
	}

	public void tegn(Graphics g)
	{
		g.drawRect(x,y,width,height);
	}
}