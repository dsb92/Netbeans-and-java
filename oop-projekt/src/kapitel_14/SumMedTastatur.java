package kapitel_14;
public class SumMedTastatur
{
	public static void main(String[] arg)
	{
		Tastatur t = new Tastatur();
		boolean stop = false;
		try 
		{
			while (!stop)
			{
				System.out.print("Hvor mange tal vil du l�gge sammen? ");
				double antalTal = t.l�sTal();
				double sum = 0;

				for (int i=0; i<antalTal; i=i+1)
				{
					System.out.print("Indtast tal: ");
					sum = sum + t.l�sTal();
				}
				System.out.println("Summen er: "+sum);
				System.out.print("Vil du pr�ve igen (j/n)? ");
				if ("n".equals(t.l�sLinje())) stop = true; // unders�g om det er "n"
			}
		} 	catch (Exception u) {
			System.out.println("Der opstod en undtagelse!");
			u.printStackTrace();
		}
	}
}