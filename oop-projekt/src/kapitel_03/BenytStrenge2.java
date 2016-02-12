package kapitel_03;
// BenytStrenge2.java
public class BenytStrenge2
{
	public static void main (String[] arg)
	{
		String s1, s2, s3, s4;
		s1 = "Ude godt, men hjemme bedst.";
		s1.toUpperCase();          // lav store bogstraver, men smid resultatet væk
		s2 = s1.toUpperCase();     // lav store bogstraver fra s1, gem det i s2
		s3 = s2.replace("E", "X"); // erstat E med X på s2 og gem resultatet i s3
		s4 = s3.substring(4, 16);  // tag delstreng på s3 og gem resultatet i s4

		System.out.println ("s1: " + s1);	// s1 er stadig med små bogstaver
		System.out.println ("s2: " + s2);	// s2 har ikke fået ændret E til X
		System.out.println ("s3: " + s3);	// s3 er ikke delstrengen på plads 4-16
		System.out.println ("s4: " + s4);	// s4 er delstrengen på plads 4-16
	}
}