/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

import Objects.Hija1;
import Objects.Hija2;
import Objects.Madre;

/**
 *
 * @author alumne
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Madre m1 = new Madre();
       Hija1 h1 = new Hija1();
       Hija2 h2 = new Hija2();
       
       Madre polimadre;
       polimadre = m1;
       polimadre.llamame();
       
       polimadre = h1;
       polimadre.llamame();
       
       polimadre = h2;
       polimadre.llamame();
       ((Hija2) polimadre).edad = 24;
    }
    
}
