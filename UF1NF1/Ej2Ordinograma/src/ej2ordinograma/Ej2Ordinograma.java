/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2ordinograma;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ej2Ordinograma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número ");
        num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Has introducido el número " + num + " y es par");
            if(num % 3 == 0){
                System.out.println("Además es divisible entre 3");
            }
        }else{
            System.out.println("Has introducido el número " + num + " y es impar");
        }
    }
    
}
