/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package completarfuncion;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class CompletarFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas, columnas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa les files");
        filas = sc.nextInt();
        System.out.println("Posa les columnes");
        columnas = sc.nextInt();

        int[][] tabla = new int[filas][columnas];

        rellenarAleatorios(tabla);
        mostrarArrayBidimensional(tabla);
        calcularPositivosNegativosCero(tabla);
        sumarTodosValoresPorFila(tabla);
        System.out.println("Dime la fila y te calculo la suma de esa sola fila");
        int fila = sc.nextInt();
        int suma_fila = calcularSumaFila(tabla, fila-1);
        System.out.println("La suma de la fila " + fila + " es: " + suma_fila);
        System.out.println("Dime la columna y te calculo la suma de esa ");
        int columna = sc.nextInt();
        int suma_col = calcularSumaColumna(tabla, columna-1);
         System.out.println("La suma de la columna " + columna + " es: " + suma_col);
    }

    private static void mostrarArrayBidimensional(int[][] tabla) {
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla[0].length; columnas++) {
                System.out.print(tabla[filas][columnas] + " ");
            }
            System.out.println(""); //salto de linea
        }
    }

    private static void rellenarAleatorios(int[][] tabla) {
        Random rd = new Random();
        int numero = rd.nextInt(11);
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla[0].length; columnas++) {
                tabla[filas][columnas] = rd.nextInt(11) - 5;
            }

        }
    }

    private static void calcularPositivosNegativosCero(int[][] tabla) {
        int pos = 0, zeros = 0, neg = 0;
        for (int filas = 0; filas < tabla.length; filas++) {
            for (int columnas = 0; columnas < tabla[0].length; columnas++) {
                if (tabla[filas][columnas] > 0) {
                    pos++;
                } else if (tabla[filas][columnas] < 0) {
                    neg++;
                } else {
                    zeros++;
                }
            }

        }
        System.out.println("positivos=" + pos + "-negativos=" + +neg + "-zeros=" + zeros);
    }

    /**
     * funcion que recorre toda la tabla y calcula la suma de todos los valores
     * de la MISMA FILA, y lo muestra por pantalla si la tabla tiene 5 filas,
     * debe mostrar 5 resultados
     *
     * @param tabla
     */
    private static void sumarTodosValoresPorFila(int[][] tabla) {
        int suma_acum;
        for (int fila = 0; fila < tabla.length; fila++) {
            suma_acum = 0;
            for (int col = 0; col < tabla[0].length; col++) { //array de un sola dimensio []
                suma_acum = suma_acum + tabla[fila][col];
            }
            System.out.println("la suma de la fila " + (fila + 1) + " es " + suma_acum);
        }

    }

    private static int calcularSumaFila(int[][] tabla, int fila) {
        int sum = 0;
        for (int i = 0; i < tabla[fila].length; i++) {
            sum += tabla[fila][i];
        }       
        return sum;

    }

    private static int calcularSumaColumna(int[][] tabla, int columna) {
        int sum = 0;
        for (int j = 0; j < tabla.length; j++) {
            sum += tabla[j][columna];
        }
        return sum;
    }
}


