/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ehercicio12;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ehercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num = keyboard.nextInt();
        if(num >= 0){
            System.out.println("El númeroes positivo");
        }else{
            System.out.println("El número es negativo");
        }
        
        
    }
    
}
