package kapitel_14;
import java.io.*;

public class Tastatur
{
	private BufferedReader ind;

	public Tastatur()
	{
		ind = new BufferedReader(new InputStreamReader(System.in));
	}

	public String l�sLinje()
	{
		try {
			String linje = ind.readLine();
			return linje;
		} catch (IOException u)
		{
			u.printStackTrace();
		}
		return null;
	}

	public double l�sTal()
	{
		String linje = l�sLinje();
		return Double.parseDouble(linje);
	}
}