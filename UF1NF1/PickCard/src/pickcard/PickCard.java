/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pickcard;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PickCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char pick;
        int trophy;
        //int card1 = 0;
        //int card2 = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas copas tienes?");
        trophy = sc.nextInt();

        if (trophy < 2000) {
            System.out.println("Elige una carta Mago electrico (m) o Mega esbirro (e)");
            sc.nextLine();
            pick = sc.nextLine().charAt(0);
            if (pick == 'm' || pick == 'M') {
                System.out.println("Has elegido el Mago electrico");
            } else if (pick == 'e') {
                System.out.println("Has elegido el Mega esbirro");

            } else {
                System.out.println("Opcion incorrecta");
            }
        } else if (trophy > 2000 && trophy < 3000){
            System.out.println("Elige una carta Caballero (c) o Bandida (b)");
            sc.nextLine();
            pick = sc.nextLine().charAt(0);
            if (pick == 'c' || pick == 'C') {
                System.out.println("Has elegido Caballero");
            } else if (pick == 'b' || pick == 'B') {
                System.out.println("Has elegido Bandida");
            }else{
                System.out.println("Opcion incorrecta");
            }

        }else{
            System.out.println("Nuevas cartas");
        }
    }
}
