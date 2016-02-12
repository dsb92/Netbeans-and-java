package Opgave_1;



public class BenytPyramider2
{
    static public void main(String[] args)
    {
        Pyramide2 pyramide1 = new Pyramide2();
        Pyramide2 pyramide2 = new Pyramide2(-2.1, 0);
        Pyramide2 pyramide3 = new Pyramide2(4, 3);

        System.out.println("Pyramide 1 har rumfanget : " + pyramide1.volumen());
        System.out.println("Pyramide 2 har rumfanget : " + pyramide2.volumen());
        System.out.println("Pyramide 3 har rumfanget : " + pyramide3.volumen());
    
    }
    
}