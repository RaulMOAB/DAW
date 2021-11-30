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
        System.out.println("Introduce cuantos días has entrenado para saber las calorías totales quemadas");
        int day = sc.nextInt();
        //int workout = hourPerDay(day);
        int calories = hourPerDay(day);
        //System.out.println("Has entrenado " + workout + " horas a la semana");
        System.out.println("Has quemado " + calories + " calorías");
    }

    /**
     * Funcion recursiva que calcula las horas totales de entrenamiento
     *
     * @param day días que ha entrenado
     * @return las horas totales de entrenamiento
     */
//    public static int hourPerDay(int day) {
//        
//        if (day == 0) {
//            return 0;
//        }else if(day == 1){
//            return 3;
//        }else {
//            if (day % 4 == 0) {
//                return 1 + hourPerDay(day - 1);
//            }
//            return 3 + hourPerDay(day - 1);
//        }
//        
//    }
    /**
     * Función que calcula las calorías quemadas segun los días de entrenamiento
     *
     * @param day dias que ha entrenado
     * @return calorías totales consumidas
     */
    public static int hourPerDay(int day) {
        final int calories = 150;
        if (day == 0) {
            return 0;        
        } else if (day % 6 == 0 || (day % 4 == 0 && day % 6 == 0)) {
            return hourPerDay(day - 1);
        } else if (day % 4 == 0) {
            return calories + hourPerDay(day - 1);
        } 
        return 3 * calories + hourPerDay(day - 1);
    }

}
