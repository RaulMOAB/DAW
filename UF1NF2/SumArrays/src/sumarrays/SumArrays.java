/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarrays;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SumArrays {

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
        int acc = 0;
        for (int i = 0; i < value.length; i++) {
            acc += value[i];
            
        }
        System.out.println("La suma total es: " + acc);
        
    }
    
}
