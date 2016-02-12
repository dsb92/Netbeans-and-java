package kapitel_18;
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