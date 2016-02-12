package kapitel_04;
public class BenytBoks
{
	public static void main(String[] arg)
	{
		double rumfang;

		Boks boksobjekt;
		boksobjekt = new Boks();
		boksobjekt.længde= 12.3;
		boksobjekt.bredde= 2.22;
		boksobjekt.højde = 6.18;
		rumfang = boksobjekt.volumen();
		System.out.println("Boksens volume: "+ rumfang);
	}
}