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
public class ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String palabra;
        System.out.println("Escribe una palabra");
        palabra = leer.nextLine();
        
        if (palabra.equals("eureka")){
            System.out.println("Son iguales!");
        } else {
            System.out.println("No son iguales.");
        }
                
                
    }
    
}
