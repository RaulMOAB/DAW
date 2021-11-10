/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class GuessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = r.nextInt(50) + 1;
        int guess;
        int cont = 1;
        System.out.println("Adivina el número :)");
        System.out.println(randomNum);
        do {
            System.out.println("Introduce un número");
            guess = sc.nextInt();
            if (guess > randomNum) {
                System.out.println("Demasiado grande!");
                cont++;
            } else if (guess < randomNum) {
                System.out.println("Demasiado pequeño!");
                cont++;
            } else {
                System.out.println("Lo has adivinado en " + cont + " intento/s");
            }

        } while (guess != randomNum);

    }

}
