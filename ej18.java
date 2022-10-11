/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia6;

/**
 *
 * @author Ezequiel
 */
public class ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] mat = new int[4][4];
        relleno(mat);
        mostrar(mat);
        System.out.println("---------------------");
        transv(mat);
    }
    public static void relleno(int[][] a){
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] =(int) (Math.random()*9+1);  
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
    public static void transv(int[][] a){
        int[][] matB = new int[4][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                matB[i][j] = a[j][i];  
            }  
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(" " + matB[i][j]);
            }
            System.out.println("");
        }    
    }
}
