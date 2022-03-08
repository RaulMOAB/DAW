/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractmascotas;

import Objects.Canario;
import Objects.Loro;
import Objects.Mascotas;
import Objects.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class AbstractMascotas {

    public static void main(String[] args) {
        Inventario utils = new Inventario();

        loadAnimals(utils);
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    System.out.println("Opcion no implementada todavia");
                    break;
                case 2:
                    System.out.println("Opcion no implementada todavia");
                    break;
                case 3:
                    displayAllAnimals(utils);
                    break;
                case 4:
                    addAnimals(utils);
                    break;
                case 5:
                    deleteAnimals(utils);
                    break;
                case 6:
                    clearInventary(utils);
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (option != 0);

    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("◦ 1 Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal).\n"
                + "◦ 2 Mostrar todos los datos de un animal concreto.\n"
                + "◦ 3 Mostrar todos los datos de todos los animales.\n"
                + "◦ 4 Insertar animales en el inventario.\n"
                + "◦ 5 Eliminar animales del inventario.\n"
                + "◦ 6 Vaciar el inventario.\n"
                + "0 Salir");
        option = sc.nextInt();

        return option;

    }

    private static void loadAnimals(Inventario utils) {
        utils.addAnimals(new Perro("Jax", 5, true, 2017, "Bichon Maltes", false));
        utils.addAnimals(new Perro("Opie", 4, true, 2018, "Bichon Maltes", false));
        utils.addAnimals(new Loro("Brasil", true, "largo", true, "Nicolás", 40, true, 1960));
        utils.addAnimals(new Canario("amarillo", true, "corto", false, "Juanca", 80, true, 1950));
    }

    private static void displayAllAnimals(Inventario utils) {
        utils.displayList();
    }

    private static void addAnimals(Inventario utils) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre animal:");
        String name = sc.nextLine();
        System.out.print("edad animal");
        int age = sc.nextInt();
        System.out.print("Año nacimiento");
        int year = sc.nextInt();
        boolean alive = true;
        sc.nextLine();// clear buffer
        System.out.print("¿Que tipo de animal es?");
        String type_animal = sc.nextLine().toUpperCase();
        
        Perro dog;
        Canario bird;
        switch (type_animal) {
            case "PERRO":
                System.out.print("Raza de perro");
                String race = sc.nextLine();
                boolean fleas = false;//pulgas
                dog = new Perro(name, age, alive, year, race, fleas);
                
                utils.addAnimals(dog);
                break;
            case "CANARIO":
                System.out.print("Color del canario");
                String color = sc.nextLine();
                boolean sing = true;
                boolean fly = true;
                String pico = "corto";
                bird = new Canario(color, sing, pico, fly, name, age, sing, year);
                
                utils.addAnimals(bird);
              break;
            default:
                System.out.println("Opción no valida");
        }
        
    }

    private static void deleteAnimals(Inventario utils) {

    }

    private static void clearInventary(Inventario utils) {
        utils.cleanInventario();
    }

}
