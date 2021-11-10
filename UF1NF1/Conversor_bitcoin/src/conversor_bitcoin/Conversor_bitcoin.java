/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversor_bitcoin;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Conversor_bitcoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double currentMoney;
        double bitcoin = 49561;
        double xmr = 233.81;
        int pickOption;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿A qué criptomoneda deseas cambiar? \n"
                + "[1] Bitcoin - Euro\n"
                + "[2] XMR - Euro");
        pickOption = sc.nextInt();
        System.out.print("¿Cuánto dinero tienes? ");
        currentMoney = sc.nextDouble();

        if (pickOption == 1) {
            double bitcoinToEuro = currentMoney * bitcoin;
            System.out.println("1 Bitcoin equivale a 49.561 € \n"
                    + "Has introducido " + currentMoney + " Bitcoin que son " + bitcoinToEuro + " €");
        } else if (pickOption == 2) {
            double xmrToEuro = currentMoney * xmr;
            System.out.println("1 XMR equivale a 233,81 € \n"
                    + "Has introducido " + currentMoney + " monedas XMR que son " + xmrToEuro + " €");
        }
    }

}
