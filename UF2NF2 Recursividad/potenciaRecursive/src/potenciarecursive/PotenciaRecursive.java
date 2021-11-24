/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenciarecursive;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class PotenciaRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base de la potencia");
        int base = sc.nextInt();
        System.out.println("Introduce la potencia");
        int expo = sc.nextInt();
        int potencia = potenciaRecursiva(base, expo);
        System.out.println("Resultado: " + potencia);
    }

    public static int potenciaRecursiva(int base, int expo) {
        
        switch (expo) {
            case 0:
                return 1;
            case 1:
                return base;
            default:
                return base * potenciaRecursiva(base, expo - 1);
        }
    }
    
}
