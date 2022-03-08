/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractmascotas;

import Objects.Mascotas;
import java.util.ArrayList;

/**
 *Clase DAO
 * @author alumne
 */
public class Inventario {
    private ArrayList<Mascotas> listaMascotas;

    public Inventario() {
        this.listaMascotas = new ArrayList<Mascotas>();
    }

    public ArrayList<Mascotas> getListaMascotas() {
        return listaMascotas;
    }
    /**
     * Para saber cuantos animales hay en el inventario
     * @return num de elementos en el ArrayLisy
     */
    public int getNumMascotas(){
        return listaMascotas.size();
    }
    
    public void displayList(){
        for (Mascotas pet : listaMascotas) {
            System.out.println(pet.toString());
        }
        System.out.println("Número de mascotas: " + getNumMascotas());
    }
    /**
     * Elimina los elementos del ArrayList
     */
    public void cleanInventario(){
        listaMascotas.clear();
        System.out.println("La lista ha sido borrada");
    }
    /**
     * Añade animales a la lista
     * @param addPet el obj Mascota que le pasarás
     */
    public void addAnimals(Mascotas addPet){
        //comprobar si ya esta añadido (equals)
        listaMascotas.add(addPet);
    }
    
    
}
