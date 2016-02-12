// Skriv et program, der ud fra en persons fødselsdato udskriver alle fødselsdage, som personen har fejret indtil nu
//Lav f.eks. en while-løkke, hvor du tæller år frem fra fødselsdatoen og brug metoden before(), til at tjekke, om du er nået frem til nu.
import java.util.*;
import java.io.*;

public class Opgave_3
{
	public static void main(String[] arg) throws Exception
	{
		Date netopNu = new Date();

		int dag, måned, år;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Indtast fødselsår: ");
		år = Integer.parseInt(br.readLine());

		System.out.print("Indtast fødselsmåned: ");
		måned = Integer.parseInt(br.readLine());

		System.out.print("Indtast fødselsdag: ");
		dag = Integer.parseInt(br.readLine());

		Date fødselsdage = new Date(år, måned-1, dag);

		while (fødselsdage.getYear()<netopNu.getYear()) {
			System.out.println("Fødselsdagen er : " + fødselsdage);
			fødselsdage.setYear(fødselsdage.getYear()+1);
		}

	}
}
// Facitliste... 