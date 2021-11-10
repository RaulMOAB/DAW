/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenej1;

import java.util.Scanner;

/**
 *
 * @author alumne Escribe un programa que pida números al usuario, el programa
 * pedirá valores numéricos al usuario, y parará cuando lleve 3(1,25pt) números
 * introducidos que sean superiores a 10 y menores que 20. Al terminar, debe
 * mostrar, cuántos números has introducido(1pt), hasta que ha parado, y debe
 * mostrar la suma de los 3 números superior a 10 y menor que 20(1)
 *
 */
public class ExamenEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int contCondition = 0;
        int contNumber = 0;
        int sum = 0;

        while (contCondition < 3) {
            System.out.println("Introduce números");
            number = sc.nextInt();
            contNumber++;
            if (number >= 10 && number <= 20) {
                contCondition++;
                sum += number;
            }

        }
        System.out.println("Has introducido " + contNumber + " números");
        System.out.println("La suma de los números comprendidos entre 10 y 20 es " + sum);
    }

}
