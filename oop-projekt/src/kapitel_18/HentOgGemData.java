// 18.3 Opgave 1_ K�r HentOgGemData nogle gange og se, at den husker data i en fil. Kig i venner.ser.
// Tilf�j et ekstra felt til Data.java, overs�t og k�r programmet. Hvad sker der? Hvorfor?
// Slet serialVersionUID og pr�v igen. Hvad sker der? Hvorfor?
package kapitel_18;
import java.util.*;
public class HentOgGemData
{
	public static void main(String[] arg) throws Exception
	{
		ArrayList<Data> l;
		try {
			l = (ArrayList<Data>) Serialisering.hent("data.ser");
			System.out.println("L�st: "+l);
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

//Det der sker er, at nogle af elementerne i listerne bliver gemt og beholdt u�ndret. N�r programmet k�res igen
//bliver der tilf�jet et nyt element, dvs. data i listen, men de forrige data forts�t bliver u�ndret. 
//Kort sagt i programmet: a bliver gemt, men det g�r temp ikke(transient). Den bliver sat til null, hver gang programmet k�res. 
// Til opgave 1: b bliver tilf�jet til listen og f�r kun en v�rdi, som bliver gemt, fra da b blev tilf�jet, dvs. b har en null v�rdi hele vejen igennem fra start.
// Til opgave 1: N�r serialVersionUID bliver slettet, slettes objekterne i filerne og listen starter forfra med nye a og b v�rdier. 
// N�r serialVersionUID bliver tilf�jet igen, gemmes og hentes objekterne i filen forfra igen. 