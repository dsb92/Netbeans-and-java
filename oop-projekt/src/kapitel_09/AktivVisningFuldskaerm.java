package kapitel_09;
import java.awt.*;

public class AktivVisningFuldskaerm extends AktivVisning
{
	public static void initFuldsk�rm(Frame vindue) {
		GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
		GraphicsDevice dev = env.getDefaultScreenDevice();
		vindue.setUndecorated(true); // vis ikke vinduesramme, titel, luk-knap etc.
		dev.setFullScreenWindow(vindue);
	}

	public static void main(String[] args)
	{
		AktivVisning vindue = new AktivVisning();
		initFuldsk�rm(vindue);
		vindue.init();

		for (int i=0; i<10000; i++) {
			vindue.tegn();
		}
	}
}