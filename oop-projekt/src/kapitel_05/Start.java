package kapitel_05;
/** Startfeltet - n�r en spiller passerer dette felt, f�r han 5000 kr */
public class Start extends Felt
{
	double gevinst;

	public Start(double gevinst)
	{
		navn = "Start";
		this.gevinst = gevinst;
	}

	public void passeret(Spiller sp)                 // tilsides�t metode i Felt
	{
		sp.besked("Du passerer start og modtager "+gevinst);
		sp.transaktion(gevinst);                      // kredit/debit af konto
	}

	public void landet(Spiller sp)                   // tilsides�t metode i Felt
	{
		sp.besked("Du lander p� start og modtager "+gevinst);
		sp.transaktion(gevinst);
	}
}