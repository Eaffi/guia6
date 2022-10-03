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
public class ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num, doble, triple;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        doble = num * 2;
        triple = num * 3;
        
        System.out.println("el doble de " + num + " es: " + doble);
        System.out.println("el triple de " + num + " es: " + triple);  
        System.out.println("la raiz de " + num + " es: " + Math.sqrt(num));
                
        
    }
    
}
