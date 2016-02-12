package Opgave_2;
// 


public class Skib extends Bil
{
    
    public Skib(String transportmiddel, String farven, String mærket, int kilometerne, int prisen)
    {
        super(transportmiddel, farven, mærket, kilometerne, prisen);
 
        
    }
    
    public void sejle (int knob)
    {
        pris = (pris - knob)/2;
        
    }
    
}


