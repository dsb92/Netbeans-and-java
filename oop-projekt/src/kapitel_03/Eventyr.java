package kapitel_03;
import java.util.*;

public class Eventyr
{
	public static void main(String[] arg)
	{
		ArrayList<String> personer = new ArrayList<String>(); // liste af strenge
		personer.add("De tre små grise");
		personer.add("Ulven");
		personer.add("Rødhætte");

		ArrayList<String> handlinger = new ArrayList<String>();
		handlinger.add("slikker sig om munden");
		handlinger.add("får en idé!");
		handlinger.add("gemmer sig i skoven");

		for (int i=0; i<5; i++) {
			int personNummer = (int) (Math.random()*personer.size());
			String person = personer.get( personNummer );
			String handling = handlinger.get( (int)(Math.random()*handlinger.size()));
			System.out.println(person + " " + handling);
    }
  }
}