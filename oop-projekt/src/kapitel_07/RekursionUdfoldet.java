package kapitel_07;
public class RekursionUdfoldet
{
	public static void main(String[] arg)
	{
		t�lNed(3);
	}

	public static void t�lNed(int t�ller)
	{
		System.out.print(t�ller+" ");
		if (t�ller>0) t�lNedA(t�ller-1);    // kald t�lNedA(2)
	}

	public static void t�lNedA(int t�ller)
	{
		System.out.print(t�ller+" ");
		if (t�ller>0) t�lNedB(t�ller-1);    // kald t�lNedB(1)
	}
 
	public static void t�lNedB(int t�ller)
	{
		System.out.print(t�ller+" ");
		if (t�ller>0) t�lNedC(t�ller-1);    // kald t�lNedC(0)
	}

	public static void t�lNedC(int t�ller)
	{
		System.out.print(t�ller+" ");
		if (t�ller>0) t�lNedC(t�ller-1);    // kalder ikke videre, da t�ller=0
	}
}