/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenstringarrays;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ExamenStringArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, apellido, dni, cod_cliente;
        int num_producto;
        int valor = 66;
        double precio_producto = 0, precio_total, calcular_descuento = 0, precio_total_descuento, descuento;
        boolean valor_superior;
        
        nombre = pedirDato("Introduce tu nombre");
        apellido = pedirDato("Introduce tu apellido");
        dni = pedirDato("Introduce tu DNI con letra");
        num_producto = pedirNumProductos("¿Cuantos productos has comprado?");
        
        double[] productos = new double[num_producto];
        precio_total = suma(productos, precio_producto);
        System.out.println("El precio total sin descuentos es " + precio_total + "€");

        valor_superior = hayMayorQue(productos, valor);
        cod_cliente = mostrarCodigo(nombre, apellido, dni);

        //////////////////////////////////////////////////////////////
        //Descuentos
        descuento = 0.03;
        precio_total_descuento = calculaDescuento(precio_total, calcular_descuento, descuento);// funciona

        if (precio_total >= 100) {
            descuento += 0.05;
            precio_total_descuento = calculaDescuento(precio_total, calcular_descuento, descuento);
        }
        if (valor_superior) {
            descuento += 0.06;
            precio_total_descuento = calculaDescuento(precio_total, calcular_descuento, descuento);
        }
        if (difMaxMin(productos) > 50) {
            descuento += 0.10;
            precio_total_descuento = calculaDescuento(precio_total, calcular_descuento, descuento);
        }
        System.out.println("El precio total con los descuentos para el cliente " + cod_cliente + " aplicados es de " + (precio_total_descuento));
        System.out.println(valor_superior); 

    }

    public static String pedirDato(String frase) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println(frase);
        nombre = sc.nextLine().toUpperCase();
        return nombre;
    }

    public static int pedirNumProductos(String frase) {
        Scanner sc = new Scanner(System.in);
        int productos;
        System.out.println(frase);
        productos = sc.nextInt();
        return productos;
    }

    public static double suma(double[] productos, double precio_producto) {
        Scanner sc = new Scanner(System.in);
        double precio_total = 0;
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Introduce el precio del " + (i + 1) + " prodcuto");
            precio_producto = sc.nextDouble();
            productos[i] = precio_producto;
            precio_total += productos[i];

        }
        return precio_total;
    }

    public static boolean hayMayorQue(double[] productos, int valor) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] >= valor) {
                return true;
            }
        }
        return false;
    }

    public static double difMaxMin(double[] productos) {
        double max = productos[0], min = productos[0];
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] > max) {
                max = productos[i];
            } 
            if (productos[i] < min) {
                min = productos[i];
            }
        }
        return max - min;
    }

    public static String mostrarCodigo(String nombre, String apellido, String dni) {//47324853F
        String code = nombre.substring(0, 2) + apellido.substring(0, 2) + dni.substring(5, 9);
        return code;
    }

    private static double calculaDescuento(double precio_total, double calcular_descuento, double descuento) {

        calcular_descuento = precio_total * descuento;
        double precio_total_descuento = precio_total - calcular_descuento;
        return precio_total_descuento;
    }

}
