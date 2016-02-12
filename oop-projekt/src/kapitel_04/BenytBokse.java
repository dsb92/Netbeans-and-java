package kapitel_04;
public class BenytBokse
{
	public static void main(String[] arg)
	{
		Boks boks1, boks2;
		boks1 = new Boks();
		boks2 = new Boks();

		boks1.længde= 12.3;
		boks1.bredde= 2.22;
		boks1.højde= 6.18;

		boks2.længde= 13.3;
		boks2.bredde= 3.33;
		boks2.højde= 7.18;

		double v1, v2;

		v1 = boks1.volumen();
		v2 = boks2.volumen();

		System.out.println("Volumenforskel: "+ (v2 - v1));
	}
}