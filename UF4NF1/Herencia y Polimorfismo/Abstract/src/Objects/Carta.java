/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public abstract class Carta {
    protected int hp;
    protected int attack;
    protected int lvl;
    protected int num_cards;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getNum_cards() {
        return num_cards;
    }

    public void setNum_cards(int num_cards) {
        this.num_cards += num_cards;
    }
    
    public void recibitAtaque(int impact){
        this.hp -= impact;
    }
    /**
     * Metodo abstracto que fija que todos los hijos deberan codificarlo
     */
    public abstract void mejorarCarta();
    
    
    
    
}
