package kapitel_02;
public class Syvtabel4
{
	public static void main(String[] arg) 
	{
		for (int n=1; n<=10; n=n+1)
		{
			int sum = 0;
			for (int j=0; j<n; j++) sum = sum + 7;

			System.out.println(n+" : "+ sum);
		}
	}
}