package kapitel_05;
import java.util.*;


public class BenytBryggeri
{
	public static void main(String[] args)
	{
		Spiller sp1=new Spiller("Søren",50000);   // opret spiller 1
		Spiller sp2=new Spiller("Gitte",50000);   // opret spiller 2

		Vector felter=new Vector();               // indeholder alle felter
		felter.addElement(new Start(5000));
		felter.addElement(new Gade("Gade 1",10000, 400,1000));
		felter.addElement(new Gade("Gade 2",10000, 400,1000));
		felter.addElement(new Gade("Gade 3",12000, 500,1200));
		felter.addElement(new Rederi("Maersk",17000,4200));
		felter.addElement(new Gade("Gade 5",15000, 700,1500));
		felter.addElement(new Helle(15000));
		felter.addElement(new Gade("Gade 7",20000,1100,2000));
		felter.addElement(new Gade("Gade 8",20000,1100,2000));
                felter.addElement(new Bryggeri("Tuborg",16000));
		felter.addElement(new Gade("Gade 9",30000,1500,2200));

		// løb igennem 20 runder
		for (int runde = 0; runde<40; runde=runde+1)
		{
			sp1.tur(felter);
			sp2.tur(felter);
		}
	}
}
