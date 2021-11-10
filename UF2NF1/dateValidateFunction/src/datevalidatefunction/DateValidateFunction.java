/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datevalidatefunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DateValidateFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día");
        int day = sc.nextInt();
        System.out.println("Introduce un mes");
        int month = sc.nextInt();
        System.out.println("Introduce un año");
        int year = sc.nextInt();
        boolean date = dateValidate(day, month, year);
        
        if(date)
            System.out.println("Fecha correcta");
        else
            System.out.println("Fecha incorrecta");
    }

    private static boolean dateValidate(int day, int month, int year) {
        boolean check = false;

        if (day >= 1 || day <= 30) {
            if (month >= 1 || month <= 12) {
                if (year > 1900) {
                    check = true;
                }
            }
            
        }
        //else
        //return -1;
        return check;
    }

}
