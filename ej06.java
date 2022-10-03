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
public class ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribe un numero");
        num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("el numero " + num + " es par");
        } else {
            System.out.println("el numero " + num + " es impar");
        }
            
                
                
    }
    
}
