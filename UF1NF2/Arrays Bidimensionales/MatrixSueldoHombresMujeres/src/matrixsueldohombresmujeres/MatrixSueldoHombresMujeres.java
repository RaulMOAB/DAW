/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixsueldohombresmujeres;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class MatrixSueldoHombresMujeres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int people = askDates("Cuantos trabajadores hay?");
        double [][] salary = new double[people][2];
        
        fillArray(salary);
        displayArray(salary);
        double salaryGenero = calcSalaryGenero(salary);
        System.out.println("La breacha es de: " + salaryGenero);
        
    }

    public static int askDates(String phrase) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(phrase);
        num = sc.nextInt();
        return num;
    }

    public static void fillArray(double[][] salary) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int genero, sueldo;
        for (int fila_trabajador = 0; fila_trabajador < salary.length; fila_trabajador++) {
            System.out.println("Genero del trabajador " + (fila_trabajador + 1)  + " [0]varon [1]mujer");
            genero = sc.nextInt();
            System.out.println("Sueldo del trabajador " + (fila_trabajador + 1));
            sueldo = sc.nextInt();
            salary[fila_trabajador][0] = genero;
            salary[fila_trabajador][1] = sueldo;
            
        }
    }

    public static void displayArray(double[][] salary) {
        for (int i = 0; i < salary.length; i++) {
            for (int j = 0; j < salary[i].length; j++) {
                System.out.println(salary[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static double calcSalaryGenero(double[][] salary) {
        double man = 0, woman = 0;
        int num_man = 0, num_woman= 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i][0] == 0) {//hombres
                man += salary[i][1];
                num_man++;
            }else if(salary[i][0] == 1){
                woman += salary[i][1];
                num_woman++;
            }
        }
        double avgSalaryMan = (double) man / num_man;
        double avgSalaryWoman = (double) woman / num_woman;
        return (avgSalaryMan - avgSalaryWoman);
    }
    
}
