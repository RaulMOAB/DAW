/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleloopattack;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ClashRoyaleLoopAttack {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qué nivel tiene tu carta (mínimo lvl 9) ");
        int cardLvl = sc.nextInt();
        int damage = 0;
        int cardVitalpoint = 0;
        System.out.print("Qué nivel tiene la torre? (Minimo lvl 9) ");
        int towerLvl = sc.nextInt();
        int vitalPoint = 0;
        int hit = 0;
        int towerDamage = 0;

        switch (cardLvl) {
            case 9:
                damage = 200;
                cardVitalpoint = 1060;
                break;
            case 10:
                damage = 220;
                cardVitalpoint = 1166;
                break;
            case 11:
                damage = 242;
                cardVitalpoint = 1282;
                break;
            case 12:
                damage = 266;
                cardVitalpoint = 1409;
                break;
            case 13:
                damage = 292;
                cardVitalpoint = 1547;
                break;
            default:
                System.out.println("Introduce el nivel de la carta del 9 al 13");
        }

        switch (towerLvl) {
            
            case 7:
                vitalPoint = 2184;
                towerDamage = 78 * 2;
                break;
            case 8:
                vitalPoint = 2352;
                towerDamage = 84 * 2;
                break;
            case 9:
                vitalPoint = 2534;
                towerDamage = 90 * 2;
                break;
            case 10:
                vitalPoint = 2786;
                towerDamage = 99 * 2;
                break;
            case 11:
                vitalPoint = 3052;
                towerDamage = 109 * 2;
                break;
            case 12:
                vitalPoint = 3346;
                towerDamage = 119 * 2;
                break;
            case 13:
                vitalPoint = 3668;
                towerDamage = 131 * 2;
                break;
            default:
                System.out.println("Introduce el nivel de la torre del 9 al 13");
        }

        while (vitalPoint > 0 && cardVitalpoint > 0) {
            hit++;
            cardVitalpoint = cardVitalpoint - towerDamage;
            vitalPoint = vitalPoint - damage;

            if (vitalPoint < 0) {
                vitalPoint = 0;

            }
            if (cardVitalpoint < 0) {
                cardVitalpoint = 0;
            }

            System.out.println("Leñador atacó con fuerza " + damage + " a la tore le queda " + vitalPoint + " puntos de vida y has realizado " + hit + " ataques");
            System.out.println("La torre se defiende atacando con " + towerDamage + " puntos de ataque, te quedan " + cardVitalpoint + " puntos de vida! te han atacado " + hit + " veces.");
            Thread.sleep(500);

        }

        if (cardVitalpoint <= 0 && vitalPoint > 0) {
            System.out.println("|----- HA GANADO LA TORRE-----|");
        } else if (vitalPoint <= 0 && cardVitalpoint > 0) {
            System.out.println("|----- HA GANADO EL LEÑADOR ----|");
        } else {
            System.out.println("EMPATE");
        }

    }

}
