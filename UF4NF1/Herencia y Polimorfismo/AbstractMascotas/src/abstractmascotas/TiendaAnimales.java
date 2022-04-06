/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractmascotas;

import Utilities.Menu;
import Objects.Canario;
import Objects.Loro;
import Objects.Perro;
import Utilities.Option;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul
 */
public class TiendaAnimales {

    private Inventario tienda;//atributo de la clase
    private Menu main_menu;

    public static void main(String[] args) {

        TiendaAnimales app = new TiendaAnimales();
        app.runApp();// lanza el metodo run que no es static y no tendra obligacion
        //de llamar a otros metodos static

    }

    private void loadAnimals() {
        tienda.addAnimals(new Perro("Jax", 5, true, 2017, "Bichon Maltes", false));
        tienda.addAnimals(new Perro("Opie", 4, true, 2018, "Bichon Maltes", false));
        tienda.addAnimals(new Loro("Brasil", true, "largo", true, "Nicolás", 40, true, 1960));
        tienda.addAnimals(new Canario("amarillo", true, "corto", false, "Juanca", 80, true, 1950));
    }

    private void displayAllAnimals() {
        tienda.displayList();
    }

    private void displayShortDate() {
        tienda.displayShortDates();
    }

    private void addAnimals() {
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
                tienda.addAnimals(dog);
                break;
            case "CANARIO":
                System.out.print("Color del canario");
                String color = sc.nextLine();
                boolean sing = true;
                boolean fly = true;
                String pico = "corto";
                bird = new Canario(color, sing, pico, fly, name, age, sing, year);

                tienda.addAnimals(bird);
                break;
            default:
                System.out.println("Opción no valida");
        }

    }

    private void deleteAnimals() {

    }

    private void clearInventary() {
        tienda.clearInventario();
    }

    private void runApp() {
        tienda = new Inventario();//es el ArrayList de animales
        main_menu = new Menu("Tienda de Animales");

        addOptionsMenu();

        loadAnimals();//carga animales de muestra
        int option;

        do {
            main_menu.displayMenu();
            option = main_menu.choose();
            switch (option) {
                case 1:

                    displayShortDate();
                    break;
                case 2:

                    break;
                case 3:
                    displayAllAnimals();
                    break;
                case 4:
                    addAnimals();
                    break;
                case 5:
                    deleteAnimals();
                    break;
                case 6:
                    clearInventary();
                    break;
                case 7:
                    saveItems();
                    break;
                case 8:
                    readItems();
                    break;
                case 0:
                    System.out.println("Cerrando aplicación");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (option != 0);

    }

    /**
     * Añade todas las opciones del menu al objeto Menu
     */
    private void addOptionsMenu() {
        main_menu.add(new Option("Salir"));
        main_menu.add(new Option("◦ Mostrar la lista de animales (solo tipo y nombre, 1 línea por animal)."));
        main_menu.add(new Option("◦ Mostrar todos los datos de un animal concreto."));
        main_menu.add(new Option("◦ Mostrar todos los datos de todos los animales."));
        main_menu.add(new Option("◦ Insertar animales en el inventario."));
        main_menu.add(new Option("◦ Eliminar animales del inventario."));
        main_menu.add(new Option("◦ Vaciar el inventario."));
        main_menu.add(new Option("◦ Grabar listado en archivo."));
        main_menu.add(new Option("◦ Recuperar datos del archivo."));

    }

    private void saveItems() {
        int num_items;
        try {
            num_items = tienda.saveItemsToFile();

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no existente " + e.getMessage());
            num_items = 0;
        } catch (IOException ex) {
            System.out.println("Error de escritura " + ex.getMessage());
            num_items = 0;
        }
        System.out.println("Items grabados " + num_items);

    }

    private void readItems() {

    }

}
