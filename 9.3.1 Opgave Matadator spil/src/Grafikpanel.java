
import java.awt.*;
import javax.swing.*;

public class Grafikpanel extends JPanel
{
	public static void main (String [] arg)
	{
		Grafikpanel panel = new Grafikpanel();
                
                Dimension d = panel.getSize();
                System.out.println("Panelet har størrelsen: "+d);
	}
}