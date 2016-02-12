package kapitel_05;
/** Helle - hvis man lander her fÃ¥r man en gevinst */
public class Helle extends Felt
{
	double gevinst;

	public Helle (int gevinst)
	{
		navn = "Helle";                 // navn er arvet fra Felt
		this.gevinst = gevinst;
	}

	public void landet(Spiller sp)    // tilsidesÃ¦t metode i Felt
	{
		sp.besked("Du lander pÃ¥ helle og får overført "+gevinst);
		sp.transaktion(gevinst);        // opdater spillers konto
	}
}