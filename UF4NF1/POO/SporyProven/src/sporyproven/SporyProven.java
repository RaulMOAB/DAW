/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sporyproven;

import Objects.Song;
import Objects.SongDAO;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SporyProven {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ArrayList de canciones
        ArrayList<Song> sporify = new ArrayList<Song>();
        
        SongDAO utils = new SongDAO();
        testSong(sporify);
        
        displayMenu();
    }

    private static void displayMenu() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Insertar Canción\n"
                + "2. Borrar Canción\n"
                + "3. Listar Canción\n"
                + "4. Listar Canciones de un àlbum\n"
                + "5. Generar lista de canciones dinámica para reproducir\n"
                + "6. Salir");
            option = sc.nextInt();
        } while (option < 1 || option > 6);
        
    }

    private static void testSong(ArrayList<Song> sporify) {
        sporify.add(new Song("Highway to Hell", "AC/DC"));
    }

}
