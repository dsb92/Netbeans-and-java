// 18.3 Opgave 1_ Kør HentOgGemData nogle gange og se, at den husker data i en fil. Kig i venner.ser.
// Tilføj et ekstra felt til Data.java, oversæt og kør programmet. Hvad sker der? Hvorfor?
// Slet serialVersionUID og prøv igen. Hvad sker der? Hvorfor?
package kapitel_18;
import java.util.*;
public class HentOgGemData
{
	public static void main(String[] arg) throws Exception
	{
		ArrayList<Data> l;
		try {
			l = (ArrayList<Data>) Serialisering.hent("data.ser");
			System.out.println("Læst: "+l);
		} catch (Exception e) {
			l = new ArrayList<Data>();
			System.out.println("Oprettet: "+l);
		}

		Data d = new Data();
		d.a   = (int) (Math.random()*100);  //et tal mellem 1 og 100
                d.b   = (int) (Math.random()*100);
		d.tmp = (int) (Math.random()*100);
		l.add(d);

		System.out.println("Gemt: "+l);
		Serialisering.gem(l,"data.ser");
	}
}

//Det der sker er, at nogle af elementerne i listerne bliver gemt og beholdt uændret. Når programmet køres igen
//bliver der tilføjet et nyt element, dvs. data i listen, men de forrige data fortsæt bliver uændret. 
//Kort sagt i programmet: a bliver gemt, men det gør temp ikke(transient). Den bliver sat til null, hver gang programmet køres. 
// Til opgave 1: b bliver tilføjet til listen og får kun en værdi, som bliver gemt, fra da b blev tilføjet, dvs. b har en null værdi hele vejen igennem fra start.
// Til opgave 1: Når serialVersionUID bliver slettet, slettes objekterne i filerne og listen starter forfra med nye a og b værdier. 
// Når serialVersionUID bliver tilføjet igen, gemmes og hentes objekterne i filen forfra igen. 