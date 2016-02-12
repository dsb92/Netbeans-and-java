package kapitel_17;
import java.awt.*;

public class Firkant implements Runnable
{
	double x1, y1, b, h, bb, bh, fartx1, farty1;
	Graphics g;
        Graphics g1;
   
        public Firkant(Graphics g2, int x2, int y2)
        {
            g1 = g2;
            x1 = x2;
            y1 = y2;
            
            
            fartx1 = Math.random();
            farty1 = Math.random();
            Thread p = new Thread(this);
            p.start();
                    
           
        }

	public void run()
	{
		for (int tid=0; tid<5000; tid++)
		{
			// Tegn firkanten over med hvid på den gamle position	        
                        g1.setColor(Color.WHITE);
                        g1.drawRect((int) x1, (int) y1, 50, 50);        // Bredde og højde

			// Opdater positionen med farten
			
                        x1 = x1 + fartx1;
                        y1 = y1 + farty1;

			// Tegn firkanten med sort på den nye position                      
                        g1.setColor(Color.BLACK);
                        g1.drawRect((int) x1, (int) y1, 50, 50);        //Bredde og højde

			// Ændr boldens hastighed lidt nedad			
                        farty1 = farty1 + 0.1;

			// Hvis bolden er uden for det tilladte område skal den
			// rettes hen mod området
			
                        if (x1 <0) fartx1 = Math.abs(fartx1);	
                        if (x1 > 400) fartx1 = -Math.abs(fartx1);			
                        if (y1 < 150) farty1 = Math.abs(farty1);	
                        if (y1 > 250) farty1 = -Math.abs(farty1);

			// Vent lidt
			try { Thread.sleep(10); } catch (Exception e) {};
		}
	}
}