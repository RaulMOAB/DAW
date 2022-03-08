/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Raul
 */
public abstract class Aves extends Mascotas {
    protected String pico;
    protected boolean fly;

    public Aves(String pico, boolean fly, String name, int age, boolean state, int birth_year) {
        super(name, age, state, birth_year);
        this.pico = pico;
        this.fly = fly;
    }

    public String getPico() {
        return pico;
    }

    public boolean isFly() {
        return fly;
    }

    @Override
    public String toString() {
        String Mascotas = super.toString();
        return  Mascotas + " , pico: " + pico + ", vuela= " + fly ;
    }
    
    protected abstract void fly();
    
    
}
