//Hvad skriver følgende program ud? Hvis du kan regne det ud, uden at køre programmet, har du forstået ideen i tildelinger



public class Opgave_5
{
    public static void main(String[] args)  
    {
       int a,b,c,d;
       a = 5;
       b = 6;
       c = 7;
       d = 8;
       System.out.println("a er "+a+", b er "+b+", c er "+c+" og d er "+d);
       
       a = b+d;
       d = c+a;
       System.out.println("a er "+a+", b er "+b+", c er "+c+" og d er "+d);
       
       b = a;
       d = c;
       System.out.println("a er "+a+", b er "+b+", c er "+c+" og d er "+d);
       
       
    }
}