/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class CartaEpica extends Carta{

    public CartaEpica() {
        this.lvl = 1;
        this.hp = 2000;
        this.num_cards = 2;
        this.attack = 100;
    }

    @Override
    public void mejorarCarta() {
        if (num_cards >= 20) {
            lvl++;
            System.out.println("Epica sube de nivel " + lvl);
            this.num_cards = 0;
        }
    }
    
}
