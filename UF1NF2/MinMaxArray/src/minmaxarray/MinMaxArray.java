/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmaxarray;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MinMaxArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] value = new int [4];
        
        for (int i = 0; i < value.length; i++) {
            System.out.print("Introduce valor ");
            value[i] = sc.nextInt();
        }
        int min = value[0];
        int max = value[0];
        for (int j = 0; j < value.length; j++) {
            if (value[j] < min) {
                min = value[j];
            }else if(value[j] > max){
                max = value[j];
            }
        }
        System.out.println("El mínimo es: " + min);
        System.out.println("El máximo es: " + max);
    }
    
}
