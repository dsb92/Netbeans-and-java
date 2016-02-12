//Opgave 4.
//Skriv et program, so udskriver tre tilfældige tal(lavet med Math.random()), deres sum og gennemsnittet


public class Opgave_4
{
    public static void main(String[] args)  
    {
       double x,y,z;
       x = Math.random();
       y = Math.random();
       z = Math.random();
       
       double sum = x+y+z;
       double gennemsnit = sum/3;
       
       System.out.println("De tre tilfældige tal er: ");
       System.out.println("x: " +x);
       System.out.println("y: "+y);
       System.out.println("z: "+z);
       System.out.println("Summen er lig med: " +sum);
       System.out.println("Gennemsnittet er lig med: " +gennemsnit);
       
       
       
       
               
               
       
    }
}