/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner data_user = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado");
        int side = data_user.nextInt();
        int square_area = side * side;
        System.out.println("El lado del cuadrado es " + side);
        System.out.println("El area del cuadrado es " + square_area);
    }
    
}
