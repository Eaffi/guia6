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
public class ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Indique cantidad de numeros en el vector");
        int n = leer.nextInt();
        int[] vec = new int[n];

        relleno(vec);
        mostrar(vec);
        control(vec);

    }

    public static void mostrar(int[] a) {

        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("");
    }

    public static void relleno(int[] a) {

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*99999+1);
        }
    }

    public static void control(int[] a) {
        int un = 0, dos = 0, tre = 0, cua = 0, cin = 0;

        for (int i = 0; i < a.length; i++) {
            int cont = 0;
            while (a[i] != 0) {
                a[i] = a[i] / 10;
                cont++;
            }
            if (cont == 1) {
                un++;
            } else if (cont == 2) {
                dos++;
            } else if (cont == 3) {
                tre++;
            } else if (cont == 4) {
                cua++;
            } else if (cont == 5) {
                cin++;
            }
        }
        System.out.println("Hay " + un + " numero/s con un digito");
        System.out.println("Hay " + dos + " numero/s con dos digitos");
        System.out.println("Hay " + tre + " numero/s con tres digitos");
        System.out.println("Hay " + cua + " numero/s con cuatro digitos");
        System.out.println("Hay " + cin + " numero/s con cinco digitos");
    }
}
