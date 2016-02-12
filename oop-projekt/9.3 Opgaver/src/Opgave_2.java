import java.awt.*;
import javax.swing.*;
// Skiv noget ud når paintComponent() bliver kaldt ( med System.out.println()) og se hvornår
// paintComponent() bliver kaldt (orøv f.eks. at minimere og gendanne vinduet eller dække det halvt over


public class Opgave_2 extends JPanel
{
	public void paintComponent(Graphics g)
	{
		// Herunder referer g til et Graphics-objekt man kan tegne med

		super.paintComponent(g);                // tegn først baggrunden på panelet
                
                System.out.println("Udskriv noget her! - testen");

		//g.drawLine(0,0,50,50);        //første trekant
                g.drawLine(50,50,370,50);
                g.drawLine(370,50,90,270);
                g.drawLine(330,270,50,50);
             
                g.drawLine(210,10,90,270);                    //anden trekant
                g.drawLine(210,10,330,270);
                
                g.drawArc(30,10,370,270,0,360);
             
                Font skrifttype = new Font ("Serif", Font.BOLD, 18);
                g.setFont(skrifttype);  
                g.setColor(Color.YELLOW);

		g.drawString("Hej grafiske verden!",135,265);
                
                
                
          }
          
}


