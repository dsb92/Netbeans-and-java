package kapitel_12;
import kapitel_04.*;
import java.util.*;
public class TerningComparator implements Comparator<Terning>
{ 
	public int compare(Terning t1, Terning t2) // kræves af Comparator
	{
		if (t1.v�rdi == t2.v�rdi) return 0; // t1 og t2 skal p� samme plads i listen
		if (t1.v�rdi  > t2.v�rdi) return 1; // t1 skal efter t2
		else return -1;                     // t1 skal f�r t2
	}
}