/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package array_alturas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Array_alturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat format1 = new DecimalFormat("#.00");
        
        int arrLength = calcLenght(sc);
        double[]arr = new double[arrLength];
        fillArray(arr, sc);
        double average = calcAverage(arr);
        double max_height = findMaxValue(arr);
        double min_height = findMinValue(arr, max_height);
        int aboveAverage = findAvobeValue(arr, average);
        
        System.out.println("La media de altura es de " + (format1.format(average)) + " metros");
        System.out.println("El mayor es " + max_height + " metros");
        System.out.println("El menor es " + min_height + " metros");
        System.out.println(aboveAverage + " personas superan la media de " + (format1.format(average))  + " metros");
        
    }

    public static int calcLenght(Scanner sc) {
        System.out.println("¿Cuantas alturas vas a introducir?");
        return sc.nextInt();
    }

    public static void fillArray(double[] arr, Scanner sc) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce la altura en metros del alumno " + (i + 1));
            arr[i] = sc.nextDouble();
        }
    }

    public static double calcAverage(double[] arr) {
        double accum = 0;
        for (int i = 0; i < arr.length; i++) {
            accum += arr[i];
        }
        return accum / arr.length;
    }

    public static double findMaxValue(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double findMinValue(double[] arr, double max) {
        double min = max;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findAvobeValue(double[] arr, double average) {
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) {
                cont++;
            }
        }
        return cont;
    }
    
}
