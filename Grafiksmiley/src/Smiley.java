import java.awt.*;
import javax.swing.*;
// lave smiley der åbner og lukker munden ligesom i pac-man


public class Smiley extends JPanel
{
	public void painComponent (Graphics g)
        {
            super.paintComponent(g);
            
            g.drawString("Test", 50,50);
        }
}


