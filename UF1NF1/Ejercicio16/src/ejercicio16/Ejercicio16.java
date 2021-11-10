/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double note;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nota ");
        note = sc.nextDouble();
        
        //Comprobar notas
        if(note >= 0 && note < 3){
            System.out.println("Muy deficiente");
        }else if(note >= 3 && note < 5){
            System.out.println("Insuficiente");
        }else if(note >= 5 && note < 6){
            System.out.println("Bien");
        }else if(note >= 6 && note < 9){
            System.out.println("Notable");
        }else{
            System.out.println("Sobresaliente");}
    
    }
    
}
