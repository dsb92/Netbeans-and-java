package kapitel_12;
import kapitel_04.*;
import java.awt.*;
public class GrafiskRaflebaeger extends Raflebaeger implements Tegnbar
{
	public GrafiskRaflebaeger()
	{
		super(0);
	}

	public void s�tPosition(int x, int y)
	{
		// tom metodekrop	
	}

	public void tegn(Graphics g)
	{
		g.drawOval(80,20,90,54);
		g.drawLine(150,115,170,50);
		g.drawLine(100,115,80,50);
		g.drawArc(100,100,50,30,180,180);
	}
}