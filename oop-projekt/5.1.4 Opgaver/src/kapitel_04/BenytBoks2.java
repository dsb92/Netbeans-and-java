package kapitel_04;
public class BenytBoks2
{
	public static void main(String[] arg)
	{
		Boks2 enBoks = new Boks2();

		//ulovligt: enBoks.l�ngde= 12.3;
		//ulovligt: enBoks.bredde= 2.22;
		//ulovligt: enBoks.h�jde= 6.18;

		enBoks.s�tM�l( 2.0, 2.5, 1.5);

		System.out.println("Volumen er: "+ enBoks.volumen());

		enBoks.s�tM�l(-2.0, 0.0, 1.0);

		System.out.println("Volumen er: "+ enBoks.volumen());

		enBoks.s�tM�l( 2.0, 3.0 ,1.0);

		System.out.println("Volumen er: "+ enBoks.volumen());
	}
}