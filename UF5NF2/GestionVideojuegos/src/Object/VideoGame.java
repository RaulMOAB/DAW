/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Object;

import java.util.Objects;

/**
 *
 * @author Raul
 */
public class VideoGame {
    private String name;
    private String platform;
    private int qty;
    private String online;

    public VideoGame(String name, String platform, int qty, String online) {
        this.name = name;
        this.platform = platform;
        this.qty = qty;
        this.online = online;
    }

    public VideoGame(String name) {
        this.name = name;
    }
    
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online;
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
        final VideoGame other = (VideoGame) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", plataforma: " + platform + ", unidades: " + qty + ", online: " + online;
    }
    
    
}
