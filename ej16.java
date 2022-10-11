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
public class ej16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int[] vector;
        int n;
        System.out.println("Indique un tamaño de vector");
        n = leer.nextInt();
        vector = new int[n];
        
        relleno(vector);
        muestra(vector);
        busca(vector);
        
    }
    public static void relleno(int[] a){
        
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*99+1);
        }
    }
    public static void muestra(int[] a){
        
        for (int i = 0; i < a.length; i++){
            System.out.print(" " + a[i]);
        }
        System.out.println("");
    }
    public static void busca(int[] a){
        Scanner leer = new Scanner(System.in);
        int  cont = 0;
        
        System.out.println("que numero desea buscar");
        int num = leer.nextInt();
        
        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                System.out.println(num + " Se encontro en el casillero " + i);
                cont += 1;
            }
        }
        System.out.println("El numero " + num + " se encontro " + cont + " veces");
    }
}
