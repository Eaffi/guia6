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
public class ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Indique tamaño de lados del cuadrado");
        n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");              
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
