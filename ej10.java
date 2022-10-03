/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

import java.util.Scanner;

/**
 *
 * @author Ezequiel
 */
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int limite, num, suma;
        limite = 128;
        suma = 0;

        do {
            System.out.println("Ingese un numero");
            num = leer.nextInt();
            suma = suma + num;
            System.out.println("La suma es: " + suma);
        } while (suma != limite);

    }

}
