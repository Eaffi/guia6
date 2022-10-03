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
public class ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Escribe una palabra o frase con 8 caracteres");
        frase = leer.nextLine();
        
        if (frase.length() == 8 ){
            System.out.println("CORRECTO");         
        } else {
            System.out.println("INCORRECTO");
        }
                
    }
    
}
