/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraycopy;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class ArrayCopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] notes = new int [4];
        int [] finalNotes = new int [4];
        int [] finalNotesSystemCopy = new int [40];
        Random r = new Random();
        
        for (int k = 0; k < notes.length; k++) {
            notes[k] = r.nextInt(11);
        }

        for (int i = 0; i < notes.length; i++) {
            System.out.println("Posicion: " + i + " = " + notes[i]);
        }
        // Copia el array y le suma 2 a cada valor
        for (int j = 0; j < notes.length; j++) {
            finalNotes[j] = notes[j] + 2;
        }
        
        for (int i = 0; i < finalNotes.length; i++) {
            System.out.println("Posicion copia : " + i + " = " + finalNotes[i]);
        }
        
        System.arraycopy(notes, 0, finalNotesSystemCopy, 10, 4);
        
        for (int i = 0; i < finalNotesSystemCopy.length; i++) {
            System.out.println("Posicion copia : " + i + " = " + finalNotesSystemCopy[i]);
        }
    }
    
}
