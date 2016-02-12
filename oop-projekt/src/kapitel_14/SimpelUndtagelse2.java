package kapitel_14;
import java.util.*;
public class SimpelUndtagelse2
{
	public static void main(String[] arg)
	{
		System.out.println("Punkt A");	             // punkt A
		try 
		{
			ArrayList l = new ArrayList();
			System.out.println("Punkt B");           // punkt B
			l.get(5);
			System.out.println("Punkt C");           // punkt C
		}
		catch (Exception u)
		{
			System.out.println("Der opstod en undtagelse!");
                        // u.printStackTrace(); //evt. for at finde hvordan fejlen opstod.
		}
		System.out.println("Punkt D");             // punkt D
	}
}