package kapitel_15;
import java.io.*;
import java.util.zip.*;

public class UndersoegFil
{
	public static void main(String[] arg) throws IOException
	{
		FileInputStream fil = new FileInputStream("skrevet fil.txt");
		BufferedInputStream bstr�m = new BufferedInputStream(fil);
		CRC32 checksum = new CRC32();
		CheckedInputStream chkstr�m = new CheckedInputStream(bstr�m,checksum);
		InputStreamReader txtstr�m  = new InputStreamReader(chkstr�m);
		LineNumberReader ind        = new LineNumberReader(txtstr�m);

		String linje;
		while ((linje=ind.readLine())!= null) System.out.println("L�st: "+linje);

		System.out.println("Antal linjer: "  +ind.getLineNumber());
		System.out.println("Checksum (CRC):" +checksum.getValue());
	}
}

// Output data �ndrer sig, hvis SkrivTekstfil.java programmet k�res. Herved �ndres
// checksummen ogs� sig. 