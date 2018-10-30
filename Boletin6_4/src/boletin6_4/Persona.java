package boletin6_4;

import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Persona {
     
    public void MostrarDatosPeso () {
        String nomPers1,nomPers2;
        String nom = JOptionPane.showInputDialog("Introduzca el nombre de la 1º persona : ");
        String nom1 = JOptionPane.showInputDialog("Introduzca el nombre de la 2º persona : ");
        nomPers1 = nom;
        nomPers2 = nom1;
        double pesPers1,pesPers2;
        String pes = JOptionPane.showInputDialog("Introduzca el peso de la 1º persona : ");
        String pes1 = JOptionPane.showInputDialog("Introduzca el peso de la 2º persona : ");
        pesPers1 = Double.parseDouble(pes);
        pesPers2 = Double.parseDouble(pes1);
        
        if (pesPers1 > pesPers2){
            JOptionPane.showMessageDialog(null, "Su nombre es : ." + nomPers1 + "." + " Y la diferencia de peso es : " + (pesPers1-pesPers2));
        }
        else {
            JOptionPane.showMessageDialog(null, "Su nombres es : " + nomPers2 + "." + " Y la diferencia de peso es : " + (pesPers2-pesPers1));
        }
    }

}

   