package kapitel_11;
import java.awt.event.*;
import javax.swing.*;

public class BenytGrafikpanelMedKomponenterOgMenu
{
	public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "GrafikpanelMedKomponenterOgMenu" ); 
		final GrafikpanelMedKomponenter panel = new GrafikpanelMedKomponenter();
		vindue.add( panel );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(350,300);

		JMenuBar  menubj�lke = new JMenuBar();

		JMenu     rullegardinFil   = new JMenu();
		JMenuItem menupunktOpdat   = new JMenuItem();
		JMenuItem menupunktAfslut  = new JMenuItem();

		JMenu     rullegardinHj�lp = new JMenu();

		rullegardinFil.setText("Fil");
		rullegardinFil.setMnemonic(KeyEvent.VK_F);
		menupunktOpdat.setText("Opdater");
		menupunktAfslut.setText("Afslut");
		menupunktAfslut.setMnemonic(KeyEvent.VK_A);

		rullegardinHj�lp.setText("Hj�lp");

		rullegardinFil.add(menupunktOpdat);
		rullegardinFil.add(menupunktAfslut);
		menubj�lke.add(rullegardinFil);
		menubj�lke.add(rullegardinHj�lp);

		vindue.setJMenuBar(menubj�lke);

		menupunktOpdat.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				panel.buttonOpdater_actionPerformed(e);
			}
		});

		menupunktAfslut.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				System.out.println("Farvel!");
				System.exit(0);
			}
		});

		vindue.setVisible(true); // som det allersidste: vis vinduet
	}
}