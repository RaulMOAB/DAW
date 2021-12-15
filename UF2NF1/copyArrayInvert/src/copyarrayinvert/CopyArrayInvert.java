/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package copyarrayinvert;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class CopyArrayInvert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]arr = new int[10];
        int[]arr2 = new int[10];
       
        fillArray(arr);
        invertArray(arr, arr2);
        displayArray(arr);
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomValues();
            System.out.println("Posición " + (i + 1) + " :" + arr[i]);
        }
    }

    public static int randomValues() {
        Random r = new Random();
        return r.nextInt(100) + 1;
        
    }

    public static void invertArray(int[] arr, int[] arr2) {
        int indexOfArr2 = 0;
        for (int i = (arr.length -1); i >= 0; i--) {          
            arr2[indexOfArr2] = arr[i];
            indexOfArr2++;
            
        }
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Posicion " + (i+1) + " valor: " + arr[i]);
        }
    }
    
}
