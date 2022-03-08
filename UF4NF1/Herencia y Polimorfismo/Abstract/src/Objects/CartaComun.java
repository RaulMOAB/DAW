/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class CartaComun extends Carta{

    public CartaComun() {
        this.lvl = 1;
        this.hp = 1000;
        this.num_cards = 0;
        this.attack = 100;
    }
    
    @Override
    public void mejorarCarta() {
           if (num_cards >= 1000) {
            lvl++;
            System.out.println("Comun sube de nivel " + this.lvl);
            num_cards = 0;
        }
    }
    
}
