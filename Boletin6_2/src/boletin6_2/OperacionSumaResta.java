package boletin6_2;

import java.util.Scanner;

/**
 * Sirve para saber si se suman dos numeros o se restan
 * @author Christian Lamas
 * @since 2018
 * @version 1.0
 */
public class OperacionSumaResta {

    Scanner res = new Scanner(System.in);
/**
 * Evalua si un numero es mayor que otro o igual, en caso de que sea mayor o igual realiza la resta. Si es menor realiza la suma de ellos
 */
    public void OpeSumRes() {
        
        System.out.println("Teclea el numero : ");
        short num1 = res.nextShort();
        System.out.println("Teclea el numero");
        short num2 = res.nextShort();
        short suma = (short) (num1 + num2);
        short resta = (short) (num1 - num2);
        if (num1 >= num2) {
            System.out.println("La resta es = " + resta);
        } else {
            System.out.println("La suma es = " + suma);
        }

    }
}
