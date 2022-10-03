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
public class ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
     
        Scanner leer = new Scanner(System.in);
        System.out.println("escribe tu nombre");
        nombre = leer.nextLine();
        
        System.out.println("tu nombre es: " + nombre);
    }
    
}
