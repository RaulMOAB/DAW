/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bowlingrecursive;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class BowlingRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numero de filas");
        int line = sc.nextInt();
        int result = bowlingNumber(line);
        System.out.println("El número de bolos es: " + result);
    }
    
    public static int bowlingNumber(int line){
        if (line == 1) {
            return line;
        }else if(line == 0){
            return 0;    
        }else{
            return line + bowlingNumber(line - 1);
        }
    }
    
}
