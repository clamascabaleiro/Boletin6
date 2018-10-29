package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author clamascabaleiro
 */
public class NumeroPositivo {

    Scanner res = new Scanner(System.in);

    public void NumPositivo() {
        System.out.println("Teclea el numero : ");
        int num = res.nextInt();
        if (num >= 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

    }
}
