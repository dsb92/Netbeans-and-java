package Opgave_1;
// En anden løsning ved hjælp af evt. facitlisten og eksemplet fra Boks3-klassen s. 105 i javabogen!
// En modificieret version. 


/** En pyramide med en side og en højde */

public class Pyramide2
{
    private double side;
    private double højde;
    
    /** konstruktør der opretter en standardpyramide */
    
    public Pyramide2()
    {
        System.out.println("Standardpyramiden oprettes");
        side = 10.0;
        højde = 10.0;    
    }
            
   /** en anden konstruktør der får side og højde */
    
    public Pyramide2(double s, double h)
    {
        if (s<=0 || h<=0)
        {
            System.out.println("Ugyldige mål. Standardpyramide oprettes.");
            side = 10.0;
            højde = 10.0;    
        }
        else 
        {
            side = s;
            højde = h;
                    
        }
    }
   
    public double volumen()
    {
        double vol = side*side*højde/4;
        return vol;
    }
  
    
}


