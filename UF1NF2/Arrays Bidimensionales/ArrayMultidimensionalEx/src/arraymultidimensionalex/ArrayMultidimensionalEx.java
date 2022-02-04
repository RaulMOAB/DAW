/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensionalex;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArrayMultidimensionalEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int alumnos = 3;
       int notas_modulo = 4;
       double[][] notas_alumno = new double [alumnos][notas_modulo];
       //fillArray(notas_alumno);
       fillArrayAutomatic(notas_alumno);
       double total = calcularSumaTotal(notas_alumno);
       displayArray(notas_alumno);
       
        System.out.println(total);
       
       
      
       
    }

    private static void fillArrayAutomatic(double[][] notas_alumno) {// lo llena automaticamente
        int acc = 1;
        for (int i = 0; i < notas_alumno.length; i++) {
            System.out.println("Alumno " + (i + 1));
            for (int j = 0; j < notas_alumno[i].length; j++) {               
                notas_alumno[i][j] = acc;
                acc++;
            }
        }
    }
    
//     private static void fillArray(double[][] notas_alumno) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < notas_alumno.length; i++) {
//            System.out.println("Alumno " + (i + 1));
//            for (int j = 0; j < notas_alumno[i].length; j++) {
//                System.out.println("Pon las notas del alumno");
//                notas_alumno[i][j] = sc.nextDouble();
//            }
//        }
//    }

    private static void displayArray(double[][] notas_alumno) {
        for (int i = 0; i < notas_alumno.length; i++) {
            for (int j = 0; j < notas_alumno[i].length; j++) {
                System.out.println("Notas " + notas_alumno[i][j]);
            }
        }
    }

    private static double calcularSumaTotal(double[][] notas_alumno) {
        double suma_total = 0;
        for (int i = 0; i < notas_alumno.length; i++) {
            for (int j = 0; j < notas_alumno[i].length; j++) {
                suma_total += notas_alumno[i][j];
                
            }
        }
        return suma_total;
    }
    
}
