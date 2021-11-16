/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paperscissorrockfunction;

import java.util.Random;
import java.util.Scanner;

/**
 * @author alumne
 */
public class PaperScissorRockFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int playerWin = 0;
    int cpuWin = 0;

    do {
        int player = playerTurn();
        int cpu = cpuTurn();
        int win = checkWin(player, cpu);

        if (win == 1) {
            playerWin = cont(playerWin);
        }else if(win == -1){
            cpuWin = cont(cpuWin);
        }else{
            System.out.println("EMPATE");
        }
    displayRound(playerWin, cpuWin);
    } while (isGameFinished(playerWin, cpuWin));

    }

    public static int menu(int option){
        Scanner sc = new Scanner(System.in);
        option = sc.nextInt();

            System.out.println("1. Mostrar Reglas de juego");
            System.out.println("2. Jugar");
            System.out.println("3. Salir");

        return option;
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
     * Función que genera un número aleatorio entre 1 y 3 que sera la tirada de
     * la máquina
     *
     * @return randomNum
     */
    public static int cpuTurn() {
        Random r = new Random();
        int randomNum = r.nextInt(3);
        System.out.print("La maquina ha  elegido ...");
        displayTurn(randomNum);
        return randomNum;
    }

    /**
     * Función que muestra las opciones a escoger al usuario y evalua si la
     * opción es válida
     *
     * @param
     * @return el número que eñ usuario ha introducido
     */
    public static int playerTurn() {
        Scanner sc = new Scanner(System.in);
        int option;

        do {

            System.out.println("Escoge una opción");
            System.out.println("");
            System.out.println("[0] Piedra        [1] Papel              [2] Tijeras");
            option = sc.nextInt();
            if (option != 0 && option != 1 && option != 2) {
                System.out.println("Opción no válida");
            }else{
                System.out.print("Has elegido ...");
                displayTurn(option);
            }

        } while (option != 0 && option != 1 && option != 2);


        return option;
    }

    /**
     * Función que comprueba quien gana o si hay empate
     *
     * @param player número tirada jugador
     * @param cpu    número random de la máquina
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
    public static int cont (int cont) {

        cont++;
        return cont;

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
     * Función que evalúa cuando termina el juego
     *
     * @param playerWin contador de turnos GANADOS por jugador
     * @param cpuWin    contador de turnos GANADOS por la máquina
     * @return true or false
     */
    public static boolean isGameFinished(int playerWin, int cpuWin) {
        boolean gameFinished = true;
        if (playerWin >= 5 || cpuWin >= 5) {
            gameFinished = false;
        }

        return gameFinished;
    }
    public static void displayRound(int playerWin, int cpuWin) {


        System.out.println("******* Jugador " +  playerWin + " ********");
        System.out.println("******* Máquina " +  cpuWin + " ********");
        System.out.println("*********************************");
    }
}
