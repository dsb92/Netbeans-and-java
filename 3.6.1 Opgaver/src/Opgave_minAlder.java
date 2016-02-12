// 
import java.util.*;

public class Opgave_minAlder
{
	public static void main(String[] arg) 
	{
	   Date netopNu = new Date();
           Date david = new Date(92,4,1,3,00);
           
           System.out.println("Dagens dato er: " + netopNu.toString());
           System.out.println("Davids fødselsdato er: " +david);
           
           long nuMs;
           long davidMs;
           long alderMs;
           
           nuMs = netopNu.getTime();
           davidMs = david.getTime();
           alderMs = nuMs - davidMs;
           
           
           david.setTime(nuMs-alderMs/2);
           System.out.println("David var halvt så gammel: " +david);
           
           System.out.println("David er 19 år gammel");
           
           
 
	}
}


