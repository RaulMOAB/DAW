/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11loop;

/**
 *
 * @author alumne
 */
public class Ej11Loop {

    
    public static void main(String[] args) {
        int accEven = 0;
        int accUneven = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                accEven += i;
            } else {
                accUneven += i;
            }
        }
        System.out.println("la suma par es " + accEven);
        System.out.println("la suma impar es " + accUneven);
    }

}
