//LytTilMusen 
package kapitel_13;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Mus extends JPanel 
{
public static void main(String[] arg)
	{
		JFrame vindue = new JFrame( "Muse Lytter" ); 
		vindue.add( new Mus() );
		vindue.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
		vindue.setSize(350,300);
		vindue.setVisible(true);
	}
    public Mus() 
    {
        initComponents();       
    }
Point punkt;
    ;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        setLayout(null);

        jButton1.setText("Tryk her!");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(90, 10, 110, 90);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
Point trykpunkt = evt.getPoint(); 
System.out.println("Mus trykket ned i "+trykpunkt);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MousePressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
punkt = evt.getPoint();
Point trykpunkt = evt.getPoint(); 
System.out.println("Mus trykket ned i "+trykpunkt);
// TODO add your handling code here:
    }//GEN-LAST:event_formMousePressed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
Point slippunkt = evt.getPoint();
System.out.println("Mus sluppet i "+slippunkt);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
System.out.println("Mus klikket i "+evt.getPoint());        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
Point slippunkt = evt.getPoint(); 
System.out.println("Mus sluppet i "+slippunkt);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseReleased

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
Point gammeltPunkt = punkt;
punkt = evt.getPoint();
Graphics g = getGraphics();
g.drawLine(gammeltPunkt.x, gammeltPunkt.y, punkt.x, punkt.y);// TODO add your handling code here:
    }//GEN-LAST:event_formMouseDragged

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
