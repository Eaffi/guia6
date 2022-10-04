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
public class ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int corr = 0, inc = 0;
        String palabra;
        
        do {            
            System.out.println("Escriba una palabra de maximo 5 letras que comience con X y termine con O");
            System.out.println("Para concluir el programa escriba &&&&&");
            palabra = leer.nextLine();
            if (palabra.length() <= 5 && palabra.substring(0, 1).equalsIgnoreCase("x") && palabra.substring(palabra.length()-1).equalsIgnoreCase("o")){
                corr = corr + 1;
            } else if (palabra.equalsIgnoreCase("&&&&&")){
                break;
            } else {
                inc = inc + 1;
            }
        } while (!palabra.equals("&&&&&"));
    
        System.out.println("Cantidad de palabras correctas: " + corr);
        System.out.println("Cantidad de palabras incorrectas: " + inc);
        
    }
   
}
