package Opgave_4;
// Definér superklassen Brik med egenskaben farave (sort eller hvid), position x og y (hver mellem 1-8).
// Definér også metoden public boolean kanFlytteTil (int xNy, int yNy // om brikken kan flytte dertil
// Definér nedarvingerne Bonde og Taarn med tilsidesat kanFlytteTil()


public class Brik 
{
	public String farve;
        public int x;
        public int y;
        public int FlytBrik;
        
        public Brik (String farven, int xposition, int yposition)
        {
            farve = farven;
            x = xposition;
            y = yposition;
        }
   
       public String toString()
    {
        return "farve:"+farve+" x:"+x+" y:"+y;
    }
        
        public void vis()
        {
            System.out.println("Farve: "+farve);
            System.out.println("Start position: x = "+x+" og y = "+y);
            
        }
       
        public int FlytBrik()
        {
            
            return FlytBrik;
        }
        
        
       public boolean kanFlytteTil(int xNy, int yNy)
       {
           boolean FlytBrik;
           x = xNy;
           y = yNy;
           if(xNy<8 || yNy<8) 
           {
               System.out.println("Brikken kan godt flytte hertil x = "+x+" og y = "+y);
               System.out.println("Brikken rykkes til x = "+x+" og y = "+y);
           }
               
               FlytBrik = true;
           
           if (xNy>8 || yNy>8)
           {
               System.out.println("Brikken kan ikke flyttes hertil x = "+x+" og y = "+y);
           }
               
               FlytBrik = false;
            
               return FlytBrik;
            
             
       }
}


