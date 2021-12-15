/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numarray2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NumArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1 = askNum(sc);
        int value2 = askNum(sc);
        int n = calcArrayLength(value1,value2);
        int[]arr = new int [n];
        fillArray(arr, value1);
    }
/**
 * Funcion que pide un numero
 * @param sc numero introducido por teclado
 * @return numero
 */
    private static int askNum(Scanner sc) {
        System.out.println("Introduce un numero");
        return sc.nextInt();
    }
/**
 * Funcion que calculará la longitud del array
 * @param value1 Numero pasado por teclado
 * @param value2 Numero pasado por teclado
 * @return La resta del mayor - menor
 */
    private static int calcArrayLength(int value1, int value2) {
        if (value1 > value2) {
            return (value1 - value2) + 1;
        }else{
            return (value2 - value1) + 1;
        }
    }

    private static void fillArray(int[] arr, int value1) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value1;
            value1++;
            
        }
    }
    
}
