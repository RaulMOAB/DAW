/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenvector;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class ExamenVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]array = new int [10];
        fillArray(array);
        displayArray(array);
        modifyArray(array);
        System.out.println("");
        displayArray(array);
    }
    
     public static void fillArray(int[] array) {
        Random r = new Random();
         for (int i = 0; i < array.length; i++) {
             array[i] = r.nextInt(20) + 1;
         }
        

    }

    public static void displayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "-");
        }
    }

    private static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 10) {
                array[i] = 0;
            }
        }
    }
    
}
