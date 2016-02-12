import java.util.*;
class Person
{
	public String fornavn;
	public String efternavn;
	public int alder;
	public Vector konti;

	public Person(String fornavnP, String efternavnP, int alderP)
	{
		fornavn = fornavnP;
		efternavn = efternavnP;
		alder = alderP;
		konti = new Vector();
	}

	public String toString()
	{
		return fornavn + " " + efternavn + " (" + alder + " år)\n";
	}

	public void præsentation()
	{
		if (alder < 5) System.out.println("agyyy!");
		else System.out.println("Jeg hedder "+fornavn+", og jeg er "+alder+" år.");
	}

	public void hils(Person andenPerson)
	{
		if (alder < 5) System.out.println("ma ma.. ");
		else if (alder < 60) System.out.println("Hej "+andenPerson.fornavn+". ");
		else System.out.println("Goddag hr. "+andenPerson.efternavn+". ");
		præsentation();
	}

	public int formue()
	{
		int formueF = 0;
		for (int i = 0; i < konti.size(); i++)
		{
			Konto kontoF = (Konto) konti.elementAt(i);
			formueF += kontoF.saldo;
		}
		return formueF;
	}

}