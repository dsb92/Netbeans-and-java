//Skriv et program, der beregner porto for et brev. Inddata er brevets vægt (i gram). Uddata er prisen, for at sende det som A-post i Danmark
public class Opgave_3
{
	public static void main(String[] arg) 
	{
            double vægt;
            vægt = 50;
            
            if (vægt <=50)
                System.out.println("Brevet koster 8 kr");
            else 
                System.out.println("Brevet koster mere end 8 kr");
            
                   
            System.out.println("Brever vejer "+vægt+" gram");
            
          
	}
}
	
                