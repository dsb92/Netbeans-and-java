package kapitel_18;
import java.io.*;
public class Serialisering
{
	public static void gem(Object obj, String filnavn) throws IOException
	{
		FileOutputStream datastrÝm = new FileOutputStream(filnavn);
		ObjectOutputStream objektstrÝm = new ObjectOutputStream(datastrÝm);
		objektstrÝm.writeObject(obj);
		objektstrÝm.close();
	}

	public static Object hent(String filnavn) throws Exception
	{
		FileInputStream datastrÝm = new FileInputStream(filnavn);
		ObjectInputStream objektstrÝm = new ObjectInputStream(datastrÝm);
		Object obj = objektstrÝm.readObject();
		objektstrÝm.close();
		return obj;
	}
}