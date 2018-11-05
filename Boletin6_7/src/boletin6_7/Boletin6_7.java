

package boletin6_7;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin6_7 {

    public static void main(String[] args) {
        int opcion;
      opcion = Integer.parseInt(JOptionPane.showInputDialog("Eliga la opcion \n 1-> Cuadrado \n 2-> Triangulo \n 3-> Circulo "));
      switch(opcion){
          case 1: calcularAreas calc = new calcularAreas ();
              calc.calcularCuadrado();
          
          break;
          
          case 2:  calcularAreas calc1 = new calcularAreas ();
              calc1.calcularTriangulo();
                
          break;
          
          case 3:  calcularAreas calc2 = new calcularAreas ();
              calc2.calcularCirculo();
                
          break;
          
          default : JOptionPane.showMessageDialog(null, "Opcion no valida");
       
        }
    }
}
