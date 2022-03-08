/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class Persona {
    protected String name;//es privado pero los hijos pueden acceder
    private String DNI;
    private String adress;
    private String phone_num;

    public Persona(String name, String DNI, String adress, String phone_num) {
        this.name = name;
        this.DNI = DNI;
        this.adress = adress;
        this.phone_num = phone_num;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }
    
    public void saludarPorManyana(){
        System.out.println("Soy una persona, Hola qué tal, como estás");
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", DNI=" + DNI + ", adress=" + adress + ", phone_num=" + phone_num + '}';
    }
    
    
}
