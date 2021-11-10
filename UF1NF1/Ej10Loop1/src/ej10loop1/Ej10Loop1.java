/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10loop1;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej10Loop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double note;
        int i = 0;
        double accNote = 0;
        boolean note10 = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Introduce una nota, [-1] para salir ");
            note = sc.nextDouble();

            if (note > 0 && note <= 10) {
              
                    i++;
                    accNote += note;
                    
                
                if (note == 10) {
                    note10 = true;
                }

            } else if (note != -1) {

                System.out.println("Introduce una nota comprendida entre 0 y 10");

            }

        } while (note != -1);

        if (note10 == true) {
            System.out.println("Ha habido algún 10");
        } else {
            System.out.println("No has puesto ningún 10");
        }
        
double average = accNote/i;
        
        System.out.println("Has puesto " + i + " notas");
        System.out.println("La media es de " + average);
    }

}
