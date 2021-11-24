/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorial;

/**
 *
 * @author alumne
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Factorial de 5 es " + factorial(5));
    }
    public static int factorial (int value){
    
        if (value == 0 || value == 1) {
            return 1;
        }else if(value < 0){
            return -1;
        }else{// caso recursivo
           return value * factorial(value -1);
        }
        
    }
}
