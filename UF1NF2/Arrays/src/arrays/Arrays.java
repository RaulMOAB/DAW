/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] notes = new int [4];
//        notes[0] = 6;
//        notes[6] = 8;
//        notes[3] = 5;
//        notes[1] = 2;
//        notes[2] = 10;
//        notes[5] = 2;
//        notes[4] = 3;

        // Inicializacion por el usuario
//        for (int j = 0; j < notes.length; j++) {
//            System.out.print("Pon nota para el alumno " + (j+1) + ": ");
//            notes[j] = sc.nextInt();
//        }
        // Inicializa el array con valores random
        for (int k = 0; k < notes.length; k++) {
            notes[k] = r.nextInt(11);
        }

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Posicion: " + i + " = " + notes[i]);
        }
        //Calcula la media de las notas
        int acumNotes = 0;
        for (int p = 0; p < notes.length; p++) {
            acumNotes += notes[p];
        }
        double media = (double)acumNotes / notes.length;
        System.out.println("La media de las notas es: " + media);
       
              
    }
    
}
