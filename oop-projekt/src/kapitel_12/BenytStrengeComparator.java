package kapitel_12;
import java.util.*;

public class BenytStrengeComparator 
{
    public static void main(String[] arg)
    {
        ArrayList<Strenge> liste = new ArrayList<Strenge>();
        liste.add(new Strenge());   // ti strenge
        liste.add(new Strenge());
        liste.add(new Strenge());
        liste.add(new Strenge());
        liste.add(new Strenge());
        liste.add(new Strenge());
        liste.add(new Strenge());
        liste.add(new Strenge());
        liste.add(new Strenge());
        liste.add(new Strenge());
        
        System.out.println("før sortering: "+liste);
        StrengeComparator sammenligner = new StrengeComparator();
        Collections.sort(liste, sammenligner);
        System.out.println("efter sortering: "+liste);
    }
}
