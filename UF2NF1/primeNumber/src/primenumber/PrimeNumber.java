/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primenumber;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PrimeNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Introduce numeros 0-Salir");
            option = sc.nextInt();
            if (option != 0) {// si se pone un 0 no muestra resultado
                int prime = primeNumber(option);
                
                if (prime == -1) {
                    System.out.println(option + " no es primo");
                } else {
                    System.out.println(option + " es primo");
                }
            }

        } while (option != 0);
        System.out.println("Has salido del programa");

    }

    /**
     * evalua si el numero es primo o sea que no se puede dividir por ninguno
     * que no sea el mismo y el numero 1
     *
     * @param a
     * @return -1 si no es primo, 1 si es primo
     */
    public static int primeNumber(int a) {
        for (int i = a - 1; i >= 2; i--) {
            if (a % i == 0) {// NO  es primo
                return -1;
            }
        }
        return 1;// ES primo// no entra en el If 
    }

}
