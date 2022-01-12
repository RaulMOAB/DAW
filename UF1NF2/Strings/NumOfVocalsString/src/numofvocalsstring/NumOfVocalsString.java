/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numofvocalsstring;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NumOfVocalsString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        System.out.println("Escribe una frase");
        phrase = sc.nextLine();

        numOfVocals(phrase.toLowerCase());
    }

    public static void numOfVocals(String phrase) {
        int countCharA = 0, countCharE = 0, countCharI = 0, countCharO = 0, countCharU = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'a' || phrase.charAt(i) == 'A') {
                countCharA++;
            } else if (phrase.charAt(i) == 'e' || phrase.charAt(i) == 'E') {
                countCharE++;
            } else if (phrase.charAt(i) == 'i' || phrase.charAt(i) == 'I') {
                countCharI++;
            } else if (phrase.charAt(i) == 'o' || phrase.charAt(i) == 'O') {
                countCharO++;
            } else if (phrase.charAt(i) == 'u' || phrase.charAt(i) == 'U') {
                countCharU++;
            }
        }
        System.out.println("Nº de A: " + countCharA);
        System.out.println("Nº de E: " + countCharE);
        System.out.println("Nº de I: " + countCharI);
        System.out.println("Nº de O: " + countCharO);
        System.out.println("Nº de U: " + countCharU);

    }
}
