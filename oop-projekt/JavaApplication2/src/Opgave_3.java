//Opgave 3.
//Skriv et program, som omregner et beløb fra dollar til euro (f.eks. kurs 95)


public class Opgave_3
{
    public static void main(String[] args)  
    {
       double dollar, euro;
       dollar = 10;
       
       double kurs = 95;
       
       euro = dollar * kurs /100;
       
       System.out.println(dollar+" dollar svarer til "+euro+" euro");
               
       
    }
}