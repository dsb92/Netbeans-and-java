package kapitel_19;
import java.rmi.Naming;
public class Kontoserver
{
	public static void main(String[] arg) throws Exception
	{
		// Enten: K�r programmet 'rmiregistry' fra mappen med .class-filerne, eller:
		java.rmi.registry.LocateRegistry.createRegistry(1099); // start i server-JVM

		KontoI k = new KontoImpl();
		Naming.rebind("rmi://localhost/kontotjeneste", k);
		System.out.println("Kontotjeneste registreret.");
	}
}