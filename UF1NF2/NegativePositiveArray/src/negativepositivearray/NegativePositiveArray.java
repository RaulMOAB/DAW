/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package negativepositivearray;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NegativePositiveArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce numeros positivos o negativos");
            num[i] = sc.nextInt();
        }
        int accPositive = 0, accNegative = 0;
        for (int k = 0; k < num.length; k++) {
            if (num[k] >= 0) {
                accPositive += num[k];
                System.out.println("positivo " + num[k]);
            } else {
                accNegative += num[k];
                System.out.println("negativo " + num[k]);
            }

        }
        System.out.println("La suma de todos los positivos es: " + accPositive);
        System.out.println("La suma de todos los negativos es: " + accNegative);
    }

}
