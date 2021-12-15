/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuarray;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MenuArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = new int[10];
        int user_option;
        do {
            displayMenu();
            user_option = askuser();          
            checkOption(user_option, arr);
        } while (user_option != 3);
        
        System.out.println("Has salido del programa");
    }

    public static void displayMenu() {
        
        System.out.println("1 Mostrar valores  2 Introducir valor  3 Salir");
    }

    public static int askuser() {
        Scanner sc = new Scanner(System.in);
        int user_option;
        do {
             System.out.println("Introduce una opción");
             user_option = sc.nextInt();
        } while (user_option < 1 || user_option > 3);
       
        return user_option;
    }

    public static void checkOption(int user_option, int[] arr) {
        if (user_option == 1) {
            fillArray(arr);
        } else if (user_option == 2) {
            askValueToModifyArray(arr);
        }
        
    }

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
            
        }
        System.out.println("");
    }

    public static void askValueToModifyArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor");
        int user_value = sc.nextInt();
        System.out.println("Introduce una posicion");
        int position = sc.nextInt() - 1;
        
        arr[position] = user_value;
        
    }

}
