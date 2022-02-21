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
    public static void main(String[] args) throws InterruptedException {
        Botella primera = new Botella();//constructor (reserva memoria)
        Botella segona = new Botella("cartro", 1000);
        Vaso primer_vaso = new Vaso();
        Vaso segundo_vaso = new Vaso();
        Vaso tercer_vaso = new Vaso();
        Vaso cuarto_vaso = new Vaso();
        Vaso quinto_vaso = new Vaso();


        primera.rellenarCapacidadActual(950);// rellenar botella


        while (primera.getCap_actual() != 0) {
            if (primera.isTapada()) {
                System.out.println("Abro Botella");
                primera.abrirBotella();
            }
            if (!primer_vaso.isLleno()) {
                primer_vaso.llenarVaso(primera.verter());
                System.out.println("Relleno vaso 1");
                Thread.sleep(1000);
                if (primer_vaso.isLleno()) {
                    System.out.println("Vaso 1 lleno");
                }
            } else if (!segundo_vaso.isLleno()) {
                segundo_vaso.llenarVaso(primera.verter());
                System.out.println("Relleno vaso 2");
                Thread.sleep(1000);
                if (segundo_vaso.isLleno()) {
                    System.out.println("Vaso 2 lleno");
                }
            }
        }

    }

}
