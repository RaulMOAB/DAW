/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractmascotas;

import Objects.Mascotas;
import Persistencia.PersistenciaArchivo;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    public void clearInventario(){
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
    
    public void displayShortDates(){
        for (Mascotas pet : listaMascotas) {
            System.out.println(pet.displayNameAndType());
        }
    }

    public int saveItemsToFile() throws FileNotFoundException, IOException{
        //graba todo el arrayList en un obj binario
        if(PersistenciaArchivo.saveAllItems(listaMascotas)){
            return listaMascotas.size();//numero de items grabados
        }else{
           return 0; 
        }
        
    }
    
    
}
