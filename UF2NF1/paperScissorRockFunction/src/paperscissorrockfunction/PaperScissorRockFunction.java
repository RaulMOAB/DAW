/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paperscissorrockfunction;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PaperScissorRockFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        displayMenu();

    }

    /**
     * Muesta las reglas del juego
     */
    public static void displayRules() {
        System.out.println("                    |------ ¿CÓMO SE JUEGA? ------|");
        System.out.println("");
        System.out.println("                || Gana a la máquina 5 veces. ¿Podrás? ||");
        System.out.println("");
        System.out.println("Cada turno máquina y jugador muestan una de las tres opciones, [PAPEL], [TIJERAS], [PIEDRA]");
        System.out.println("");
        System.out.println("                    |------ REGLAS BASICAS ------|");
        System.out.println("");
        System.out.println("                         Papel gana Piedra");
        System.out.println("                         Piedra gana Tijeras");
        System.out.println("                         Tijeras gana Papel");
        System.out.println("");
        System.out.println("                                   ");
        System.out.println("                         El mejor de 5 GANA!");
        System.out.println("");
    }

    /**
     * Muesta el menú del juego y da la opción al usuario de escoger
     *
     * @param sc número introducido por el usuario
     *
     */
    public static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int option ;
        do {
            
            System.out.println("                     |------ MENÚ ------|");
            System.out.println("");
            System.out.println("1. REGLAS DEL JUEGO");
            System.out.println("2. JUGAR");
            System.out.println("3. SALIR");
            System.out.println("");
            option = sc.nextInt();
            if (option == 1) {
                displayRules();
            } else if (option == 2) {
                randomCpuNumber();
                playerTurn();
            }
        } while (option != 3);

    }

    /**
     * Funcón que genera un número aleatorio entre 1 y 3 que sera la tirada de
     * la máquina
     *
     * @return randomNum
     */
    public static int randomCpuNumber() {
        Random r = new Random();
        int randomNum = r.nextInt(3) + 1;
        return randomNum;
    }

    /**
     * Función que muestra las opciones a escoger al usuario y evalua si la
     * opción es válida
     *
     * @param sc
     * @return el número que eñ usuario ha introducido
     */
    public static int playerTurn() {
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        do {
            System.out.println("Escoge una opción");
            System.out.println("");
            System.out.println("[0] Piedra        [1] Papel              [2] Tijeras");

            if (option != 0 || option != 1 || option != 2) {
                System.out.println("Opción no válida");
            }

        } while (option != 0 && option != 1 && option != 2);

        return option;
    }

    /**
     * Función que comprueba quien gana o si hay empate
     *
     * @param player número tirada jugador
     * @param cpu número random de la máquina
     * @return 1 si jugador gana, -1 si jugador pierde 0 si hay empate
     */
    public static int checkWin(int player, int cpu) {
        //[0] Piedra        [1] Papel              [2] Tijeras"
        if (player == 0 && cpu == 1) {
            return -1;
        } else if (player == 0 && cpu == 2) {
            return 1;
        } else if (player == 1 && cpu == 2) {
            return -1;
        } else if (player == 1 && cpu == 0) {
            return 1;
        } else if (player == 2 && cpu == 0) {
            return -1;
        } else if (player == 2 && cpu == 1) {
            return 1;
        } else {
            return 0;
        }

    }

    /**
     * Función que cuenta los turnos
     *
     * @param cont variable contador
     * @return contador
     */
    public static int turn(int cont) {
        int contTurn = 0;
        contTurn++;
        return contTurn;

    }

    /**
     * Muestra la opción elegida por jugador y máquina
     *
     * @param turn
     */
    public static void displayTurn(int turn) {
        //[0] Piedra        [1] Papel              [2] Tijeras"
        switch (turn) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijeras");
                break;
            default:
                System.out.println("opción no válida");
                break;
        }
    }

    /**
     * Fubnción que evalúa cuando termina el juego
     *
     * @param playerWin contador de turnos GANADOS por jugador
     * @param cpuWin contador de turnos GANADOS por la máquina
     * @return true or false
     */
    public static boolean isGameFinished(int playerWin, int cpuWin) {
        boolean gameFinished = true;
        if (playerWin < 5 || cpuWin < 5) {
            return false;
        }

        return gameFinished;
    }
}
