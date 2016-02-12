package kapitel_14;
import java.io.*;

public class TastaturKasterUndtagelser
{
	private BufferedReader ind;

	public TastaturKasterUndtagelser()
	{
		ind = new BufferedReader(new InputStreamReader(System.in));
	}

	public String l�sLinje() throws IOException
	{
		String linje = ind.readLine();
		return linje;
	}

	public double l�sTal() throws IOException
	{
		String linje = l�sLinje();
		return Double.parseDouble(linje);
	}
}