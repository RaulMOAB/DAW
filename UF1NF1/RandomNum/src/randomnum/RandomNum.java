/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomnum;

import java.util.Random;

/**
 *
 * @author alumne
 */
public class RandomNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();    
        int randomNum = r.nextInt(10) + 21; // (10) ---> Numero de numeros que quieres o necesitas
                                            // +21 ----> numero minimo
        System.out.println(randomNum);
    }
    
}
