package kapitel_09;
public class KurveanimationMedTraad extends Kurvetegning implements Runnable
{
	public KurveanimationMedTraad()
	{
	}

	public void run()
	{
		for (int t=0; t<100000; t++) 
		{
			forskydning = t;        // �ndr forskydningen s� kurven ser anderledes ud
			repaint();      // systemet vil kalde paintComponent() (fra grafiktråden)
			try { Thread.sleep(40); } catch (Exception e) {}
		}
	}

	public static void main(String[] arg)
	{
		KurveanimationMedTraad ka = new KurveanimationMedTraad();
		Thread tr�d = new Thread(ka);  // opret tr�d, der k�rer run() p� ka
		tr�d.start();                  // start den nye tr�d
		System.out.println("Animationen k�rer nu...");
	}
}