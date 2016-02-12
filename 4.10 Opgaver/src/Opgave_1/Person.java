package Opgave_1;
import java.util.*;
// 


public class Person
{
	
        public Person()
        {
            
        }
    
    public void enSætterSigInd(String p)
    {
        System.out.println(p+ " sætter sig i bilen");
    }
    
    public void hvemSidderIBilen(int antalDerSidderIBilen)
    {    
        System.out.println("Der sidder altså "+antalDerSidderIBilen+" personer i lamborghinen");
    
    }
    
    public void alleStigerUd(Person p)
    {
        System.out.println(p+ "stiger ud af bilen");
    }
}


