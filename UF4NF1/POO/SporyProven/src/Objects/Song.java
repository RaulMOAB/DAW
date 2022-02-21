/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

import java.util.Objects;

/**
 *
 * @author alumne
 */
public class Song {
    final private String title;
    final private String singer;
    private String album;
    private int duration_seg;
    
    public Song(String title, String singer){
        this.title = title;
        this.singer = singer;
        this.album = "Desconocido";
        this.duration_seg = 0;
        
    }
    
    public Song(String title, String singer, String album, int duration_seg){
        this.title = title;
        this.singer = singer;
        this.album = album;
        this.duration_seg = duration_seg;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public int getDuration_seg() {
        return duration_seg;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }
    

    public void setDuration_seg(int duration_seg) {
        this.duration_seg = duration_seg;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Song other = (Song) obj;
        if (!this.title.equalsIgnoreCase(other.title)) {
            return false;
        }
        return this.singer.equalsIgnoreCase(other.singer);
    }
    
    
    
    
}
