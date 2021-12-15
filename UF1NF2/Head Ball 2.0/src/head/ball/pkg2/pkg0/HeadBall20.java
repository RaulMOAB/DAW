/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package head.ball.pkg2.pkg0;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class HeadBall20 {

    public static void main(String[] args) {
        int[] card = new int[4];
        int red_card, user_position;
        int jackpot = 0;
        char stillPlay = 0;

        do {
            red_card = randomPosition(card.length);
            user_position = askUser(card.length);
            fillArray(card, red_card);

            if (user_position == red_card) {
                System.out.println("Tarjeta roja!");
            } else {
                jackpot += card[user_position];
                System.out.println("Has ganado " + jackpot + " monedas");
                stillPlay = askPlay();
            }

        } while (user_position != red_card && (stillPlay != 'n' && stillPlay != 'N'));

        System.out.println("Has acumulado " + jackpot + " monedas");

    }

    public static char askPlay() {
        Scanner sc = new Scanner(System.in);
        char user_option;
        do {
            System.out.println("Quieres seguir jugando? [s/n]");
            user_option = sc.nextLine().charAt(0);
        } while (user_option != 's' && user_option != 'n' && user_option != 'S' && user_option != 'N');

        return user_option;
    }

    public static int askUser(int length) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("Elige una de las tarjetas [1] - [2] - [3] - [" + length + "]");
            option = sc.nextInt();
        } while (option < 1 || option > length);

        return option - 1;
    }

    public static void fillArray(int[] card, int position) {
        for (int i = 0; i < card.length; i++) {
            card[i] = randomCoin();
            card[position] = -1;
            // System.out.println("Posición: " + (i + 1) + " premio: " + card[i]);
        }

    }

    public static int randomCoin() {
        Random r = new Random();
        return r.nextInt(20) + 1;
    }

    /**
     * Función que elige una posición aleatoria del array
     *
     * @param length longitud del aarray
     * @return número comprendido en la longitud del array [0, 1, 2, 3, 4]
     */
    public static int randomPosition(int length) {
        Random r = new Random();
        return r.nextInt(length);
    }

}
