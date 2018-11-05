package boletin6_7;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author clamascabaleiro
 */

public class calcularAreas {
    
    public void calcularCuadrado (){
        float lado;
        float area;
        lado = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el lado : "));
        area = (float) Math.pow(lado,2);
        JOptionPane.showMessageDialog(null,"La superficie del cuadrado es : " + area);
        
    }
    
    public void calcularTriangulo (){
        float base;
        float altura;
        float area;
        base = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la base : "));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura : "));
        area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null,"La superficie del triangulo es : " + area);
    }
    
    public void calcularCirculo (){
       double radio,area;
       radio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el radio:"));
       area = (double) (radio * Math.PI);
       JOptionPane.showMessageDialog(null, "La superficie del circulo es: " + area);
    }
}
