/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hour;
        int minute;
        int second;
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cualquier hora");
        hour = sc.nextInt();
        System.out.println("Introduce cualquier minuto");
        minute = sc.nextInt();
        System.out.println("Introduce cualquier segundo");
        second = sc.nextInt();
        //
        int totalSecond= second++;
        if(second == 60){
        minute++;
            System.out.println(totalSecond);
        }
        }
        
        
        
    }
    

