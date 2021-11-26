/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirnum;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class InvertirNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        askNum(sc);
    }

    public static void askNum(Scanner sc) {
        System.out.println("Introduce un numero y te devuelvo el numero con orden inverso y la suma");
        int num = sc.nextInt();
        int result = swapNum(num);
        System.out.println("Suma: " + result);
        
    }
    
    public static int swapNum(int num){
        
        if (num < 10) {
            System.out.println(num);
            return num;
            
        }else{
            
             System.out.print(num % 10);
//           swapNum(num / 10);
            return num % 10 + swapNum(num / 10);
          
        }
        
    }
    
}
