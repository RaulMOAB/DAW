/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Raul
 */
public class Gato extends Mascotas {
    private String color;
    private boolean long_hair;

    public Gato( String name, int age, boolean state, int birth_year,String color, boolean long_hair) {
        super(name, age, state, birth_year);
        this.color = color;
        this.long_hair = long_hair;
    }

    public String getColor() {
        return color;
    }

    public boolean isLong_hair() {
        return long_hair;
    }

    @Override
    public String toString() {
        String Mascotas = super.toString();
       return  "Gato: " + Mascotas + ", color de pelo " + color + ", pelo largo= " + long_hair;
    }

    @Override
    public void speak() {
        System.out.println("Miaw miaw");
    }
    
    
}
