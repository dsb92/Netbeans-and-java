package Opgave_4;

//12.6 opgave: Ændr Felt til at være et interface

import java.awt.*;
/** Superklassen for alle matadorspillets felter */
public interface Felt_2 
{
     
	public void passeret(Spiller sp); 
	public void landet(Spiller sp);   
        public void besked (String besked);        
        public boolean spørgsmål (String spørgsmål);        
        public void transaktion(double kr); 
        public void betal(Spiller modtager, double kr); 
	
}