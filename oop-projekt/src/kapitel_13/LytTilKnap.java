package kapitel_13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LytTilKnap extends JPanel implements ActionListener
{
	private JTextArea t1, t2;
	private JButton kopierKnap;

	public LytTilKnap()
	{
		setLayout(new FlowLayout());
		String s = "Her er en tekst.\nMarkÈr noget af\nden og tryk\nKopier...";
		t1 = new JTextArea(s, 5,15);
		add(t1);
		kopierKnap = new JButton("KopiÈr>>");
		kopierKnap.addActionListener(this);
		add(kopierKnap);
		t2 = new JTextArea( 5,15);
		t2.setEditable(false);
		add(t2);
	}

	public void actionPerformed(ActionEvent e)   // kr√¶ves af ActionListener
	{
		t2.setText(t1.getSelectedText() );
	}
}