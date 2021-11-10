/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12potencialoop;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej12PotenciaLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exp;
        int result = 1;
        System.out.print("Introduce la base " );
        base = sc.nextInt();
        System.out.print("Introduce el exponente ");
        exp = sc.nextInt();

        for (int i = 1; i <= exp; i++) {
            
            result = result * base; // result *= base; da 5, da 5 por 5(25), da 5 por 5 (125)
            System.out.println("resultado " + result);
        }
        System.out.println("Resultado de la potencia: " + result);
    }

}
