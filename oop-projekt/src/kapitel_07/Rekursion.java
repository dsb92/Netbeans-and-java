package kapitel_07;
public class Rekursion
{
	public static void main(String[] arg)
	{
		t�lNed(3);
	}

	public static void t�lNed(int t�ller)
	{
		System.out.print(t�ller+" ");
		if (t�ller>0) t�lNed(t�ller-1); // t�lNed() kalder sig selv !!
	}
}