/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner askNum = new Scanner(System.in);
        System.out.println("Introduce un número");
        num1 = askNum.nextInt();
        System.out.println("Introduce un segundo número");
        num2 = askNum.nextInt();
        //Cálculos
        int sum = num1 + num2;
        int res = num1 - num2;
        int prod = num1 * num2;
        
        System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es " + sum + "\n"
                + "El resultado de la resta de " + num1 + " - " + num2 + " es " + res + "\n"
                        + "El resultado de la multiplicacion de " + num1 + " * " + num2 + " es " + prod);
        if(num2 > 0){
        double div = (double)num1 / num2;//Muestra los decimales del resultado
            System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es " + div);
        }else{
            System.out.println("No se puede realizar la división");
        }
        
    }
    
}
