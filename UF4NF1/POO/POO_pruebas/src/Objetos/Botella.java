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
    private String material;
    private int capacidad_total;
    private int cap_actual;
    private boolean tapado;
     
    public Botella(){//constructor
        this.setMaterial("vidre");
        this.capacidad_total = 1000;
        this.cap_actual = 0;
        this.tapado = true;
    }
    
    public Botella(String material, int capacidad_total){
        this.setMaterial(material);
        this.capacidad_total = capacidad_total;
        this.cap_actual = 0;
        this.tapado = true;
    }
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

    public void rellenarCapacidadActual(int cantidad_rellenar) {// rellenar botella 
        if ((this.cap_actual + cantidad_rellenar) < this.capacidad_total) {// si la capacidad_actual mas lo que rellenas es menor a la capacidad total
            this.cap_actual += cantidad_rellenar;
        }else{// supera la capaidad total
            this.cap_actual = this.capacidad_total;
        }
        
    }
    public boolean isTapada(){
        return tapado;
    }
    
    public void taparBotella(){
        tapado = true;
    }
    
        public void abrirBotella(){
        tapado = false;
    }
    public int verter(){
        final int CANTIDAD_VERTIDA = 25;
        if (!this.isTapada()) {// si esta abierta la botella
            if (this.cap_actual < CANTIDAD_VERTIDA) {
                int mlQueda = this.cap_actual;
                this.cap_actual = 0;//botella vacía
                return mlQueda;
            }else{
                this.cap_actual -= CANTIDAD_VERTIDA;
                return CANTIDAD_VERTIDA;
            }
        }
        return -1;// si esta tapada
    }
    
}
