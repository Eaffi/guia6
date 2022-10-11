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
public class ej20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[][] mat = new int[3][3];
        relleno(mat);
        mostrar(mat);
        magico(mat);
                
    }
    public static void relleno(int[][] a){
            
        Scanner leer = new Scanner(System.in);
        System.out.println("Rellene la matriz con numeros del 1 al 9");
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int num = leer.nextInt();
                if (num>0 && num<10) {
                    a[i][j] = num;
                } else {
                    System.out.println("No esta dentro del rango pedido");
                    break;
                }                        
            }  
        }
    }
    public static void mostrar(int[][] a){
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println("");
        }
    }
    public static void magico(int[][] a){
        int sum = 0, sumI = 0, diag = 0, diagI = 0;
        
        for (int i = 0; i < a.length; i++) {
            sum += + a[0][i];
            sumI += + a[i][0];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++){
                if (i==j){
                    diag += + a[i][j];
                }
                if (i+j == a.length-1){
                    diagI += + a[i][j];                          
                }
            }  
        }
        if (sum==sumI && sum==diag && sum==diagI){
            System.out.println("Es una matriz magica");
        } else {
            System.out.println("No es una matriz magica");
        }
            
    }
}
