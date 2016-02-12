import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class MatadorApplet extends Applet {

	Spiller sp1=new Spiller("Søren",50000,Color.green);    // opret spiller 1
	Spiller sp2=new Spiller("Gitte",50000,Color.yellow);    // opret spiller 2
	int tur = 0;

	Vector felter=new Vector(); // vektor der indeholder alle felter
  JButton jButtonSpilEnTur = new JButton();


  public MatadorApplet() {
		felter.addElement(new Start(5000));
		felter.addElement(new Gade2("Gade 1",10000, 400,1000));
		felter.addElement(new Gade2("Gade 2",10000, 400,1000));
		felter.addElement(new Gade2("Gade 3",12000, 500,1200));
		felter.addElement(new Chancen(10000));
		felter.addElement(new Gade2("Gade 5",15000, 700,1500));
		felter.addElement(new Rederi2("Maersk",17000,4200));
		felter.addElement(new Helle(15000));
		felter.addElement(new Gade2("Gade 7",20000,1100,2000));
		felter.addElement(new Gade2("Gade 8",20000,1100,2000));
		felter.addElement(new Gade2("Gade 9",30000,1500,2200));

		for (int i=0; i<felter.size(); i++)
		{
			Felt f = (Felt) felter.elementAt(i);
			double v = Math.PI*2*i/felter.size();
			f.pos.move(100 + (int) (100*Math.cos(v)), 110 + (int) (100*Math.sin(v)));
		}


    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  private void jbInit() throws Exception {
    jButtonSpilEnTur.setText("Spil en tur");
    jButtonSpilEnTur.setBounds(new Rectangle(280, 272, 117, 25));
    jButtonSpilEnTur.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(ActionEvent e) {
        jButtonSpilEnTur_actionPerformed(e);
      }
    });
    this.setLayout(null);
    this.add(jButtonSpilEnTur, null);
  }


	public void paint(Graphics g)
	{
		for (int i=0; i<felter.size(); i++)
		{
			Felt f = (Felt) felter.elementAt(i);
			f.tegn(g);
		}


  	Felt f = (Felt) felter.elementAt(sp1.feltnr);
		f.tegnBil(g,sp1);
		g.drawString(sp1.navn,300,10);
		g.drawString(sp1.konto+" kr",300,20);

  	f = (Felt) felter.elementAt(sp2.feltnr);
		f.tegnBil(g,sp2);
		g.drawString(sp2.navn,300,110);
		g.drawString(sp2.konto+" kr",300,120);
		spilEnTur();
	}

  void spilEnTur() {
		tur = tur + 1;
		if (tur % 2 == 0) sp1.tur(felter);
		else sp2.tur(felter);
		repaint(500);
  }

  void jButtonSpilEnTur_actionPerformed(ActionEvent e) {
		spilEnTur();
  }

}
