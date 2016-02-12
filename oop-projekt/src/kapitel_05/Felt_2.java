package kapitel_05;

//12.6 opgave: Ã†ndr Felt til at vÃ¦re et interface

import java.awt.*;
/** Superklassen for alle matadorspillets felter */
public interface Felt_2 
{
     
	public void passeret(Spiller sp); 
	public void landet(Spiller sp);   
        public void besked (String besked);        
        public boolean spørgsmål (String spørgsmÃ¥l);        
        public void transaktion(double kr); 
        public void betal(Spiller modtager, double kr); 
	
}