/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessrandomnum;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class GuessRandomNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        final int randomNum = r.nextInt(50) + 1;
        int guess;
        
        System.out.println(randomNum);
        System.out.println("Adivina el número del 1 al 50");
        guess = sc.nextInt();
        
        
        if(guess < randomNum){// menor
            System.out.println("Es más bajo!");
        }else if(guess > randomNum){
            System.out.println("Es más alto!");
        }else if (guess == randomNum){
            System.out.println("Lo has adivinado!!");
        }
        
    }
    
}
