/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areafunction;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class AreaFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el ancho del rectángulo");
        double width = sc.nextDouble();
        System.out.println("Introduce la altura del rectángulo");
        double height = sc.nextDouble();
        
        double permietro = calcPerimetro(width, height);
        double area = calcArea(width, height);
        
        System.out.println("El perimetro del rectángulo es " + permietro + " cm");
        System.out.println("El area del rectángulo es " + area + " cm2");
    }

    /**
     * Calcula el perímetro de u nrectangulo
     * @param width ancho
     * @param height alto
     * @return perímetro
     */
    public static double calcPerimetro(double width, double height) {
        
        return (width * 2) + (height * 2);
    }
    /**
     * Calcula el area de un rectangulo
     * @param width
     * @param height
     * @return area
     */
    public static double calcArea(double width, double height) {
        return width * height;
    }
    
}
