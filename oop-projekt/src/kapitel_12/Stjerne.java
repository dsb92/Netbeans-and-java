package kapitel_12;
import java.awt.*;
public class Stjerne implements Tegnbar
{
	private int posX, posY;

	public void s�tPosition(int x, int y)   // kr�ves af interfacet Tegnbar
	{
		posX = x;
		posY = y;
	}

	public void tegn(Graphics g)            // kr�ves af interfacet Tegnbar
	{
		g.drawString("*",posX,posY);
	}
}