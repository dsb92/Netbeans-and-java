package Opgave_2;

// 


public class Cykel extends Bil
{
    
    public Cykel(String transportmiddel, String farven, String mærket, int kilometerne, int prisen)
    {
        super(transportmiddel, farven, mærket, kilometerne, prisen);
    }
    
 
    
    public void cykel (int antalKilometer)
    {
        pris = (pris -antalKilometer)/2;
        
    }
    
}


