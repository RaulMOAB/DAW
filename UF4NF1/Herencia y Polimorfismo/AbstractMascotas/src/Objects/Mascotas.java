/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;



/**
 *
 * @author Raul
 */
public abstract class Mascotas implements SerVivo{
    protected String name;
    protected int age;
    protected boolean state;
    protected int birth_year;

    public Mascotas(String name, int age, boolean state, int birth_year) {
        this.name = name;
        this.age = age;
        this.state = state;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isState() {
        return state;
    }

    public int getBirth_year() {
        return birth_year;
    }

    @Override
    public String toString() {
        return  "nombre: " + name + ", edad: " + age + ", estado: " + state + ", nació en " + birth_year;
    }

    
    public void birthday(){
        System.out.println("El animal nació en el " + getBirth_year());
    }
    
    public void death(){
        this.state = false;
        System.out.println("El animal ha muerto :(");
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Mascotas)) {
            return false;
        }
        final Mascotas other = (Mascotas) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
    
    protected abstract void speak();

    @Override
    public void respirar() {
        System.out.println("Respiro");
    }

    @Override
    public void comer() {
        System.out.println("Como");
    }
       
    
    
    
    
    
}
