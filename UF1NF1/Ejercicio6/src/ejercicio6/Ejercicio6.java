/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double article_price;
        double price_paid;
        Scanner ask_price = new Scanner(System.in);
        System.out.println("Introduce el preio del artículo");
        article_price = ask_price.nextDouble();
        System.out.println("precio articulo " + article_price);
        price_paid = ask_price.nextDouble();
        System.out.println("precio venta " + price_paid);
    }
    
}
