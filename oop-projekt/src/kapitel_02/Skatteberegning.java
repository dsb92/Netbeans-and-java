package kapitel_02;
//
// Skatteberegning (Inspireret af Hallenberg og Sestoft, IT-C, København)
//
public class Skatteberegning 
{
	public static void main(String[] arg) 
	{
		double indkomst = 300000;
		double ambi, pension, bundskat;

		ambi = indkomst * 0.08;
		pension = indkomst * 0.01;
		indkomst = indkomst - (ambi + pension);
		bundskat = (indkomst - 33400) * 0.07;

		System.out.println("AMBI: " + ambi);
		System.out.println("Særlig pensionsopsparing: " + pension);
		System.out.println("Bundskat: " + bundskat);
	}
}