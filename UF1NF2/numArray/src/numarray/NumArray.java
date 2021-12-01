/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numarray;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NumArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = askNum();
        int m = askNum();
       //crear el array con intrray(m);
        int[]arr = new int [n];
       
        fillArray(arr, m);           
        
        displayArray(arr);
           
    }

    public static int askNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int n = sc.nextInt();
        return n;
    }

    private static void fillArray(int[] arr, int m) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = m;
        }
    }

    private static void displayArray(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
            System.out.println("posicion " + i + " tiene " + arr[i] );
        }
    }
    
}
