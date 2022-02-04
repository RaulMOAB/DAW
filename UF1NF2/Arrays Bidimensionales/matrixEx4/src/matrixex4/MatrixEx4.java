/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixex4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MatrixEx4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
        //1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
        //programa mostrará la nota mínima, máxima y media de cada alumno.
        
        double [][] notas = new double [4][5];
        
        fillArray(notas);
        displayArray(notas);
        displayMaxNote(notas);
    }

    private static void fillArray(double[][] notas) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Introduce nota Alumno " + (i + 1));
                notas[i][j] = sc.nextDouble();
            }
        }
    }
    
    private static void displayArray(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static void displayMaxNote(double[][] notas) {
        double max, min, acc;
        for (int alumno = 0; alumno < notas.length; alumno++) {
            max = notas[alumno][0];
            min = notas[alumno][0];
            acc = 0;
            for (int j = 0; j < notas[alumno].length; j++) {
                if (notas[alumno][j] > max) {
                    max = notas[alumno][j];
                }
                if (notas[alumno][j] < min) {
                     min = notas[alumno][j];
                }
                acc += notas[alumno][j];
            }
            
            double avg = acc / notas.length;
            
            System.out.println("La nota máxima del alumno " + (alumno + 1) + " es " + max);
            System.out.println("La nota mínima del alumno " + (alumno + 1) + " es " + min);
            System.out.println("La nota media del alumno " + (alumno + 1) + " es " + avg);
            System.out.println("");
        }
        
    }

    
}
