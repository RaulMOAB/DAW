/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciosivafunction;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PreciosIvaFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.00");
        System.out.println("Introduce 5 precios y te los devuelvo con el IVA");
        int cont = 0;
        double price;
        double priceIva;
        
        while(cont <= 5){
            System.out.println("Introduce un precio en € ");
            price = sc.nextDouble();
            priceIva = ivaProduct(price);
            cont++;
            System.out.println("El precio con IVA es " + dc.format(priceIva) + "€");
                    
        }
        
    }

    public static double ivaProduct(double price) {
        final double IVA = 0.21;
        double calcIva = price * 0.21;
        double totalPrice = calcIva + price;
        return totalPrice;
    }
    
}
