/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivenegativefunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PositiveNegativeFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número y te digo si es positivo, negativo o cero");
        int num = sc.nextInt();
        int result = positiveNegative(num);
        
        if (result == 1) {
            System.out.println("Has introducido un positivo");
        }else if(result == -1){
            System.out.println("Has introducido un negativo");
        }else{
            System.out.println("Has introducido un cero");
        }

    }

    /**
     * Funcion que comprueba si el valor es positivo, negativo o cero
     *
     * @param sc le pasas un valor del main
     * @return
     */
    private static int positiveNegative(int a) {
        if (a > 0) {
            return 1;
        } else if (a < 0) {
            return -1;
        } else {
            return 0;
        }
    }

}
