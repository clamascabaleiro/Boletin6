package boletin6_1;

import java.util.Scanner;

/**
 *
 * @author clamascabaleiro
 * @version 1.0
 * @since 2018
 */
public class NumeroPositivo {

    Scanner res = new Scanner(System.in);
/**
 * Evalua si un numero es positivo, realizando una comprobacion si es mayor o igual que 0 es positivo, en caso contrario es negativo y muestra por pantalla el resultado
 * @since 2018
 * 
 */
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
