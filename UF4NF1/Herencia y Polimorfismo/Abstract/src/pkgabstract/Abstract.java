/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgabstract;

import Objects.CartaComun;
import Objects.CartaEpica;

/**
 *
 * @author alumne
 */
public class Abstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        CartaComun comun = new CartaComun();
        CartaEpica epica = new CartaEpica();
        System.out.println("Comun: " + comun.getLvl());
        System.out.println("Epica: " + epica.getLvl());
        
        while(comun.getLvl() < 3 || epica.getLvl() < 3){
            comun.setNum_cards(200);
            epica.setNum_cards(5);
            System.out.println("Comun = " + comun.getNum_cards());
            System.out.println("Epica = " + epica.getNum_cards());
            comun.mejorarCarta();
            epica.mejorarCarta();
            Thread.sleep(500);
        }
    }
    
}
