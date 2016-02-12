package kapitel_03;
import java.util.*;

public class BenytArrayList
{
	public static void main(String[] arg)
	{
		ArrayList<String> liste;         // opret liste-variabel
		liste = new ArrayList<String>(); // opret liste-objekt

		liste.add("�h");                 // f�j til listen
		liste.add("b�h");
		liste.add("buh");

		System.out.println("Listen har elementerne "+liste.toString());

		liste.add(2,"og");
		System.out.println("Nu har listen "+liste); // .toString() kaldes implicit

		liste.remove(0);
		System.out.println("Nu har listen "+liste+" og st�rrelsen "+liste.size());
		System.out.println("P� plads nummer 1 er: "+liste.get(1));

		for (String element : liste) {  // gennemløb alle elementerne i listen
			System.out.println("Et element i listen: "+ element);
		}
	}
}