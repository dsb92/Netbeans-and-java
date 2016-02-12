//Lav en sortering sådan så strenge sorteres efter alfabetet, omvendt og 
//alfabetisk efter andet tegn i strengene. 
package kapitel_12;
import java.util.*;

public class StrengeComparator implements Comparator<Strenge>
{
    public int compare(Strenge s1, Strenge s2)
    {
        if(s1.equals(s2)) return 1;
        else return -1;
    }
}
