/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_pruebas;

import Objetos.Botella;
import Objetos.Vaso;

/**
 *
 * @author alumne
 */
public class POO_pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Botella primera = new Botella();//constructor (reserva memoria)
        Vaso primer_vaso = new Vaso();
        
       
        primera.setMaterial("vidre");
        System.out.println(primera.getMaterial());
        
    }
    
}
