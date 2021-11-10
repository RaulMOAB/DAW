/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nummayorfunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class NumMayorFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value1, value2;
        int mayor;
        System.out.println("Introduce el valor 1");
        value1 = sc.nextInt();
        System.out.println("Introduce el valor 2");
        value2 = sc.nextInt();

        mayor = numMayor(value1, value2);
        System.out.println("El numero más grande es " + mayor);
    }
/**
 * 
 * @param num1
 * @param num2
 * @return 
 */
    public static int numMayor(int num1, int num2) {
//        if (num1 >= num2) {
//            return num1;
//        } else {
//            return num2;
//        }
    int masGrande = (num1 > num2) ? num1 : num2;
    return masGrande;
    }

}
