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
public class ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] M = new int[10][10];
        int[][] P = new int[3][3];
           
        relleno10(M);
        muestra10(M);
        relleno3(P);
        System.out.println("Verificando si se encuentra dentro de la matriz M...");
        verif(M,P);
        
    }
    public static void relleno10(int[][] a){
        
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0; j < 10; j++) {
                a[i][j] = (int) (Math.random()*9+1);
            }
        }
    }
    public static void muestra10(int[][] a){
        
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0; j < 10; j++) {
                System.out.print(" " + a[i][j]); 
            }
            System.out.println("");
        }
    }
    public static int[][] relleno3(int[][] a){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Llene la matriz P (3x3)");
        for (int i = 0 ; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                a[i][j] = leer.nextInt();
            }
        }
        return a;
    }
     public static void verif(int[][] a, int[][] b){
        
        Scanner leer = new Scanner(System.in);
        int i1 = 0, j2 = 0, ver = 0;
        
        for (int i = 0 ; i < 10 ; i++){
            for (int j = 0; j < 10; j++) {
                
                if (a[i][j] == b[0][0]){
                    if (j+2 <= a.length-1 && i+2 <= a.length-1){
                        i1 = i;
                        j2 = j;
                        int o = 0; int p = 0;
                        for (int k = i1; k < i1 + 3; k++) {
                            for (int l = j2; l < j2 + 3; l++) {
                            
                                if (a[k][l] == b[o][p]) {
                                    ver++;
                                    p++;
                                }
                            } o++;
                              p = 0;
                        }j = j+3;          
                    }
                }
                if (ver==9){
                    System.out.println("La matriz ¨P¨ se encuentra en el casillero " + i1 + "," + j2);
                }ver = 0;   
            }
        }
    }
}
