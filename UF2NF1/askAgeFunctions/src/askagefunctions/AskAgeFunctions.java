/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package askagefunctions;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AskAgeFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("edad");
        int edad = validatePositive(sc);
    }

    public static int validatePositive(Scanner sc) {
        int age = sc.nextInt();
        do {
           if(age < 0){
               System.out.println("Introduce un númer opositivo");
           } 
        } while (age < 0);
        return age;
    }
    
}
