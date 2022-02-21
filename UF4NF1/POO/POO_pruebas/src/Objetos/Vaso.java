/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author alumne
 */
public class Vaso {
    private int capacidad_actual;
    private int capacidad_total;
    private String material;
    
    
    public Vaso(){//constructor
        this.material = "vidre";
        this.capacidad_total = 300;
        this.capacidad_actual = 0;
    }

    public Vaso(int capacidad_total) {
        this.material = "vidre";
        this.capacidad_total = capacidad_total;
        this.capacidad_actual = 0;
    }
    
    
    
    public int getCapacidad_actual() {
        return capacidad_actual;
    }

//    public void setCapacidad_actual(int capacidad_actual) {
//        this.capacidad_actual = capacidad_actual;
//    }

    public int getCapacidad_total() {
        return capacidad_total;
    }

    public void setCapacidad_total(int capacidad_total) {
        this.capacidad_total = capacidad_total;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    public void llenarVaso(int llenar_vaso){ //sinonimo de setter comentado
        if ((this.capacidad_actual + llenar_vaso) < this.capacidad_total) {
            this.capacidad_actual += llenar_vaso;
        }else{
            this.capacidad_actual = this.capacidad_total;
        }
    }
    
    public boolean isLleno(){
        return this.capacidad_actual == this.capacidad_total;
    }
    
    public int beberLiquido(int sorbo){
        
        if (this.capacidad_actual >= sorbo) {
            this.capacidad_actual -= sorbo;
        }else{
            sorbo = this.capacidad_actual;// bebe la cantidad que quede
            this.capacidad_actual = 0;
        }
        
        return sorbo;
    }
    
}


