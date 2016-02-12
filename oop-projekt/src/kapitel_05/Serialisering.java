//18.3 Opgaver 2: �ndr matadorspillet afsnit 5.3 s�dan, at felterne og de to spillere gemmes i en fil (serialiseret ned i samme datastr�m), n�r de
// 20 runder er g�et. Lav mulighed for at indl�se serialiserede fil, s� man kan spille videre p� et senere tidspunkt. 
package kapitel_05;
import java.io.*;
public class Serialisering
{
	public static void gem(Object obj, String filnavn) throws IOException
	{
		FileOutputStream datastr�m = new FileOutputStream(filnavn);
		ObjectOutputStream objektstr�m = new ObjectOutputStream(datastr�m);
		objektstr�m.writeObject(obj);
		objektstr�m.close();
	}

	public static Object hent(String filnavn) throws Exception
	{
		FileInputStream datastr�m = new FileInputStream(filnavn);
		ObjectInputStream objektstr�m = new ObjectInputStream(datastr�m);
		Object obj = objektstr�m.readObject();
		objektstr�m.close();
		return obj;
	}
}