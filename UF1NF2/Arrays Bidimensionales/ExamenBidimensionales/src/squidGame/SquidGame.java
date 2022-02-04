/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package squidGame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SquidGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] crystalBridge = new int[5][2];
        boolean playerAlive;
        String name;
        int fila = 0;
        int side;
        name = askName("Introduce nombre de jugador");
        fillSafeBoxes(crystalBridge);
        displayBridge(crystalBridge);
        do {
      
            System.out.println("-------------------");
            showBridgeStatus(crystalBridge);
            //displayBridge(crystalBridge);

            System.out.println("");
            side = chooseBox(name, fila);
            playerAlive = stillAlive(crystalBridge, fila, side);
            fila++;

        } while (playerAlive);
            showBridgeStatus(crystalBridge);

    }

    /**
     * askName pide tu nombre y lo retorna el nombre en mayusculas si el usuario
     * no responde o sea lo deja en blanco, debe seguir pidiendo el nombre
     *
     * @return devuelve el string en mayusculas
     */
    public static String askName(String phrase) {
        Scanner sc = new Scanner(System.in);
        String user_name;

        do {
            System.out.println(phrase);
            user_name = sc.nextLine().toUpperCase();
        } while (user_name.isEmpty());

        return user_name;
    }

    /**
     * fillSafeBoxes En cada fila, se marcara un sitio de los dos posibles como
     * zona segura (1) la eleccion es aleatoria.
     *
     * @param crystalBridge
     */
    public static void fillSafeBoxes(int[][] crystalBridge) {
        Random r = new Random();
        int column;
        for (int i = 0; i < crystalBridge.length; i++) {
            column = r.nextInt(crystalBridge[i].length);
            crystalBridge[i][column] = 1;

        }
    }

    /**
     * showBridgeStatus Muestra el puente falseado si las casillas son lugares
     * por descubrir aún mostrara ("█" + " ") si la casilla es un lugar pisado y
     * era seguro("O" + " ") y si es un lugar donde se ha caio se mostrara ("X"
     * + " ")
     *
     * @param crystalBridge
     */
    public static void showBridgeStatus(int[][] crystalBridge) {
        for (int i = 0; i < crystalBridge.length; i++) {
            for (int j = 0; j < crystalBridge[i].length; j++) {
                
                char draw_bridge = displayCasilla(crystalBridge, i, j);
                System.out.print(draw_bridge + " ");
               
                
            }
            
            System.out.println("");
        }
    }

    /**
     * chooseBox: Pregunta al jugador que lado elige para saltar las opciones
     * validas son izquierda/derecha (string) , de cualquier forma escrita si no
     * pone estas opciones, seguira pidiendo que pongas el lado
     *
     * @param fila donde vas a elegir, solo sirve para el display de elige fila
     * xxxx
     * @param nom nombre del jugador
     * @return devuelve la posición elegida en tipo entero, contando que la fila
     * solo tiene dos columnas, la 0 o la 1.
     */
    public static int chooseBox(String nom, int fila) {
        Scanner sc = new Scanner(System.in);
        String user_side;

        do {
            System.out.println(nom + " a qué lado eliges saltar? [izquierda] o [derecha]");
            user_side = sc.nextLine();
        } while (!(user_side.equalsIgnoreCase("izquierda") || user_side.equalsIgnoreCase("derecha")));

        if ("izquierda".equalsIgnoreCase(user_side)) {
            fila = 0;

        } else if ("derecha".equalsIgnoreCase(user_side)) {
            fila = 1;

        }

        return fila;
    }

    /**
     * stillAlive: función que recibe la fila del puente done se encuentra y el
     * lado que ha votado el jugador, si ese sitio es un lugar seguro (1), marca
     * la casilla como pasada (3) y devuelve que estas vivo (true) en cambio si
     * una casilla que se rompe (0), la marca como casilla rota(2) y devuelve
     * muerto(false) cualquier otra opción posible, retornas falso (mueres)
     * Ayuda no tiene que recorrer todo el tablero porque sabemos que casilla
     * queremos comprobar
     *
     * @param crystalBridge tablero bidimensional
     * @param fila entero que refleja la fila a la que va a saltar el jugador
     * @param lado entero que indica cual de los dos lados ha elegido el
     * jugaodpr
     * @return true(vivo) false (muerto
     */
    public static boolean stillAlive(int[][] crystalBridge, int fila, int lado) {
        boolean alive = false;

        if (crystalBridge[fila][lado] == 1) {// lugar seguro
            crystalBridge[fila][lado] = 3;
            alive = true;
        } else if (crystalBridge[fila][lado] == 0) {
            crystalBridge[fila][lado] = 2;
        }
        return alive;
    }

    public static void displayBridge(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static char displayCasilla(int[][] crystalBridge, int i, int j) {
         if (crystalBridge[i][j] == 0 || crystalBridge[i][j] == 1 ) {
            return '█';
        }else if(crystalBridge[i][j] == 2){
            return 'X';
        }else{ //3
            return 'O';
        }
    }
}
