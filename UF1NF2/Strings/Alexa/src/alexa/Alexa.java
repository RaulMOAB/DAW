/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexa;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Alexa {

    /**
     * Pedir nombre y guardarlo Pedir instruccion y gardarlo en un String
     * pasarlo todo a mayusculas Validar que empiece por Alexa, si no que vuelva
     * a preguntar o terminar programa si es que si recortar string para
     * eliminar Alexa "(String instruccion) if o switch intruccion es "Buenos
     * dias" llamar funcion buenosDias
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, alexa_comand, comand;
        boolean exit = false;
        name = askDates("Dime tu nombre");
        do {

            alexa_comand = askDates("Introduce instrucción");
            alexa_comand = alexa_comand.toUpperCase();

            if (validateComand(alexa_comand)) {
                comand = alexa_comand.substring(6);//recorta la instruccion desde "[ALEXA ] al final del String, te quedas con la instruccion"

                exit = comand_menu(comand, name);

            } else {
                System.out.println("Introduce ALEXA para empezar");
            }
        } while (!exit);

    }

    public static String askDates(String frase) {
        Scanner sc = new Scanner(System.in);
        String user_name;
        System.out.println(frase);
        user_name = sc.nextLine();
        user_name = user_name.substring(0, 1).toUpperCase() + user_name.substring(1);//coge la primera letra y la pasa a MAYUS
        return user_name;
    }

    /**
     * Devuelve true si empieza por "Alexa "
     *
     * @param alexa_comand
     * @return
     */
    private static boolean validateComand(String alexa_comand) {
        return alexa_comand.startsWith("ALEXA ");
    }

    /**
     * Función que hará todas las funcionalidades de Alexa
     *
     * @param comand funcion que queremos que Alexa ejecute
     * @return true para salir, false si aun no hay que salir
     */
    private static boolean comand_menu(String comand, String name) {
        boolean exitProgram = false;
        if (comand.equalsIgnoreCase("Buenas noches")) {
            System.out.println("Buenas noches " + name);
            exitProgram = true;//termina programa
        } else if (comand.equalsIgnoreCase("Buenos dias")) {
            System.out.println("Buenos días " + name);

        } else if (comand.equalsIgnoreCase("Canta una cancion")) {
            singSong();
        } else if (comand.startsWith("HABLA CON LA ")) {// Las intrucciones estan en MAYUS
            char letter = comand.charAt(13);
            String phrase = comand.substring(20);
            phrase = phrase.replace('A', letter);
            phrase = phrase.replace('E', letter);
            phrase = phrase.replace('I', letter);
            phrase = phrase.replace('O', letter);
            phrase = phrase.replace('U', letter);
            System.out.println(phrase);

        } else if (comand.equalsIgnoreCase("Tablas de multiplicar")) {
           multiplicar();           
        } else if (comand.equalsIgnoreCase("Dime mi edad")) {
            calcAge();
        } else {
            System.out.println("Instrucción no reconocida");

        }
        return exitProgram;
    }

    /**
     * Canta la cancion de los elefantes del 2 al 10
     */
    public static void singSong() {
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + " elefantes se balancaban...");
        }
    }

    private static void calcAge() {
        Scanner sc = new Scanner(System.in);
        Calendar cal= Calendar.getInstance();
        int age, currentYear;
        System.out.println("En que año naciste?");
        age = sc.nextInt();       
        currentYear= cal.get(Calendar.YEAR);
        System.out.println("Tienes " + (currentYear - age));

    }

    public static void multiplicar() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        int value1,value2;
        value1 = r.nextInt(10) + 1;
        value2 = r.nextInt(10) + 1;
        int result;
        System.out.println("Cuanto es " + value1 + " * " + value2);
        long start = System.currentTimeMillis(); /*temps en ms*/
        result = sc.nextInt();
        long end = System.currentTimeMillis(); /*temps en ms*/
        int seconds = (int)(end - start) / 1000;
        
        if (result == (value1 * value2) && seconds < 5) {
            System.out.println("Correcto");
        }else{
            System.out.println("Vuelve a primaria");
        }
        
    }

}
