package kapitel_18;
import java.util.*;
public class HentOgGem
{
	public static void main(String[] arg) throws Exception
	{
		ArrayList<String> l;
		try 
                {
			l = (ArrayList<String>) Serialisering.hent("venner.ser");
			System.out.println("L�st: "+l);
		} 
                catch (Exception e) 
                {
			l = new ArrayList();
			l.add("Jacob");
			l.add("Brian");
			l.add("Preben");
			System.out.println("Oprettet: "+l);
		}

		l.add("Ven"+l.size());                  //Slettes denne fase efter catch blokken, vil der ikke l�ngere
		Serialisering.gem(l,"venner.ser");      //tilf�jes en indgang hver gang, men derimod starte, hvor den slap. 
		System.out.println("Gemt: "+l);
	}
}