/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonacci;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y te devuelvo su fibonacci");
        int num = sc.nextInt();
        int result = fibonacci(num);
        System.out.println(result);
    }

    public static int fibonacci(int num) {

        switch (num) {
            case 0:
                // caso base
                return 0;
            case 1:
                // caso base
                return 1;
            default:
                return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

}
