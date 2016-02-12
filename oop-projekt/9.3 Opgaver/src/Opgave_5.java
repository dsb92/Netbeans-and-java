// Ændr Grafikpanel, så den tegner et skakbræt med sorte og hvide felter. 
// Et tårn og en bonde tegnes derefter på brættet
// Skitse:
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Opgave_5 extends JPanel
{
	public void paintComponent (Graphics g)
        {
            
            super.paintComponent(g);                // tegn først baggrunden på panelet
         
            
            g.drawRect(50,50,300,200);
            g.drawRect(100,50,0,200);
            g.drawRect(150,50,0,200);
            g.drawRect(200,50,0,200);      
            g.drawRect(250,50,0,200);
            g.drawRect(300,50,0,200);
    
            
            g.drawRect(50,100,300,100);
            g.drawRect(50,150,300,100);
            
            g.fillRect(50,200,50,50);       //farv felterne
            g.fillRect(50,100,50,50);
            g.fillRect(100,50,50,50);
            g.fillRect(100,150,50,50);
            g.fillRect(150,100,50,50);
            g.fillRect(150,200,50,50);
            g.fillRect(200,50,50,50);
            g.fillRect(200,150,50,50);
            g.fillRect(250,100,50,50);
            g.fillRect(250,200,50,50);
            g.fillRect(300,50,50,50);
            g.fillRect(300,150,50,50);
          
            g.getColor();
            this.setBackground(Color.WHITE);
            
        }
        
       
       
}


