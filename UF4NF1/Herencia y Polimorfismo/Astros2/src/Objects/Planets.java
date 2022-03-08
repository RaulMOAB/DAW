/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class Planets extends Astros{
    private double sun_dist;
    private double sun_orbit;
    private boolean hasSatellities;

    public Planets(double sun_dist, double sun_orbit, boolean hasSatellities, String name, int rotation, double mass) {
        super(name, rotation, mass);
        this.sun_dist = sun_dist;
        this.sun_orbit = sun_orbit;
        this.hasSatellities = hasSatellities;
    }

    public double getSun_dist() {
        return sun_dist;
    }

    public void setSun_dist(double sun_dist) {
        this.sun_dist = sun_dist;
    }

    public double getSun_orbit() {
        return sun_orbit;
    }

    public void setSun_orbit(double sun_orbit) {
        this.sun_orbit = sun_orbit;
    }

    public boolean isHasSatellities() {
        return hasSatellities;
    }

    public void setHasSatellities(boolean hasSatellities) {
        this.hasSatellities = hasSatellities;
    }

    @Override
    public String toString() {
        String astros = super.toString();
        return "Planets{" + "sun_dist=" + sun_dist + ", sun_orbit=" + sun_orbit + ", hasSatellities=" + hasSatellities + "--" + astros;
    }
    
}
