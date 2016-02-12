package kapitel_18;
import java.util.*;
import java.io.*;
public class GemDetSammeIgen {
	public static void main(String[] arg) throws Exception {
		ArrayList l;
		try {
			FileInputStream datastr�m = new FileInputStream("venner2.ser");
			ObjectInputStream objektstr�m = new ObjectInputStream(datastr�m);
			l = (ArrayList) objektstr�m.readObject();
			System.out.println("L�st1: "+l);

			l = (ArrayList) objektstr�m.readObject();
			System.out.println("L�st2: "+l);

			objektstr�m.close();
		} catch (Exception e) {
			l = new ArrayList();
			l.add("Jacob");
			System.out.println("Oprettet: "+l);
		}
		l.add("Ven"+l.size());
                

		FileOutputStream datastr�m = new FileOutputStream("venner2.ser");
		ObjectOutputStream objektstr�m = new ObjectOutputStream(datastr�m);

		objektstr�m.writeObject(l);
		System.out.println("Gemt1: "+l);

		// �ndr nu l og serialiser igen
		l.add("EkstraVen"+l.size());
		// l = (ArrayList) l.clone();// l�sning1: opret et andet objekt
		// objektstr�m.reset();     // l�sn2: nulstil liste af allerede skrevne obj
		objektstr�m.writeObject(l); // ellers bliver den nye tilstand af l ikke gemt
		System.out.println("Gemt2: "+l);
		objektstr�m.close();
	}
}