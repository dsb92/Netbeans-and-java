package kapitel_02;
// Et lidt anden version af grafiske indtastningsvinduer


public class BenytIndtastningsvindue_2
{
	public static void main(String[] arg) 
	{
	   String str = javax.swing.JOptionPane.showInputDialog("Indtast et grim");
           int svar = Integer.parseInt(str);
           
           System.out.println("Du indtastede "+svar+", det dobbelte er: " + 2*svar);
           
           str = javax.swing.JOptionPane.showInputDialog("Indtast et kommatal");
           double svar2 = Double.parseDouble(str);
           
           System.out.println("Du indtastede "+svar+", det halve dumme er: " + 0.5*svar2);
           
      
	}
}


