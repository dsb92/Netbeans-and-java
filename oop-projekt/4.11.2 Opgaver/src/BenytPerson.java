// 


public class BenytPerson
{
	public static void main(String[] arg) 
	{
	   Person x;
		Konto jens1, jens2;

		x = new Person("Jens", "Pedersen", 36);

		System.out.println("Vi har oprettet "+x);

		jens1 = new Konto(x);
		jens2 = new Konto(x);

		System.out.println("Vi har oprettet følgende konti : "+jens1+" "+jens2);

		jens1.overførsel(1000);
		jens2.overførsel(2000);

		System.out.println("Kontooversigt : "+jens1+" "+jens2);
		System.out.println(""+x);
           
 
	}
}


