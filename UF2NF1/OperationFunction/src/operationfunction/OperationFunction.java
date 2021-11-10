/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operationfunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class OperationFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1, valor2;
        int resultado = 0; //operacion 
        int opcion;
        double total = 0;
        System.out.println("Valor 1");
        valor1 = validatePositive(sc);
        System.out.println("Valor 2");
        valor2 = validatePositive(sc);
        displayMenu();
        opcion = pickOption(sc);

        if (opcion == 3) {
            resultado = calcProduct(valor1, valor2);
        } else if (opcion == 4) {
            total = calcDivi(valor1, valor2);
        }
        System.out.println("El resultado de la operación elegida es " + resultado);
        System.out.println("El resultado de la operación elegida es " + total);
    }

    public static int calcProduct(int num1, int num2) {
        return num1 * num2;
    }

    public static double calcDivi(int num1, int num2) {
        return (double) num1 / num2;
    }
/**
 * Muestra el menú
 */
    public static void displayMenu() {
        System.out.println("1.- Calcular suma");
        System.out.println("2.- Calcular resta");
        System.out.println("3.- Calcular multiplicación");
        System.out.println("4.- Calcular división");
        System.out.print("Pon opcion");
    }
/**
 * Valora la opción escogida y si esta mal te pide que pongas una opción correcta
 * @param sc
 * @return 
 */
    public static int pickOption(Scanner sc) {

        int option;
        do {
            option = sc.nextInt();
            if (option < 1 || option > 4) {
                System.out.println("opcion incorrecta");
            }
        } while (option < 1 || option > 4);
        return option;
    }
/**
 * valida que pongas numeros positivos
 * @param sc
 * @return 
 */
    public static int validatePositive(Scanner sc) {
        int value;
        do {
            System.out.println("Pon el un valor positivo");
            value = sc.nextInt();
            
            if (value < 0) {
                System.out.println("introduce un valor positivo");
            }
        } while (value < 0);// si es negativo vuelve a preguntar
        return value;
    }
}
