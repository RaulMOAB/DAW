/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SongDAO {

    public boolean insertarCanción(ArrayList<Song> spotify) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el título de la canción");
        String title = sc.nextLine();
        title.toUpperCase().charAt(0);
        System.out.println("Introduce el autor");
        String singer = sc.nextLine();
       
        Song addSong = new Song(title, singer);
        boolean exist = spotify.contains(addSong);

        if (exist) {
            System.err.println("Ya existe esta canción en la lista");
            return false;
        } else {
            System.out.println("Introduce el albúm");
            String album = sc.nextLine();
            album.toLowerCase().charAt(0);
            System.out.println("Introduce la duración de la canción en segundos");
            int duration_seg = sc.nextInt();
            addSong.setAlbum(album);
            addSong.setDuration_seg(duration_seg);
            spotify.add(addSong);
            System.out.println("Se ha añadido la canción correctamente");
            return true;
        }

    }

    public boolean borrarCancion(ArrayList<Song> spotify) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el título de la canción");
        String title = sc.nextLine();
        title.toUpperCase().charAt(0);
        System.out.println("Introduce el autor");
        String singer = sc.nextLine();
        singer.toUpperCase().charAt(0);
        
        Song remove_song = new Song(title, singer);
        
        if (spotify.remove(remove_song)) {
            System.out.println("Se ha eliminado la cancióncorrectamente");
            return true;
        }else{
            System.err.println("La canción no existe en la lista. No se elimina nada");
            return false;
        }
    }
    
    public void listarCanciones(ArrayList<Song> spotify){
        for (int i = 0; i < spotify.size(); i++) {
            System.out.println("Título: " + spotify.get(i).getTitle() + " Autor: " + spotify.get(i).getSinger() + " Album: " + spotify.get(i).getAlbum() + " Duración: " + spotify.get(i).getDuration_seg() + " segundos");
        }
    }
}

