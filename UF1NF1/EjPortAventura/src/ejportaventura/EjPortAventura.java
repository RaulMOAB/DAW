/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejportaventura;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class EjPortAventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int people;
        int child;
        int adultPrice = 20;
        int childPrice = 10;
        double sale = 0.25;
        double discount;
        double totalPrice;

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantas personas sois?");
        people = sc.nextInt();
        System.out.println("¿Cuantos niños hay?");
        child = sc.nextInt();
        int adult = people - child;

        int price = (adult * adultPrice) + (child * childPrice);
        System.out.println("price... " + price);

        if (people >= 10 && people < 25) {
            discount = price * sale;
            totalPrice = price - discount;
            System.out.println("Sois " + adult + " adultos y " + child + " niños \n"
                    + "Al ser más de 10 personas se aplica un descuento del 25 %, el precio final es de \n"
                    + totalPrice + "€");
           

        } else if (people > 25) {
            
            discount = price * sale;
            totalPrice = price - discount;
            if(adult > 0){
            adult--;
            }else{
            child--;
            }
            
            
            System.out.println("Sois " + (adult > 0 ? adult +1 : 0) + " adultos y " + child + " niños \n"
                    + "Al ser más de 10 personas se aplica un descuento del 25 %, el precio final es de \n"
                    + totalPrice + "€");

        } else {
            totalPrice = price;
            System.out.println("Sois " + adult + " adultos y " + child + " niños \n"
                    + "El precio final es de " + totalPrice + "€");

        }
    }

}
