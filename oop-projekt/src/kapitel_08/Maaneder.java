package kapitel_08;
public class Maaneder
{	
	public static void main(String[] arg)
	{ 
		int[] m�nedesLgd = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.println("Januar har " + m�nedesLgd[0] + " dage.");
		System.out.println("April har " + m�nedesLgd[3] + " dage.");

		// med foreach-løkke, se afsnit 3.5.1.
		for (int lgd : m�nedesLgd) System.out.print(lgd + " ");

		System.out.println();
	}
}