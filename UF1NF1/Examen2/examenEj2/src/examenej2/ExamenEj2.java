/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenej2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExamenEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        System.out.println("****** MENU ******");
        System.out.println("0- Salir");
        System.out.println("1- Escribir 10 veces");
        System.out.println("2- Cuenta atrás timbre");
        System.out.println("3- Numeros pares entre 2 valores");
        System.out.println("");
        System.out.print("Elije tu opcion: ");

        do {
            option = sc.nextInt();

            switch (option) {
                case 1:
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i + " A clase se viene a trabajar");
                    }
                    break;
                case 2:
                    for (int i = 10; i >= 0; i--) {
                        System.out.print(" " + i + " ");

                    }
                    System.out.print("RING !!!");

                    break;
                case 3:

                    System.out.println("Introduce dos números y te devuelvo los pares entre ellos");
                    System.out.println("Primer número");
                    int num1 = sc.nextInt();
                    System.out.println("Segundo número");
                    int num2 = sc.nextInt();
                    System.out.println("Número 1: " + num1);
                    System.out.println("Número 2: " + num2);
                    int numMayor;
                    int numMenor;
                    if (num1 < num2) {
                        numMayor = num2;
                        numMenor = num1;
                    } else {
                        numMayor = num1;
                        numMenor = num2;

                    }
                    for (int i = numMenor + 1; i < numMayor; i++) {
                        if (i % 2 == 0) {
                            System.out.println(i);
                        }

                    }

                    break;

                default:
                    if (option != 0) {
                        System.out.println("Opción no válida");
                    }

            }

        } while (option != 0);

    }
}
