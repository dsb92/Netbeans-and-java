package Opgave_2;
// Lav en klasse, der repræsenterer en bil. en bil har en farve, et antal kørte kilometer og en nypris.
// Definér metoderne s. 119


public class Bil
{
    //erklæring af variabler (og evt. initialisering)
	
        public String transportmiddel;
        public String farve;
        public String mærke;
        public int kilometer;
        public int pris;
        
        //erklæring af konstruktører, evt. med paramtre
        public Bil (String transportmidlet, String farven, String mærket, int kilometerne, int prisen)
                {
                    transportmiddel = transportmidlet;
                    farve = farven;
                    mærke = mærket;
                    kilometer = kilometerne;
                    pris = prisen;      
                }
        
        //erklæring af metoder, evt. med parametre
    public String toString()
    {
        return " Transportmiddel:"+transportmiddel+" Mærke:"+mærke+" Farve:"+farve+" Kilometer:"+kilometer+" Pris:"+pris;
    }
                
    public int pris()
    {
        return pris;
    }
    
    public void kør (int antalKilometer)
    {
        pris = (pris -antalKilometer)/2;
        
    }
    
    public void vis()
    {
        System.out.println("Transportmiddel: "+transportmiddel);
        System.out.println("Farve: "+farve);
        System.out.println("Mærke: "+mærke);
        System.out.println("Pris: "+pris);
        System.out.println("Kilometer: "+kilometer);
    }
    
    
}


