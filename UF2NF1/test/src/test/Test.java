/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int numRandom = r.nextInt(10) +1;
        System.out.println(numRandom);
        int totalCard = 0;
        int option;
        int acc = numRandom;
        
        do {
            
            
            System.out.println("Pedir carta [0]");
            option = sc.nextInt();
            numRandom = r.nextInt(10) +1;
            System.out.println(numRandom);
            
            if(option == 0){
            acc = acc + numRandom;
              System.out.println("Total " + acc);  
            }
            
            
        } while (totalCard > 21 || option == 0);
        
    }
    
}
