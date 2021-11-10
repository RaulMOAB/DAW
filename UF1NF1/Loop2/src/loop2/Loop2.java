/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loop2;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Loop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean stopLoop = false;
        int num;
        int accSum = 0;// Acumulador
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduce numeros, cuando la suma sea más de 100 terminará ");
            num = sc.nextInt();
            accSum += num;
            if (accSum >= 100) {// Cuando accSum sea más de 100 saldrá del loop
                stopLoop = true;
                
//            }else{
//            stopLoop = true;//Sale del bucle, el while lo pasa a false y sale
            }
        } while (!stopLoop);// Mientras NO sea true, sigue el bucle
        System.out.println("El resultado es: " + accSum);
        System.out.println("Fin de programa");

    }

}
