/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import Objects.Alumno;
import Objects.Persona;
import Objects.Profesor;

/**
 *
 * @author alumne
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Paz", "1", "calle1", "662171186");
        Alumno al1 = new Alumno(1, "DAW", 1, "Raul", "1", "calle1", "678938261");
        Profesor profe = new Profesor(1, "informática", "Paz", "1","calle1","662171186");
        
        p1.saludarPorManyana();
        al1.saludarPorManyana();
        profe.saludarPorManyana();
        
        System.out.println(al1.toString());
        System.out.println(p1.toString());
        System.out.println(profe.toString());
        
    }
    
}
