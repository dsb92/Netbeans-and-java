package Opgave_4;
/** Helle - hvis man lander her får man en gevinst */
public class Helle implements Felt_2
{
	double gevinst;

	public Helle (int gevinst)
	{
		navn = "Helle";                 // navn er arvet fra Felt
		this.gevinst = gevinst;
	}

	public void landet(Spiller sp)    // tilsidesæt metode i Felt
	{
		sp.besked("Du lander på helle og f�r overf�rt "+gevinst);
		sp.transaktion(gevinst);        // opdater spillers konto
	}
        public void passeret(Spiller sp)
        {
            
        }
        public void besked (String besked)
        {
            
        }
        public boolean spørgsmål (String spørgsmål)
        {
            
        }
        
        public void transaktion(double kr)
        {
            
        }
        public void betal(Spiller modtager, double kr)
        {
            
        }
}