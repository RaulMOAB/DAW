/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenbiditabla;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class ExamenBidiTabla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] table = new int[5][4];

        fillTable(table);
        displayTable(table);
        sumTable(table);
        displayTable(table);
    }

    public static void fillTable(int[][] table) {
        Random r = new Random();
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length - 1; j++) {
                table[i][j] = r.nextInt(100) + 1;
            }
        }

    }

    public static void displayTable(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println("");
        }

    }

    private static void sumTable(int[][] table) {
        int accum;
        
        for (int i = 0; i < table.length; i++) {
            accum = 0;
            for (int j = 0; j < table[i].length - 1; j++) {
                accum += table[i][j];

            }
            table[i][3] = accum;

            System.out.println("La suma de la fila " + (i + 1) + " es: " + accum);
        }
    }

}
