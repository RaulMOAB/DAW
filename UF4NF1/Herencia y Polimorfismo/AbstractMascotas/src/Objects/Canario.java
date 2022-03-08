/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Raul
 */
public class Canario extends Aves {
    private String color;
    private boolean sing;

    public Canario(String color, boolean sing, String pico, boolean fly, String name, int age, boolean state, int birth_year) {
        super(pico, fly, name, age, state, birth_year);
        this.color = color;
        this.sing = sing;
    }

    public String getColor() {
        return color;
    }

    public boolean isSing() {
        return sing;
    }

    @Override
    public void fly() {
       if(fly){
           System.out.println("El canario vuela...");
       }else{
           System.out.println("El canario no vuela ");
       } 
    }

    @Override
    public String toString() {
        String Mascotas = super.toString();
         return "Canario: " + Mascotas + ", color " + color + ", canta= " + sing;
    }

    @Override
    public void speak() {
        System.out.println("Pío pío!!!");
    }

    @Override
    public void respirar() {
        System.out.println("Respiro por el pico");
    }
    
}
