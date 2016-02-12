package kapitel_19;
import java.util.ArrayList;
import java.rmi.server.UnicastRemoteObject;

public class KontoImpl extends UnicastRemoteObject implements KontoI
{
	public int saldo;
	public ArrayList bev�gelser;

	public KontoImpl() throws java.rmi.RemoteException 
	{
		// man starter med 100 kroner
		saldo = 100;
		bev�gelser = new ArrayList();
	}

	public void overf�rsel(int kroner)
	{
		saldo = saldo + kroner;
		String s = "Overf�rsel p� "+kroner+" kr. Ny saldo er "+saldo+" kr.";
		bev�gelser.add(s);
		System.out.println(s);
	}

	public int saldo()
	{
		System.out.println("Der sp�rges om saldoen. Den er "+saldo+" kr.");
		return saldo;
	}

	public ArrayList bev�gelser()
	{
		System.out.println("Der sp�rges p� alle bev�gelser.");
		return bev�gelser;
	}
}