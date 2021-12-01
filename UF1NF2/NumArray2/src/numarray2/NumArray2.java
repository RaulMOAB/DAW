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
        int p = askNum(sc);
        int q = askNum(sc);
        int n = calcArrayLong(p,q);
        int[]arr = new int [n];
        fillArray(arr, p);
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
 * @param p Numero pasado por teclado
 * @param q Numero pasado por teclado
 * @return La resta del mayor - menor
 */
    private static int calcArrayLong(int p, int q) {
        if (p > q) {
            return (p - q) + 1;
        }else{
            return (q - p) + 1;
        }
    }

    private static void fillArray(int[] arr, int p) {
        for (int i = 0; i < arr.length; i++) {
            p++;
        }
    }
    
}
