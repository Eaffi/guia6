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
public class ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, num2;
        System.out.println("Ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        int op;
        String resp = "" ;
        
        do {
            System.out.println("indique que operacion desea realizar:");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            op = leer.nextInt();
                   
            
            switch (op){
                case 1:
                    int sum = num1 + num2;
                    System.out.println("La suma es: " + sum);
                    break;
                case 2:
                    if (num1 > num2){
                        int rest = num1 - num2;
                        System.out.println("La resta es: " + rest);
                    } else {
                        int rest = num2 - num1;
                        System.out.println("La resta es: " + rest);
                    }
                    break;
                case 3:
                    int mult = num1 * num2;
                    System.out.println("El producto es: " + mult);
                    break;
                case 4:
                    if (num1 > num2){
                        int divi = num1 / num2;
                        System.out.println("La division es: " + divi);
                    } else {
                        int divi = num2 / num1;
                        System.out.println("La division es: " + divi);
                    }
                    break;
                case 5:
                    System.out.println("Esta seguro que desea salir? s/n");
                    resp = leer.next(); 
            }
        } while (resp.equals("s")==false);
    }
}
