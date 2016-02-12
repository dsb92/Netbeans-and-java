//18.3 Opgaver 2: Ændr matadorspillet afsnit 5.3 sådan, at felterne og de to spillere gemmes i en fil (serialiseret ned i samme datastrøm), når de
// 20 runder er gået. Lav mulighed for at indlæse serialiserede fil, så man kan spille videre på et senere tidspunkt. 
package kapitel_05;
import java.io.*;
public class Serialisering
{
	public static void gem(Object obj, String filnavn) throws IOException
	{
		FileOutputStream datastrøm = new FileOutputStream(filnavn);
		ObjectOutputStream objektstrøm = new ObjectOutputStream(datastrøm);
		objektstrøm.writeObject(obj);
		objektstrøm.close();
	}

	public static Object hent(String filnavn) throws Exception
	{
		FileInputStream datastrøm = new FileInputStream(filnavn);
		ObjectInputStream objektstrøm = new ObjectInputStream(datastrøm);
		Object obj = objektstrøm.readObject();
		objektstrøm.close();
		return obj;
	}
}