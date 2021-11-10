/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6loop;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej6Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        int cont = 0;
        boolean negative = false;
        Scanner sc = new Scanner(System.in);

//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Introduce un numero");
//            num = sc.nextInt();
//            if (num < 0) {
//                negative = true;
//            }
//
//        }
//        if (negative == true) {
//            System.out.println("Has introducido algún negativo");
//        } else {
//            System.out.println("Todo positivos");
//        }
        do {
            System.out.println("Introduce numero");
            num = sc.nextInt();
            if (num < 0) {
                negative = true;
                
            }
            cont++;
        } while (cont <= 10);
        if (negative == true) {
            System.out.println("Has puesto negativos");
        }else{
            System.out.println("todo positivos");
        }

    }

}
