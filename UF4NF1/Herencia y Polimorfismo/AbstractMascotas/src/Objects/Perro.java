/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author Raul
 */
public class Perro extends Mascotas{
    private String race;
    private boolean has_felas;

    public Perro(String name, int age, boolean state, int birth_year,String race, boolean has_felas ) {
        super(name, age, state, birth_year);
        this.race = race;
        this.has_felas = has_felas;
    }

    public String getRace() {
        return race;
    }

    public boolean isHas_felas() {
        return has_felas;
    }

    @Override
    public String toString() {
        String Mascotas = super.toString();
        return "Perro: "  + Mascotas + ", raza " + race + ", pulgas= " + has_felas;
    }

    @Override
    public void speak() {
        System.out.println("Guau! gof! gof!");
    }
    
    
}
