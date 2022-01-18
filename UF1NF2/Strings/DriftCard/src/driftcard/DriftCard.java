/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package driftcard;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DriftCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] cartas = {"El tronco", "Megacaballero", "Barril de duendes", "Bola de fuego", "Bebé dragón", "Bruja", "Flechas", "Mago eléctrico", "Mago", "Princesa",
        "Murcielágos", "Minero", "Príncipe", "P.E.K.K.A.", "Barril de bárbaro", "Cohete", "Tornado", "Duende lanzadardos", "Chispitas", "Bárbaros"};
        String[]mazo = new String[8];
        for (int i = 0; i < mazo.length; i++) {
            mazo[i] = ".";
        }
        mostrarCartaAleatoria(cartas, mazo);
        int carta_escogida;
        
        for (int posicion = 0; posicion < 8; posicion++) {
            carta_escogida = escogerCarta(cartas);
            llenarMazo(cartas, mazo, carta_escogida, posicion);
            mostrarCartaAleatoria(cartas, mazo);
            System.out.println("---------------");
            mostrarMazo(mazo);
            }
        //mostrarArrayCartas(cards);
        
    }

    public static void mostrarArrayCartas(String[] cartas) {
        for (int i = 0; i < cartas.length; i++) {
            System.out.println(cartas[i]);
        }
    }

    public static void mostrarCartaAleatoria(String[] cartas, String[] mazo) {
        Random r = new Random();
        int carta_aelatoria = 0, carta_aelatoria2 = 0; 
         for (int i = 0; i < 2; i++) {
             do {
                 carta_aelatoria = r.nextInt(cartas.length);
                 carta_aelatoria2 = r.nextInt(cartas.length);
                 
             } while (comprobarRepetido(cartas, carta_aelatoria,carta_aelatoria2, mazo) || carta_aelatoria==carta_aelatoria2);     
             
        }
         System.out.println( (carta_aelatoria + 1) + " - " + cartas[carta_aelatoria]);
             System.out.println( (carta_aelatoria2 + 1) + " - " + cartas[carta_aelatoria2]);
    }

    private static int escogerCarta(String[] cartas) {
        Scanner sc = new Scanner(System.in);
        int carta_escogida;
        System.out.println("Escoge tu carta");
        carta_escogida = sc.nextInt()-1;
        System.out.println("Has escogido: " + cartas[carta_escogida] );
        return carta_escogida;
    }

    private static void llenarMazo(String[] cartas, String[] mazo, int carta_escogida, int posicion) {       
            mazo[posicion] = cartas[carta_escogida];     
    }

    private static void mostrarMazo(String[] mazo) {
        for (int i = 0; i < mazo.length; i++) {
            System.out.println(mazo[i]);
        }
    }
/**
 * Comprueba que la carta que nos ha salido no este en la lista de cartas
 * @param cartas lista de todas las cartas
 * @param carta_aelatoria 
 * @param mazo nuestro mazo donde se añaden las cartas seleccionadas
 * @return true si existe en el mazo (no se añadira), false si no existe
 */
    private static boolean comprobarRepetido(String[] cartas, int carta_aelatoria, int carta_aleatoria2, String[] mazo) {
        for (int i = 0; i < mazo.length; i++) {
            if (mazo[i].equalsIgnoreCase(cartas[carta_aelatoria])) {
                return true;
            }
            if (mazo[i].equalsIgnoreCase(cartas[carta_aleatoria2])) {
                return true;
            }
        }
        return false;
    }

   
   
    
}
