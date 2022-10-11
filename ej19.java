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
public class ej19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] mat = new int[3][3];
        relleno(mat);
        mostrar(mat);
        System.out.println("---------------------");
        int[][] matB = transv(mat);
        validar(mat,matB);
    }
    public static void relleno(int[][] a){
        Scanner leer = new Scanner(System.in);
        System.out.println("Rellene la matriz");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = leer.nextInt();
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
    public static int[][] transv(int[][] a){
        int[][] matB = new int[3][3];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                matB[i][j] = a[j][i]*-1;  
            }  
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + matB[i][j]);
            }
            System.out.println("");
        }
        return matB;   
    }
    public static void validar(int[][] a,int[][] b){
        boolean val;
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == (b[j][i]*-1)){
                    val = true;
                }else {
                    val = false;
                }  
            }  
        }
        if (val=true){
            System.out.println("Es una matriz anti simetrica");
        }else{
            System.out.println("No es una matriz anti simetrica");
        }
    }
}
