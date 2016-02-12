package Opgave_4;
// Tag udgangspunkt i Terning.java. Lav metode krone(), der returnerer true eller false.
// Lav et program, der kaster en mønt 100 gange og tæller antal gange, det fik krone.


public class Mønt
{
	public int værdi;
        
        public Mønt()
        {
            kast();
        }
        
        public void kast()
        {
            double tilfældigSide = Math.random();
            værdi = (int) (tilfældigSide * 2 +1);
        }
    
        public String toString()
        {
            String svar = ""+værdi;
            return svar;
       
        }
        
       
}


