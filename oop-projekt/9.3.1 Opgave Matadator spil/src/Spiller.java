
/** Definition af en spiller */
import java.awt.*;
import java.util.*;
public class Spiller
{
	String navn;       // spillerens navn, f.eks. "Søren"
	double konto;      // antal kroner på spillerens konto
	int feltnr;        // hvad nummer felt spilleren står på. �?Start�? er nummer 0
        Color farve;

	public Spiller(String navn, double konto, Color farve)
	{
		this.navn = navn;
		this.konto = konto;
                this.farve = farve;
		feltnr = 0;
	}

	/** En besked til spilleren */
	public void besked(String besked)
	{
		System.out.println(navn+": "+besked);
	}

	/** Et ja/nej-spørgsmål. Svarer brugeren ja returneres true, ellers false */
	public boolean spørgsmål(String spørgsmål)
	{
		String spm = navn+": Vil du "+spørgsmål+"?";
		String svar = javax.swing.JOptionPane.showInputDialog(spm, "ja");
		System.out.println(spm+" "+svar);
		if (svar!=null && svar.equals("ja")) return true;
		else return false;
	}

	public void transaktion(double kr)
	{
		konto = konto + kr;
		System.out.println(navn+"s konto lyder nu på "+konto+" kr.");
	}

	public void betal(Spiller modtager, double kr)
	{
		System.out.println(navn+" betaler "+modtager.navn+": "+kr+" kr.");
		modtager.transaktion(kr);
		transaktion(-kr);
	}
        
        public void tur(Vector felter)
        {
            int slag = (int)(Math.random()*6+1);   //terning kast
            System.out.println("***** "+navn+" der står på felt nr. "+feltnr+" har slået "+slag+" *****");  //nu rykkes der
            
            for (int i=1;i<=slag;i=i+1)
            {
               //gå til næste felt: tæl op, hvis vi når over antallet af felter så tæl fra 0
                
                feltnr = (feltnr + 1) % felter.size();
                
                Felt felt;
                felt = (Felt) felter.elementAt(feltnr);
                
                if (i<slag) felt.passeret(this);              // kald passer() 
	 
            }
        }
}