// Evt. Øvelser: 
//Ved at fjerne super.paintComponent herfra og kør det i BenytFaneblade, sker der det
//at baggrunden skifte farve, fra hvid(uden kaldet) til blå(med kaldet)
// Hvis super.paintComponent(g) flyttes allernederst, forsvinder grafikken pga.
// der ikke relateres til overklassen paintComponent med super. Ligesom en "opskift"
// Hvis setOpaque(false) sættes ind i konstruktøren, kommer grafikken frem igen.


package kapitel_11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GrafikpanelMedKomponenter extends JPanel
{
	JLabel labelHvadErDitNavn = new JLabel();
	JTextField textFieldNavn = new JTextField();
	JButton buttonOpdater = new JButton();
	JTextArea textAreaHilsen = new JTextArea();

	public void paintComponent(Graphics g)
	{
		g.drawLine(0,0,50,50);
		g.fillOval(5,10,300,30);
		g.setColor(Color.GREEN);
		String navn = textFieldNavn.getText();
		for (int i=0; i<50; i=i+10)
			g.drawString("Hej "+navn+" !",100+i,30+i);
                super.paintComponent(g);     // tegn baggrunden på panelet
	}

	public GrafikpanelMedKomponenter() 
        {
		try 
                {
			jbInit();
		}
		catch(Exception e) 
                {
			e.printStackTrace();
		}
                setOpaque(false);       //indsættes for at gøre panelet "gennemsigtig"
	}

	/** Udviklingsværktøjets initialisering af komponenter.
	 *  Udviklingsværktøj definerer gerne en separat metode hvor de 
	 *  initialiserer komponenterne. I JBuilder og JDeveloper hedder
	 *  den jbInit(), mens den hedder initComponents() i Betbeans.
	 *  Initialiseringen kunne dog lige så godt ligge direkte i konstruktøren.
	 *  Ændr med varsomhed, ellers kan værktøjet ikke genkende "sin" kode!
	 */
	private void jbInit() throws Exception {
		labelHvadErDitNavn.setText("Hvad er dit navn?");
		labelHvadErDitNavn.setBounds(new Rectangle(15, 69, 108, 15));
		textFieldNavn.setText("Jacob");
		textFieldNavn.setBounds(new Rectangle(129, 61, 95, 29));
		buttonOpdater.setText("Opdater!");
		buttonOpdater.setMnemonic(KeyEvent.VK_O);
		buttonOpdater.setBounds(new Rectangle(231, 60, 91, 32));
		buttonOpdater.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buttonOpdater_actionPerformed(e);
			}
		});
		textAreaHilsen.setText("Her kommer en tekst...");
		textAreaHilsen.setBounds(new Rectangle(6, 102, 316, 78));
		this.setLayout(null);
		this.add(labelHvadErDitNavn);
		this.add(textAreaHilsen);
		this.add(buttonOpdater);
		this.add(textFieldNavn);
	}

	void buttonOpdater_actionPerformed(ActionEvent e) {
		String navn = textFieldNavn.getText();
		System.out.println("Opdater! navn="+navn);
		textAreaHilsen.setText("Hej kære "+navn);
		repaint(); // gentegn vinduet
	}
}