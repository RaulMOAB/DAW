/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomarray;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RandomArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[20];
        int arrValue = randomValues();
        fillArray(arr, arrValue);
        int user_value = askUser();
        int compare = compareValue(arr, user_value);
        System.out.println("Has introducido el número " + user_value);
        System.out.println("Hay " + compare + " numeros más altos");
    }

    /**
     * función que genera un número random entre 0.0 a 1.0
     *
     * @return valor random
     */
    public static int randomValues() {
        Random r = new Random();
        return r.nextInt(1000) + 1;
    }

    public static int askUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número real del 0 al 1000");
        return sc.nextInt();
    }

    public static void fillArray(int[] arr, int arrValue) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = randomValues();
            System.out.println(arr[i]);
        }
    }

    public static int compareValue(int[] arr, int user_value) {
        int cont = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > user_value) {
                cont++;
            }

        }
        return cont;

    }

}
