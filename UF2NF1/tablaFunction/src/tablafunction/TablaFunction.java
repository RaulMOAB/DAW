/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablafunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class TablaFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te muestro su tabla de multiplicación");
        int num = sc.nextInt();
        displayTable(num);
    }

    private static void displayTable(int a) throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + a + " = " + i * a);
        }
        Thread.sleep(5000);
    }
    
}
