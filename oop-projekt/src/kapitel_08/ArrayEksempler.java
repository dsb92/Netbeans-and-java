package kapitel_08;
public class ArrayEksempler
{
	public static void main(String[] arg)
	{
		int i0;
		int i1;
		int i2;
		
		// variabler skal initialiseres
		i0=3;
		i1=0;
		i2=10;

		//type    variabelnavn      nyt array med 3 pladser (alle med v�rdi 0)
		int[]          t        =         new int[3];

		// array-elementer er variabler der skal initialiseres.
		t[0]=3;      // Den f�rste plads er plads 0
		t[1]=0;      // ...
		t[2]=10;     // Den sidste plads er plads 2

		// t.length er 3, fordi der er 3 pladser i arrayet.
		for (int n=0; n<t.length; n=n+1) System.out.println(t[n]);

		// initialisering af array vha. for-l�kke.
		for (int n=0; n<t.length; n=n+1) t[n]=n*10;

		// Andre m�der at initialisere arrays p�

		//type    variabelnavn    nyt array med 3 pladser

		// konstante v�rdier:
		int[]          tc      =  { 3 , 0 , 10 };
		// udtryk:
		int[]          tc2     =  { i0 , i1+2 , i2*10 };
		// flere udtryk:
		int[]          tc3     =  { tc[0] , tc[2]+2 , tc2[1]*10 };

		// Tildeling af array-variabler:

		//type    variabelnavn
		int[]          a;       // erkl�ring af array-variabel.

		a=t;                    // tildeling. Nu refererer a og
		                        // t til samme array.

		a[1]=100;               // Dette �ndrer b�de a[1] og t[1]

		a=tc2;                  // tildeling. Nu refererer a og
		                        // tc2 til samme array.
	}
}