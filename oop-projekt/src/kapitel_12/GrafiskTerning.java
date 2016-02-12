package kapitel_12;
import kapitel_04.*;
import java.awt.*;
public class GrafiskTerning extends Terning implements Tegnbar
{
	int x, y;

	public void s�tPosition(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	private void ci(Graphics g, int i, int j)
	{
		g.fillOval(x+1+10*i,y+1+10*j,8,8);             // Tegn fyldt cirkel
	}

	public void tegn(Graphics g)
	{
		int � = v�rdi;
		g.drawRect(x,y,30,30);                         // Tegn kant

		if (�==1) ci(g,1,1);                           // Tegn 1-6 øjne
		else if (�==2) { ci(g,0,0); ci(g,2,2); }
		else if (�==3) { ci(g,0,0); ci(g,1,1); ci(g,2,2); }
		else if (�==4) { ci(g,0,0); ci(g,0,2); ci(g,2,0); ci(g,2,2); }
		else if (�==5) { ci(g,0,0); ci(g,0,2); ci(g,2,0); ci(g,2,2); ci(g,1,1); }
		else {ci(g,0,0); ci(g,0,1); ci(g,0,2); ci(g,2,0); ci(g,2,1); ci(g,2,2); }
	}
}