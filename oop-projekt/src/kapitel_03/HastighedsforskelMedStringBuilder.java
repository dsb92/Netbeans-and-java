package kapitel_03;
// Demonstrerer hastighedsforskellen mellem String og StringBuilder 
// ved sammensætning af mange strenge
public class HastighedsforskelMedStringBuilder
{
	public static void main (String[] arg)
	{
		long tid1 = System.currentTimeMillis();
		String s = "";
		for (int i=0; i<10000; i++) s = s + "x";    // her oprettes 10000 objekter

		long tid2 = System.currentTimeMillis();
		System.out.println("Antal sekunder med String: "+ (tid2-tid1)*0.001 );

		StringBuilder sb = new StringBuilder(10000);// reservér plads til 10000 tegn
		for (int i=0; i<10000; i++) sb.append("x"); // her ændres i det samme objekt
		s = sb.toString();

		long tid3 = System.currentTimeMillis();
		System.out.println("Antal sek med StringBuilder: "+ (tid3-tid2)*0.001 );
	}
}