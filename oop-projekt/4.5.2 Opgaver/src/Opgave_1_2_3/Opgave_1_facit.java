package Opgave_1_2_3;

public class Opgave_1_facit
{
	static public void main(String[] args)
	{

		Raflebæger bæger1 = new Raflebæger(4);
		int antalSlag = 0;
		while(bæger1.antalDerViser(6) != 3 && bæger1.antalDerViser(6) != 4)
		{
			antalSlag++;
			bæger1.ryst();
			System.out.println("Slag nr. " + antalSlag);
			System.out.println(bæger1.toString());
		}
		System.out.println("Slag nr. " + antalSlag);
	}
}
