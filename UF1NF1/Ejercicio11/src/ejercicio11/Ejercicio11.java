/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce un número");
        num1 = keyboard.nextInt();
        System.out.println("Introduce un segundo número");
        num2 = keyboard.nextInt();
        if(num1 > num2){
            System.out.println("El mayor es " + num1);
        }else{
            System.out.println("El mayor es " + num2);
        }
    }
    
}
