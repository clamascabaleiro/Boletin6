package boletin6_2;

import java.util.Scanner;

/**
 *
 * @author clamascabaleiro
 */
public class OperacionSumaResta {

    Scanner res = new Scanner(System.in);

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
