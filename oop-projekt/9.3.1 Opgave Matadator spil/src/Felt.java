import java.awt.*;
/**
 * Superklassen for alle matadorspillets felter
 */
public class Felt
{
	String navn;

	public void passeret(Spiller sp)  // kaldes når spiller passerer dette felt
	{
		System.out.println(sp.navn+" passerer "+navn);
	}

	public void landet(Spiller sp)    // kaldes når spiller lander på dette felt
	{
	}

	Point pos = new Point();
	public void tegn(Graphics g)
	{
		g.setColor(Color.black);
		g.drawString(navn,pos.x,pos.y);
	}


	public void tegnBil(Graphics g, Spiller s)
	{
		g.setColor(s.farve);
		g.drawString(s.navn,pos.x,pos.y-10);
		g.drawRoundRect(pos.x,pos.y-11,40,12,5,5);
	}
}
