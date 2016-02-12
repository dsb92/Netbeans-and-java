/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javacalculator;

/**
 *
 * @author David
 */
public class JavaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Calculator().setVisible(true);
            }
        }); // TODO code application logic here
    }
}
