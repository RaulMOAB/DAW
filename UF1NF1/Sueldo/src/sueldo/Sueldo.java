/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldo;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int salary= 0;
        int raise = 0;
        int percent;
        int salaryRaised = salary + raise;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu sueldo");
        salary = sc.nextInt();
        
        if(salary < 18000){
        
        percent = 12;
        raise = (salary * percent) / 100;
        salaryRaised = salary + raise;
        
            
        }else if(salary > 18000 && salary <= 30000){
        
        percent = 10;   
        raise = (salary * 10) / 100;
        salaryRaised = salary + raise;
                }
        System.out.println("El aumento de sueldo es de " + raise + "€ \n"
                    + "el año que viene vas a tener un sueldo de " +salaryRaised);
    }
    
}
