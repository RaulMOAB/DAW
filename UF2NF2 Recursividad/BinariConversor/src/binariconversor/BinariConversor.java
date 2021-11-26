/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binariconversor;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class BinariConversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te lo devuelvo en binario");
        int num = sc.nextInt();
        binariNum(num);
        System.out.println("");
    }

    private static void binariNum(int num) {
        if (num < 2) {// caso base
            System.out.print(num);
        }else{          
            binariNum(num / 2);
            System.out.print(num % 2);
        }
    }
    
}
