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
public class Astros {
    protected String name;
    protected int rotation;
    protected double mass;

    public Astros(String name, int rotation, double mass) {
        this.name = name;
        this.rotation = rotation;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRotation() {
        return rotation;
    }

    public void setRotation(int rotation) {
        this.rotation = rotation;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Astros{" + "name=" + name + ", rotation=" + rotation + ", mass=" + mass + '}';
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
        final Astros other = (Astros) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
    
    

}
