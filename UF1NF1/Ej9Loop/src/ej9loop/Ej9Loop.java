/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9loop;

/**
 *
 * @author alumne
 */
public class Ej9Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        int prod = 1;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            prod *= i;

        }
        System.out.println("La suma total es " + sum);
        System.out.println("El producto total es " + prod);
    }

}
