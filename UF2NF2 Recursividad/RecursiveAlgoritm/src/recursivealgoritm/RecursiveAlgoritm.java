/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursivealgoritm;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RecursiveAlgoritm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un valor");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro valor");
        int num2 = sc.nextInt();
        int result = sumRecursive(num1, num2);
        System.out.println("Resultado: " + result);
    }
    
    public static int sumRecursive(int num1, int num2){
        if (num2 == num1) {
            return num2;
        }else{
            if (num2 < num1) {
                return -1;
            }else{
                 return num2 + sumRecursive(num1, num2 -1);
            }
           
        }
    }
    
}
