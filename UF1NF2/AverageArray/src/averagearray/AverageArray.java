/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package averagearray;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AverageArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        int[] num = new int[5];
        askNum(num);
        int acc = accNum(num);       
        int average = calcAverage(acc, num);
        System.out.println("La media es: " + average);
    }

    public static void askNum(int[] num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce numeros para calcular la media");
            num[i] = sc.nextInt();
        }
    }

    public static int accNum(int[] num) {
        int acc = 0;
        for (int k = 0; k < num.length; k++) {
            acc += num[k];
        }
        return acc;
    }

    private static int calcAverage(int acc, int[] num) {
        return acc / num.length;
    }
    
}
