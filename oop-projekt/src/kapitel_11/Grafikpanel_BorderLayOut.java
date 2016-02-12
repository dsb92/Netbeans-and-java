package kapitel_11;
import java.awt.*;
import javax.swing.*;
// Mit eget forsøg på at sammenligne bogens beskrivelser...

public class Grafikpanel_BorderLayOut extends javax.swing.JPanel 
{

    public static void main(String[] arg)
    {
        JFrame vindue = new JFrame( "Grafikpanel med BorderLayOut" );
        vindue.add( new Grafikpanel_BorderLayOut() );
        vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vindue.pack(); // sætter en rimelig vinduesstørelse (i stedet for setSize())
        vindue.setVisible(true);
    }
    
    
  
    public Grafikpanel_BorderLayOut() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jButton1.setText("CENTER");
        add(jButton1, java.awt.BorderLayout.CENTER);

        jButton2.setText("NORTH");
        add(jButton2, java.awt.BorderLayout.PAGE_START);

        jButton3.setText("WEST");
        add(jButton3, java.awt.BorderLayout.LINE_START);

        jButton4.setText("EAST");
        add(jButton4, java.awt.BorderLayout.LINE_END);

        jButton5.setText("SOUTH");
        add(jButton5, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
