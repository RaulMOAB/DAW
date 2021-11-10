/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxvaluefunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MaxValueFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = askValue(sc);       
        int num2 = askValue(sc);
        int num3 = askValue(sc);
        
        int maxNum = numMax(num1, num2);       
        int higherNum = numMax(maxNum, num3);
        
        if (maxNum > higherNum) {
            System.out.println("El valor más grande es " + maxNum);
        }else{
            System.out.println("El valor más grande es " + higherNum);
        }
    }

    public static int numMax(int a, int b) {
        if (a > b) {
            return a;
        }else{
            return b;
        }
    }
    public static int askValue(Scanner sc){
    System.out.println("Introduce un valor ");
     return sc.nextInt();
    }
    
}
