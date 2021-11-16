/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletafunction;

import java.util.Random;
import java.util.Scanner;

/**
 * @author alumne
 */
public class RuletaFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int money = 50; //dinero principal
        int player;
        int bet;
        int prize;
        int ball;
        System.out.println("********** BIENVENIDOS A LA RULETA **********");
        System.out.println("");

        do {

            player = playerNum();
            bet = askBet(money);
            ball = ballNum();
            boolean win = checkWin(player, ball);
            prize = calcPrize(player, bet);

            if (win) {
                System.out.println("Has jugado al " + player);
                System.out.println("El numero seleccionado ha sido el " + ball);
                money = updateCredit(money, prize, bet, win);
                System.out.println("HAS GANADO " + prize + " CREDITOS");
                System.out.println("");
                System.out.println("Te quedan " + money + " créditos");
                System.out.println("");
            } else {
                System.out.println("Has jugado al " + player);
                System.out.println("El numero seleccionado ha sido el " + ball);
                money = updateCredit(money, prize, bet, win);
                System.out.println("Te quedan " + money + " créditos");
            }


        } while (keepPlaying(money));
        System.out.println("Hasta la próxima!");

    }

    public static int playerNum() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número entre 0 y 36. 38 es apostar a par, 37 es apostar a impares");
            num = sc.nextInt();

        } while (num < 0 || num > 38);

        return num;
    }

    public static int askBet(int money) {
        Scanner sc = new Scanner(System.in);
        int bet = 0;
        do {
            System.out.println("Introduce tu apuesta");
            bet = sc.nextInt();
        } while (bet > money || bet < 0);

        return bet;
    }

    public static int ballNum() {
        Random r = new Random();
        return r.nextInt(36);
    }

    public static boolean checkWin(int playerNum, int ballNum) {
        boolean win = false;
        if (playerNum == ballNum) {
            win = true;
        } else if (playerNum == 37) {
            if (ballNum % 2 != 0) {
                win = true;
            }
        } else if (playerNum == 38) {
            if (ballNum % 2 == 0) {
                win = true;
            }
        }
        return win;
    }

    public static int calcPrize(int playerNum, int bet) {
        int prize = 0;
        if (playerNum == 38 || playerNum == 37) {
            prize = bet * 2;
        } else {
            prize = bet * 36;
        }
        return prize;
    }

    public static int updateCredit(int money, int prize, int bet, boolean win) {

        if (win) {
            money += prize;
        } else {

            money = money - bet;
        }
        return money;
    }

    public static boolean keepPlaying(int money) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quieres seguir jugando? s/n");
        char option = sc.nextLine().charAt(0);
        if (money <= 0 || option == 'n' || option == 'N') {
            return false;
        } else return true;



    }


}
