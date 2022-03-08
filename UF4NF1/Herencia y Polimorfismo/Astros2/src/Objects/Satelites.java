/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class Satelites extends Astros{
    
    private double planet_dist;
    private double planet_orbit;
    private String planet_belongs;

    public Satelites(double planet_dist, double planet_orbit, String planet_belongs, String name, int rotation, double mass) {
        super(name, rotation, mass);
        this.planet_dist = planet_dist;
        this.planet_orbit = planet_orbit;
        this.planet_belongs = planet_belongs;
    }

    public double getPlanet_dist() {
        return planet_dist;
    }

    public void setPlanet_dist(double planet_dist) {
        this.planet_dist = planet_dist;
    }

    public double getPlanet_orbit() {
        return planet_orbit;
    }

    public void setPlanet_orbit(double planet_orbit) {
        this.planet_orbit = planet_orbit;
    }

    public String getPlanet_belongs() {
        return planet_belongs;
    }

    public void setPlanet_belongs(String planet_belongs) {
        this.planet_belongs = planet_belongs;
    }

    @Override
    public String toString() {
        String astros = super.toString();
        return astros + "Satelites{" + "planet_dist=" + planet_dist + ", planet_orbit=" + planet_orbit + ", planet_belongs=" + planet_belongs + '}';
    }
    
    
}

