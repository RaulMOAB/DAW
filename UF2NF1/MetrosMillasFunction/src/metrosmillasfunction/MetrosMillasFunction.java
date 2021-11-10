/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metrosmillasfunction;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author alumne
 */
public class MetrosMillasFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("#.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número de millas y te muesto el equivalente a kilometros");
        int numMile = sc.nextInt();
        double result = mileToMetre(numMile);
        System.out.println("Has introducido " + numMile + " milla/s que son " + dc.format(result) + " kilometros");
    }
    /**
     * Funcion que convierte millas a metros
     * @param a numero de millas pasadas del main
     * @return numero de kilometros
     */
    public static double mileToMetre(int a){
        final double  MILE = 1.60934;
        double metre = a * MILE;
        return metre;
    }
}
