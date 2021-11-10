/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablaejer4;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Tablaejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int table;
        int result;
        int cont = 0;
        
        
        for (table = 1; table <= 10; table++) {
            System.out.println("Tabla del " + table);
            for (int i = 0; i <= 10; i++) {
            
            result = table * i;
            
            System.out.println(table + " x " + i + " = " + result);
        }
        
            
        }
        
            


        
    }

}
