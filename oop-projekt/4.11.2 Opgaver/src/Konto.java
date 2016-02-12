import java.util.*;
class Konto
{
	public int saldo;
	public Person ejer;

	public Konto(Person ejeren)
	{
		saldo = 0;
		ejer = ejeren;
		ejer.konti.add(this);
	}

	public void overførsel(int kroner)
	{
		saldo = saldo + kroner;
	}

	public String toString()
	{
		return ejer + " har saldo "+saldo+" kr.\n";
	}
}