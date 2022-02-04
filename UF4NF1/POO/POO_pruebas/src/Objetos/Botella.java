/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Botella {
    public String material;
    public int capacidad_total;
    public int cap_actual;
    public boolean tapado;
       
    //metodos
    public void setMaterial(String nou_material){
        if (nou_material.equalsIgnoreCase("vidre") || nou_material.equalsIgnoreCase("cartro")) {
            this.material = nou_material.toUpperCase();
        }else{
            System.out.println("Material no permés");
        }
        
    }
    
    public String getMaterial(){
        return material;
    }

    public int getCapacidad_total() {
        return capacidad_total;
    }

    public void setCapacidad_total(int capacidad_total) {
        this.capacidad_total = capacidad_total;
    }

    public int getCap_actual() {
        return cap_actual;
    }

    public void setCap_actual(int cap_actual) {
        this.cap_actual = cap_actual;
    }
    
}
