/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessnumber;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class GuessNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int minNum = 1;
        int maxNum = 100;
        int guessNum;
        char answer;

        do {
            guessNum = (minNum + maxNum) / 2;
            System.out.println("Tu número es? " + guessNum);
            System.out.println("Mayor [M], menor [N], igual [I]");
            answer = sc.nextLine().charAt(0);

            if (answer == 'M' || answer == 'm') {//es mayor
                minNum = guessNum;

            } else if (answer == 'N' || answer == 'n') {
                maxNum = guessNum;

            }
        } while (answer != 'I' && answer != 'i');
        System.out.println("He adivinado el número! ");

    }

}
