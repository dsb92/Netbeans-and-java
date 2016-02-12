import javax.swing.*;
// 


public class BenytSmiley
{
	public static void main(String[] arg) 
	{
	   
           Smiley panel = new Smiley();
            
           JFrame vindue = new JFrame("Pac-man");
           vindue.add( panel );
           vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
           vindue.setSize(400,300);
           vindue.setVisible(true);
 
	}
}


