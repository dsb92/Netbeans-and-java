// 18.3 Opgave 1_ K�r HentOgGemData nogle gange og se, at den husker data i en fil. Kig i venner.ser.
// Tilf�j et ekstra felt til Data.java, overs�t og k�r programmet. Hvad sker der? Hvorfor?
// Slet serialVersionUID og pr�v igen. Hvad sker der? Hvorfor?
package kapitel_18;
import java.io.*;
public class Data implements Serializable
{
	public int a;
        public int b;       // har tilf�jet et nyt felt b
	public transient int tmp;		// transiente data bliver ikke serialiseret

	// Vigtigt: S�t versionsnummer s� objekt kan l�ses selvom klassen er �ndret!
	private static final long serialVersionUID = 12345; // bare et eller andet nr.

	public String toString()
	{ 
		return "Data: a="+a+" b="+b+" tmp="+tmp;
	}
}