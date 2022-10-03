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
public class ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int centi, faren;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese grados centigrados");
        centi = leer.nextInt();
        faren = 32+(9*centi/5);
        System.out.println("son: " + faren + " grados farenheit");
    }
    
}
