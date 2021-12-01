/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication35;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class JavaApplication35 {

   
    public static void main(String[] args) {
        //Realitza un algoritme recursivament , on es llegeixen dos valors enters per teclat i realitza la suma de tots els valors entre els dos números.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce dos valores enteros");
        System.out.println("Primer valor: ");
        int num1 = sc.nextInt();
        System.out.println("Segundo valor: ");
        int num2 = sc.nextInt();
        int sum1 = sumRecursive(num1);
        int sum2 = sumRecursive(num2);
        int result = sum1 + sum2;
        System.out.println("Sumatorio del primer valor: " + sum1);
        System.out.println("Sumatorio del segundo valor: " + sum2);
        System.out.println("Resultado de la suma de los dos sumatorios: " + result);
    }

    public static int sumRecursive(int num) {
        
        if (num < 0 || num < 0) {
            return 0;
        }else{
            return num + sumRecursive(num -1);
    }
    }
}
