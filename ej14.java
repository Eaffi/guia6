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
public class ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String moneda;
        System.out.println("ingrese cantidad a convertir");
        int mon = leer.nextInt();
        System.out.println("Que conversion quiere? (dolar / yen / libra)");
        moneda = leer.next();
        
        cambio(moneda, mon);
    }
    
    public static void cambio(String a, int b) {
        
        if (a.equalsIgnoreCase("dolar")){
           double dol = (b * 1.28611);
           System.out.println(b + " Euros son: " + dol + " Dolares");
        } else if (a.equalsIgnoreCase("libra")){
           double lib = (b * 0.87);
           System.out.println(b + " Euros son: " + lib + " Libras");
        } else if (a.equalsIgnoreCase("yen")){
           double yen = (b * 143.44);
           System.out.println(b + " Euros son: " + yen + " Yenes"); 
        }
    }
}
