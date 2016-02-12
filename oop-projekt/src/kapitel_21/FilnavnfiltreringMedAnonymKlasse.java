package kapitel_21;
import java.io.*;
public class FilnavnfiltreringMedAnonymKlasse
{
	public static void main(String[] arg)
	{
		File f = new File( "." );			// den aktuelle mappe
		FilenameFilter filter;

		filter = new FilenameFilter() 
				{ // En anonym klasse
					public boolean accept( File f, String s) // En metode
					{
						return s.endsWith( ".java");  // svar true hvis fil ender p� .java
					}
				} // slut p� klassen
			; // slut p� tildelingen filter = new ...

		// brug objektet som filter i en liste af et antal filer
		String[] list = f.list( filter ); 

		for (int i=0; i<list.length; i=i+1) System.out.println( list[i] );	
	}
}