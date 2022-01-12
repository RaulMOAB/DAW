/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromostring;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PalindromoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        System.out.println("Escribe una frase");
        phrase = sc.nextLine();
        boolean palindomre = isPalindrome(phrase);
        System.out.println(palindomre);
        
    }

    public static boolean isPalindrome(String phrase) {      
        phrase =  phrase.toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").replace(" ", "").replace(".", "").replace(",", "");
        String reverse = new StringBuilder(phrase).reverse().toString();
        return reverse.equals(phrase);
       
    }
    
    
}
