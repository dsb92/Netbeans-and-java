package kapitel_02;
public class Primtal
{
	public static void main(String[] arg) 
	{
		int talDerSkalUnders�ges = 3;
		int faktor = 2;

		while (talDerSkalUnders�ges % faktor > 0) faktor = faktor+1;

		if (faktor < talDerSkalUnders�ges)
		{
			System.out.println(talDerSkalUnders�ges + " er IKKE et primtal,");
			System.out.println("for det har faktoren "+faktor);
		}
		else
			System.out.println(talDerSkalUnders�ges + " er et primtal.");
	}
}