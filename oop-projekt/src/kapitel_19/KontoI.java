// I praksis..
package kapitel_19;
import java.util.ArrayList;

public interface KontoI extends java.rmi.Remote
{
	public void overf�rsel(int kroner) throws java.rmi.RemoteException;
	public int saldo()                 throws java.rmi.RemoteException;
	public ArrayList bev�gelser()      throws java.rmi.RemoteException;
}