/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un número");
        num1 = keyboard.nextInt();
        System.out.println("Introduce un segundo número");
        num2 = keyboard.nextInt();
        //Condicionales
        if(num1 > num2){
            System.out.println("Orden ascendente: " + num2 + " , " + num1);
        }else{
            System.out.println("Orden ascendente: " + num1 + " , " + num2);
        }
    }
    
}
