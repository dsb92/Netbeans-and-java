// Ændr Grafikpanel til at tegne nogle andre figurer.
import java.awt.*;
import javax.swing.*;

public class Opgave_1 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		// Herunder referer g til et Graphics-objekt man kan tegne med

		super.paintComponent(g);                // tegn først baggrunden på panelet

		//g.drawLine(0,0,50,50);        //første trekant
                g.drawLine(50,50,370,50);
                g.drawLine(370,50,90,270);
                g.drawLine(330,270,50,50);
             
                g.drawLine(210,10,90,270);                    //anden trekant
                g.drawLine(210,10,330,270);
                
                g.drawArc(30,10,370,270,0,360);

                
                //Polygon p = new Polygon();
                //p.addPoint(40,10);  p.addPoint(150,0);  //frem
                //p.addPoint(65,40);  p.addPoint(40,10); 
               
                
                // g.fillOval(40,10,300,300);
    
		
                
                Font skrifttype = new Font ("Serif", Font.BOLD, 18);
                g.setFont(skrifttype);  
                g.setColor(Color.YELLOW);

		g.drawString("Hej grafiske verden!",135,265);
	}
}


