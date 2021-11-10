/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenej3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExamenEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char option;
        //System.out.println("Cuantos metros cuadrados mide tu habitación? ");
        int metro;
        //sc.nextLine();
        int sum = 0;

        do {
            System.out.println("Cuantos metros cuadrados mide tu habitación? ");
            metro = sc.nextInt();
            sc.nextLine();
            System.out.print("Hay más habitaciones? (s/n) ");
            option = sc.nextLine().charAt(0);
            if (option == 's' || option == 'S') {
               
                sum += metro;
            }
        } while (option != 'n');
        
        System.out.println("Tu casa mide " + sum + " metros cuadrados");

    }

}
