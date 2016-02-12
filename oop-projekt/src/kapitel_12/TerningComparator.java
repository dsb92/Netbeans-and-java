package kapitel_12;
import kapitel_04.*;
import java.util.*;
public class TerningComparator implements Comparator<Terning>
{ 
	public int compare(Terning t1, Terning t2) // krÃ¦ves af Comparator
	{
		if (t1.værdi == t2.værdi) return 0; // t1 og t2 skal på samme plads i listen
		if (t1.værdi  > t2.værdi) return 1; // t1 skal efter t2
		else return -1;                     // t1 skal før t2
	}
}