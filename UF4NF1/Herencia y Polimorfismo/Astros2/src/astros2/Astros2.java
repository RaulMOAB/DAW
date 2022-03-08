/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package astros2;

import Objects.Astros;
import Objects.Planets;
import Objects.Satelites;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Astros2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Astros> listaAstros = new ArrayList<>();
        addAstros(listaAstros);
        int option;
        do {
            option = menu();
            switch (option) {
                case 1:
                    displayByIndex(listaAstros);
                    break;
                case 2:
                    displayByName(listaAstros);
                    break;
                case 0:
                    System.out.println("Adiós");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (option != 0);

    }

    private static void addAstros(ArrayList<Astros> listaAstros) {
        listaAstros.add(new Planets(458.25, 468.5, true, "Tierra", 452, 5468.574));
        listaAstros.add(new Planets(467.658, 548.36, true, "Marte", 4658, 58.25));
        listaAstros.add(new Satelites(5458.696, 89.255, "Tierra", "Luna", 3548, 6548));
        listaAstros.add(new Satelites(648.548, 6878, "Marte", "Phobos", 564, 5496.5));
        listaAstros.add(new Satelites(78.548, 36, "Marte", "Phobos2", 56454, 5887.5));
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1.- Mostrar el astro por indice (pondras un indice y te mostrara el astro que esté en esa posición)\n"
                    + "2.- Mostrar el astro por nombre(informaras un nombre y si esta , te mostrará todos sus atributos)\n"
                    + "0.- Salir");
            option = sc.nextInt();
        } while (option < 0 || option > 2);
        return option;
    }

    private static void displayByIndex(ArrayList<Astros> listaAstros) {
        Scanner sc = new Scanner(System.in);
        int index;
        do {
            System.out.println("Introduce el número de astro que deseas ver");
            index = sc.nextInt() - 1;
        } while (index < 0 || index > listaAstros.size());

        System.out.println(listaAstros.get(index).toString());

    }

    private static void displayByName(ArrayList<Astros> listaAstros) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del astro que deseas ver");
        String name = sc.nextLine();
        boolean exist = false;

        for (int i = 0; i < listaAstros.size(); i++) {
            if (listaAstros.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println(listaAstros.get(i).toString());
                exist = true;
                
            }
        }
        if (!exist) {
            System.err.println(name + " no existe");
        }

    }
    

}
