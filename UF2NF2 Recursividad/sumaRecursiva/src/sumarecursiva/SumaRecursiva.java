/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumarecursiva;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SumaRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y te devuelvo la suma de sus numeros consecutivos");
        int num = sc.nextInt();
        int result = recursiveSum(num);
        System.out.println("Resultado: " + result);
    }
    public static int recursiveSum(int n){
        if (n == 1) {
            return n;
        }else{
        return n + recursiveSum(n - 1);
        }
    }
    
}
