/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spiderrecursive;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class SpiderRecursive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantas arañas tienes y te cuento sus patas");
        int spider = sc.nextInt();
        int spiderLegs = potes(spider);
        System.out.println("Total de patas: " + spiderLegs);
    }
    
    public static int potes(int spider){
        
//        if (spider <= 1) {
//            return 8;
//        }else{
//            
//            return 8 + potes(spider - 1);
//        }
        if (spider <= 1) {
            return 8;
        }else{
            if (spider % 2 == 0) {
                return 6 + potes(spider - 1);
            }else{
            return 8 + potes(spider - 1);
            }
            
            
        }
    }
    
}
