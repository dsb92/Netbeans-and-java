// 18.3 Opgave 1_ Kør HentOgGemData nogle gange og se, at den husker data i en fil. Kig i venner.ser.
// Tilføj et ekstra felt til Data.java, oversæt og kør programmet. Hvad sker der? Hvorfor?
// Slet serialVersionUID og prøv igen. Hvad sker der? Hvorfor?
package kapitel_18;
import java.io.*;
public class Data implements Serializable
{
	public int a;
        public int b;       // har tilføjet et nyt felt b
	public transient int tmp;		// transiente data bliver ikke serialiseret

	// Vigtigt: Sæt versionsnummer så objekt kan løses selvom klassen er ændret!
	private static final long serialVersionUID = 12345; // bare et eller andet nr.

	public String toString()
	{ 
		return "Data: a="+a+" b="+b+" tmp="+tmp;
	}
}