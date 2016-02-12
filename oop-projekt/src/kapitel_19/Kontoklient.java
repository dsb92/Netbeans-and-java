package kapitel_19;
import java.rmi.Naming;

public class Kontoklient
{
	public static void main(String[] arg) throws Exception
	{
		KontoI k =(KontoI) Naming.lookup("rmi://localhost/kontotjeneste");
		k.overf�rsel(100);
		k.overf�rsel(50);
		System.out.println( "Saldo er: "+ k.saldo() );
		k.overf�rsel(-200);
		k.overf�rsel(51);
		System.out.println( "Saldo er: "+ k.saldo() );
		java.util.ArrayList bev�gelser = k.bev�gelser();

		System.out.println( "Bev�gelser er: "+ bev�gelser );
	}
}