/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarraystring;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjercicioArrayString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, surname1, surname2;
        System.out.println("Escribe tu nombre");
        name = sc.nextLine();
        System.out.println("Escribe el primer apellido");
        surname1 = sc.nextLine();
        System.out.println("Escribe el segundo apellido");
        surname2 = sc.nextLine();
        
        String code = displayChar(name, surname1, surname2);
        System.out.print(code);
    }

    public static String displayChar(String name, String surname1, String surname2) {
      String phrase = name.substring(0, 3) + surname1.substring(0,3) + surname2.substring(0, 3);
      return phrase.toUpperCase();
    
}
}
