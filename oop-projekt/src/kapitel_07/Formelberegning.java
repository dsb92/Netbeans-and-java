package kapitel_07;
public class Formelberegning
{
	/**
	 * Finder f�rste position af en operator, f.eks +, -, * eller /.
	 * G�r uden om de operatorer, der er inde i en parentes.
	 * Simplel l�sning, der ikke tager h�jde for parenteser: udtryk.indexOf(tegn)
	 */
	public static int findUdenforParenteser(char tegn, String udtryk)
	{
		int par = 0;
		for (int i = 0; i<udtryk.length(); i++)
		{
			char t = udtryk.charAt(i);
			if (t == tegn && par==0) return i; // tegn fundet udenfor parenteser!
			else if (t == '(') par++;          // vi g�r ind i en parentes
			else if (t == ')') par--;          // vi g�r ud af en parentes
		}
		return -1; // tegn ikke fundet udenfor parenteser
	}

	public static double beregn(String udtryk)
	{
		udtryk = udtryk.trim();                  // fjern overfl�dige blanktegn
		for (int opNr = 0; opNr < 4; opNr++)     // l�b gennem de fire regnearter
		{
			char op = "+-*/".charAt(opNr);        // op er nu '+', '-', '*' eller '/'
			int pos = findUdenforParenteser(op,udtryk);
			if (pos > 0)                           // findes op i udtrykket?
			{
				String vs = udtryk.substring(0,pos); // ja, find venstresiden
				String hs = udtryk.substring(pos+1); // find højresiden

				double vsr = beregn(vs);             // beregn h�jresidens v�rdi
				System.out.println("beregn("+vs+") = "+vsr);

				double hsr = beregn(hs);             // beregn venstresidens v�rdi
				System.out.println("beregn("+hs+") = "+hsr);

				if (op == '+') return vsr + hsr;     // beregn resultat og return�r
				if (op == '-') return vsr - hsr;
				if (op == '*') return vsr * hsr;
				return vsr / hsr;
			}
		}
		// Hvis vi kommer herned kunne der ikkes dele op i flere operatorer
		if (udtryk.startsWith("(") && udtryk.endsWith(")"))   // parenteser omkring?
		{
			udtryk = udtryk.substring(1,udtryk.length()-1);     // fjern dem
			return beregn(udtryk);                              // beregn indmad
		}
		if (udtryk.startsWith("sin(") && udtryk.endsWith(")"))// sinus-funktion
		{
			udtryk = udtryk.substring(4,udtryk.length()-1);    // fjern 'sin(' og ')'
			double resultat = beregn(udtryk);                   // beregn parameteren
			System.out.println("beregn("+udtryk+") = "+resultat);
			return Math.sin(resultat);
		}
		// intet andet fundet - s� m� det v�re et tal!
		return Double.parseDouble(udtryk);
	}

	public static void main(String[] arg)
	{
		String formel = "(1+2)*3 - sin(4/5*(6-7))";
		double v�rdi = beregn(formel);
		System.out.println("Formlen "+formel+" er beregnet til "+v�rdi);
	}
}