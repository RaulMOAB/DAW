/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Raul
 */
public class Loro extends Aves{
    private String origin;
    private boolean speak;

    public Loro(String origin, boolean speak, String pico, boolean fly, String name, int age, boolean state, int birth_year) {
        super(pico, fly, name, age, state, birth_year);
        this.origin = origin;
        this.speak = speak;
    }

    public String getOrigin() {
        return origin;
    }

    public boolean isSpeak() {
        return speak;
    }

    @Override
    public void fly() {
        if (fly) {
            System.out.println("El loro sale volando");
        }else{
            System.out.println("El loro no puede volar...");
        }
    }

    @Override
    public String toString() {
        String Mascotas = super.toString();
        return "Loro: " +Mascotas +  ", origen " + origin + ", sabe hablar=" + speak;
    }

    @Override
    public void speak() {
        if (speak) {
            System.out.println("Holii");
        }else{
            System.out.println("Grrrr");
        }
    }
}
