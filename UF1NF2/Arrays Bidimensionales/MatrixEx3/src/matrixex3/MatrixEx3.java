/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixex3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MatrixEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
        //introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
        //matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
        //menores que cero y cuántos son igual a cero
        
        int n = askNum("Introduce el numero de filas");
        int m = askNum("Introduce las columnas");
        int [][]matrix = new int [n][m];
        
        fillArray(matrix);       
        displayArray(matrix);
        compareValues(matrix);
    }

    private static int askNum(String phrase) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(phrase);
        num = sc.nextInt();
        return num;
    }

    private static void fillArray(int[][] matrix) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {               
                matrix[i][j] = r.nextInt(201) - 100; //num del -100 al 100;
            }
        }
    }
    
    private static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void compareValues(int[][] matrix) {
        int higher = 0, less = 0, equal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > 0) {
                    higher++;
                }else if(matrix[i][j] < 0){
                    less++;
                }else{
                    equal++;
                }
            }
        }
        System.out.println("Numeros mayor a 0: " + higher);
        System.out.println("Numeros nemor a 0: " + less);
        System.out.println("Numeros igual a 0: " + equal);
    }

    
    
}
