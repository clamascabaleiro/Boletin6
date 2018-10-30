package boletin6_2;

import javax.swing.JOptionPane;



/**
 * Sirve para saber si se suman dos numeros o se restan
 * @author Christian Lamas
 * @since 2018
 * @version 1.0
 */
public class OperacionSumaResta {

/**
 * Evalua si un numero es mayor que otro o igual, en caso de que sea mayor o igual realiza la resta. Si es menor realiza la suma de ellos
 */
    public void OpeSumRes() {
        short num1,num2;
        String numero1 = JOptionPane.showInputDialog("Teclea numero 1 : ");
        num1 = Short.parseShort(numero1);
        String numero2 = JOptionPane.showInputDialog("Teclea numero 2 : ");
        num2 = Short.parseShort (numero2);
        short suma = (short) (num1 + num2);
        short resta = (short) (num1 - num2);
        if (num1 >= num2) {
            JOptionPane.showMessageDialog(null, "La resta es = " + resta);
        } else {
            JOptionPane.showMessageDialog(null, "La suma es = " + suma);
        }

    }
}
