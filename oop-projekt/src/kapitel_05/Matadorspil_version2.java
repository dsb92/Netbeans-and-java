package kapitel_05;
import java.util.*;

public class Matadorspil_version2
{
	ArrayList<Felt> felter = new ArrayList<Felt>(); // indeholder alle felter

	ArrayList<Spiller> spillere = new ArrayList<Spiller>();  // alle spillere

	int spillersTur = 0;

	public Matadorspil_version2() 
	{
		felter.add(new Start(5000));
		felter.add(new Gade2("Rødovrevej", 10000, 400,1000));
		felter.add(new Gade2("Hvidovrevej",10000, 400,1000));
		felter.add(new Rederi2("Maersk", 17000,4200));
		felter.add(new Gade2("Gade 3", 12000, 500,1200));
		felter.add(new Gade2("Gade 4", 12000, 500,1200));
		felter.add(new Gade2("Gade 5", 15000, 700,1500));
                felter.add(new Bryggeri("Tuborg", 16000));
		felter.add(new Helle(15000));
		felter.add(new Gade2("Frederiksberg Allé", 20000,1100,2000));
		felter.add(new Gade2("Rådhuspladsen",      20000,1100,2000));
                
	}
}
