/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomarray_2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RandomArray_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[100];

        fillArray(arr, randomValues());  
        int user_value = askValue();
        arrayPosition(user_value, arr);
    }

    public static int randomValues() {
        return (int)  (Math.random() * 10) + 1; 
    }

    public static void fillArray(int[] arr, int arrValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomValues();
            System.out.println(arr[i]);
        }
    }

    public static int askValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número del 1 al 10");
        return sc.nextInt();
    }

    public static void arrayPosition(int user_value, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (user_value == arr[i]) {
                
                System.out.println("El numero se ha encontrado en la posición " + (i + 1));
            }
        }
    }

    

}
