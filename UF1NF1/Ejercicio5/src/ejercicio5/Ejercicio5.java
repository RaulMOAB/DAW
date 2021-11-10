/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius;
        final double pi = Math.PI;
        Scanner askNum = new Scanner(System.in);
        System.out.println("Introduce el radio ");
        radius = askNum.nextDouble();
        //Cálculos
        double length = 2 * pi * radius;
        double area = pi * Math.pow(radius, 2);
        double vol = (4/3) * pi;
        
        System.out.println("La longitud de la circumferencia es " + length);
        
        
        
    }
    
}
