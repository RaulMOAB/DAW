/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExamenFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int playerCard, bankCard;
        int playerSuit, bankSuit;
        double playerPoint = 0, bankPoint = 0;
        char playerPlay;
        boolean bankPass, winner;
        
        do {
            playerCard = randomNumCard();
            playerSuit = cardSuit();
            bankCard = randomNumCard();
            bankSuit = cardSuit();
            // Turno Jugador
            System.out.print("CARTA JUGADOR: ");
            printCard(playerCard, playerSuit);
            System.out.println("");// nueva línea
            playerPoint += cardPoint(playerCard);
            System.out.println("Puntos jugador: " + playerPoint);
            // Turno banca          
            System.out.print("CARTA BANCA: ");
            printCard(bankCard, bankSuit);
            System.out.println("");
            bankPoint += cardPoint(bankCard);
            System.out.println("Puntos banca: " + bankPoint);
            bankPass = bankAskCard(playerPoint, bankPoint);
           
            playerPlay = keepPlaying(playerPoint, bankPoint);
            
        } while (playerPoint < 7.5 && bankPoint < 7.5 && bankPass  && playerPlay != 'n');
        
       winner = playerWins(playerPoint, bankPoint);
       
        if (!winner) {
            System.out.println("LA BANCA GANA");
            System.out.println("Puntos banca: " + bankPoint);
            System.out.println("Puntos jugador: " + playerPoint);
        }else{
            System.out.println("GANA EL JUGADOR");
            System.out.println("Puntos jugador: " + playerPoint);
            System.out.println("Puntos banca: " + bankPoint);
        }
    }

    /**
     * Función que calcula el número de carta aleatoriamente entre 1 y 10
     *
     * @return número random
     */
    public static int randomNumCard() {
        Random r = new Random();
        int card = r.nextInt(10) + 1;
        return card;
    }

    /**
     * Función que calcula el palo de la carta aleatoriamente entre 1 y 4
     *
     * @return el palo de la carta
     */
    public static int cardSuit() {
        Random r = new Random();
        int palo = r.nextInt(4) + 1;
        return palo;
    }

    /**
     * Función que te muestra la carta seleccionada
     *
     * @param cardNum número de carta
     * @param palo palo seleccionado
     */
    public static void printCard(int cardNum, int palo) {
        if (cardNum <= 7) {
            System.out.print(cardNum);
        } else if (cardNum == 8) {
            System.out.print("Sota");
        } else if (cardNum == 9) {
            System.out.print("Caballo");
        } else if (cardNum == 10) {
            System.out.print("Rey");
        } else {
            System.out.println("Número no válido");
        }
        
        switch (palo) {
            case 1:
                System.out.print(" de OROS");
                break;
            case 2:
                System.out.print(" de BASTOS");
                break;
            case 3:
                System.out.print(" de ESPADAS");
                break;
            case 4:
                System.out.print(" de COPAS");
                break;
            default:
                System.out.println("Palo incorrecto");
                break;
        }
    }

    /**
     * Función que calcula los puntos obtenidos segun tu carta
     *
     * @param cardNum númer ode carta
     * @return valor de tu carta
     */
    public static double cardPoint(int cardNum) {
        if (cardNum >= 1 && cardNum <= 7) {
            return cardNum;
        } else if (cardNum == 8 || cardNum == 9 || cardNum == 10) {
            return 0.5;
        } else {// puntos incorrectos
            return -1;
        }
    }

    /**
     * Función que pregunta al jugador si quiere seguir jugando
     *
     * @return la opción elegida
     */
    public static char keepPlaying(double playerPoint, double bankPoint) {
        Scanner sc = new Scanner(System.in);
        char option;
        if (playerPoint < 7.5 && bankPoint < 7.5) {
            do {
            System.out.println("¿Quieres seguir jugando? S/N");
            option = sc.nextLine().charAt(0);
        } while (option != 'S' && option != 's' && option != 'N' && option != 'n');
            return option;
        }
        return option = 'n';
        
    }

    /**
     * Función que calcula si la banca pide carta o no
     *
     * @param playerPoint
     * @param bankPoint
     * @return devuelve true si debe pedir y false si no
     */
    public static boolean bankAskCard(double playerPoint, double bankPoint) {
        if (playerPoint <= 7.5 && bankPoint < playerPoint) {
            return true;
        } else if (bankPoint <= 5.5) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Función que muestra cuando gana e ljugador
     *
     * @param playerPoint
     * @param bankPoint
     * @return true si jugador gana false si gana la banca
     */    
    public static boolean playerWins(double playerPoint, double bankPoint) {
        if (playerPoint <= 7.5 && bankPoint < playerPoint) {
            return true;
        } else if (bankPoint > 7.5){
            return true;
        }else{
            return false;
        }
    }
}
