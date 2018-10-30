package boletin6_3;

import javax.swing.JOptionPane;

/**
 *
 * @author Christian Lamas
 * @since 2018
 * @version 1.0
 */
public class MostrarSigno {
    

    public void MosSigno() {
        double num1;
        String numero1 = JOptionPane.showInputDialog("Teclea numero : ");
        num1 = Double.parseDouble(numero1);
        if (num1 > 0) {
            JOptionPane.showMessageDialog(null, "+");        
        }
        else if (num1 < 0) {
            JOptionPane.showMessageDialog(null, "-");
        }
         else {
           JOptionPane.showMessageDialog(null, "0");
        }  
    }
}
