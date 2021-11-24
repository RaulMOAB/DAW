/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaparrecursiva;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SumaParRecursiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num, result;
      System.out.println("Introduce un numero par y te devuelvo la suma de sus pares");
      num = sc.nextInt();
      result = sumParResult(num);
      System.out.println("Resultado: " + result);
        
       
    }

    public static int sumParResult(int num) {
        if (num % 2 != 0) {
            return -1;
        }else{
            if (num == 0) {// caso base
                return 0;
            }else{
             return num + sumParResult(num -2);
            }
         
        }
    }
    
} 
