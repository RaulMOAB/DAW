/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package functionreturnvalues;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class FunctionReturnValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor y lo doblo por 2. Luego el resultado será multiplicado por 3");
        int num = sc.nextInt();
        int valorDobaldo = doblarNumero(num);
        int triple = multiplicaTres(valorDobaldo);
        System.out.println("Numero " + num + " Valor doblado " + valorDobaldo);
        System.out.println("El valor doblado " + valorDobaldo + " El triple es " + triple);
    }
    /**
     * funcion que dobla el numero pasado
     * @param value numero pasado
     * @return 
     */
    public static int doblarNumero(int value){
        int doblar = value * 2;        
        return doblar;
    }
    /**
     * triplica el numero doblado anteriormente
     * @param value valor doblado
     * @return 
     */
    public static int multiplicaTres(int value){
        int multiplica = value * 3;
        return multiplica;
    }
}
