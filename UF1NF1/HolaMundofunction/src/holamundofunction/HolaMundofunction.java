/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundofunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class HolaMundofunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//       helloWorld();
//       String name = "Raul Montoro";
//       helloWorldName(name);
        int value = 5;
        System.out.println("El valor no clonado antes de funcion " + value);
        aumentaEnDos(value);
        System.out.println("El valor no clonado despues de funcion " + value);
    }

    /**
     * Aumenta el valor pasado en 2
     *
     * @param value tendra el valor pasado desde el main
     */
    private static void aumentaEnDos(int valu) {
        valu+= 2;
        System.out.println("El valor clonado " + valu);
    }

//    public static void helloWorld(){// Funcion helo world. Void no devuelve ningun valor al main
//        System.out.println("Hello World");
//    }
    /**
     * Escribirá hellow world + el nombre
     *
     * @param nam
     */
//    public static void helloWorldName(String nam){
//        System.out.println("Hello world " + nam + " How are you?");
//    }
}
