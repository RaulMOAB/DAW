/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenrecursividad;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class PracticaExamenRecursividad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        int day = askDay(sc);
        int workout = hourPerDay(day);
        int calories = caloriesPerDay(day);
        displayResult(workout, calories);
        
    }
/**
 * Función que pide los días de entrenamiento al usuario
 * @param sc numero introducido por usuario
 * @return días de entrenamiento
 */
        public static int askDay(Scanner sc){
            System.out.println("Introduce cuantos días has entrenado para saber las horas totales de entreno y calorías totales quemadas");
            return sc.nextInt();
        }
    /**
     * Funcion recursiva que calcula las horas totales de entrenamiento
     *
     * @param day días que ha entrenado
     * @return las horas totales de entrenamiento
     */
    public static int hourPerDay(int day) {
        
        switch (day) {
            case 0:
                return 0;
            case 1:
                return 3;
            default:
                if (day % 4 == 0) {
                    return 1 + hourPerDay(day - 1);
                }
                return 3 + hourPerDay(day - 1);
        }
        
    }
    /**
     * Función que calcula las calorías quemadas segun los días de entrenamiento
     *
     * @param day dias que ha entrenado
     * @return calorías totales consumidas
     */
    public static int caloriesPerDay(int day) {
        final int calories = 150;
        if (day == 0) {
            return 0;        
        } else if (day % 6 == 0 || (day % 4 == 0 && day % 6 == 0)) {
            return caloriesPerDay(day - 1);
        } else if (day % 4 == 0) {
            return calories + caloriesPerDay(day - 1);
        } 
        return 3 * calories + caloriesPerDay(day - 1);
    }

    private static void displayResult(int workout, int calories) {
        System.out.println("Has entrenado " + workout + " horas a la semana");
        System.out.println("Has quemado " + calories + " calorías");
    }

}
