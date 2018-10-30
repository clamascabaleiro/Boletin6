package boletin6_5;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class NumeroMayor {

    public void NumMayor(){
        short num1,num2,num3;
        num1 = Short.parseShort(JOptionPane.showInputDialog("Introduce el primer numero : "));
        num2 = Short.parseShort (JOptionPane.showInputDialog("Introduzca el segundo numero : "));
        num3 = Short.parseShort(JOptionPane.showInputDialog("Introduzca el tercer numero : "));
        
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "El mayor es : " + num1);
        }
        else if (num3>num1){
            JOptionPane.showMessageDialog(null, "El mayor es : " + num3);
            
        }
        else if (num3>num2){
            JOptionPane.showMessageDialog(null, "El mayor es : " + num3);
        }
        else {
            JOptionPane.showMessageDialog(null, "El mayor es : " + num2);
        }
        
    }
}
