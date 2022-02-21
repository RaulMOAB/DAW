/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package araylistejemplos;

import Objects.PuntoCoordenadas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class ArayListEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = new int[100];
        PuntoCoordenadas[] listaCoordenadas = new PuntoCoordenadas[10];//Array objetos
        ArrayList<PuntoCoordenadas> lista_coordenadas_arrayList = new ArrayList<>();
        
        PuntoCoordenadas c = new PuntoCoordenadas(3, 3);
        PuntoCoordenadas d = new PuntoCoordenadas(4,3);
        PuntoCoordenadas e = new PuntoCoordenadas (5,3);
        
        lista_coordenadas_arrayList.add(c);
        lista_coordenadas_arrayList.add(d);
        lista_coordenadas_arrayList.add(e);
       
        System.out.println("Objetos que tiene el ArrayList: " + lista_coordenadas_arrayList.size());
       
        displayArrayList(lista_coordenadas_arrayList);
        
        //contains y remove NECESITAN EL equals importado.
        buscarSiExiste(lista_coordenadas_arrayList);
        borrarSiExiste(lista_coordenadas_arrayList);
        
        displayArrayList(lista_coordenadas_arrayList);
       
        
        //arrayMethods(listaCoordenadas);

    }

    /**
     * recorre el array y en cada posición se llama al constructor (new). Cada
     * posición dejará de ser null
     *
     * @param listaCoordenadas
     */
    private static void inicializarArray(PuntoCoordenadas[] listaCoordenadas) {
        int valueX = 5;
        for (int i = 0; i < listaCoordenadas.length; i++) {
            listaCoordenadas[i] = new PuntoCoordenadas(valueX, i);
        }
        System.out.println("Terminado inicializar");

    }

    private static void arrayMethods(PuntoCoordenadas[] listaCoordenadas) {
        inicializarArray(listaCoordenadas);
        for (PuntoCoordenadas listaCoordenada : listaCoordenadas) {
            System.out.println(listaCoordenada.getX() + "-" + listaCoordenada.getY());
        }
    }

    private static void displayArrayList(ArrayList<PuntoCoordenadas> lista_coordenadas_arrayList) {
         for (int i = 0; i < lista_coordenadas_arrayList.size(); i++) {
             System.out.println(lista_coordenadas_arrayList.get(i).allCoordenates());
        }
    }
/**
 * Pedira X e Y y si existe en la lista un punto igual
 * el contains retorna true, si no false
 * @param lista_coordenadas_arrayList 
 */
    private static void buscarSiExiste(ArrayList<PuntoCoordenadas> lista_coordenadas_arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el punto x de tu coordenada");
        int puntoX = sc.nextInt();
        System.out.println("Pon el punto y de tu coordenada");
        int puntoY = sc.nextInt();
        
        PuntoCoordenadas buscar = new PuntoCoordenadas(puntoX, puntoY);// para compararlo con otro objeto
        System.out.println(buscar.allCoordenates());
        boolean existe = lista_coordenadas_arrayList.contains(buscar);
        int index = lista_coordenadas_arrayList.indexOf(buscar);
        
        if (existe) {
            System.out.println("Este punto existe en la lista");
            System.out.println("y esta en el indice " + index);
        }else{
            System.out.println("Este punto No existe en la lista");
        }
        
    }
    /**
     * PAra borrar
     * @param lista_coordenadas_arrayList 
     */
    private static void borrarSiExiste(ArrayList<PuntoCoordenadas> lista_coordenadas_arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el punto x de tu coordenada a borrar");
        int puntoX = sc.nextInt();
        System.out.println("Pon el punto y de tu coordenada a borrar");
        int puntoY = sc.nextInt();
        
        PuntoCoordenadas buscar = new PuntoCoordenadas(puntoX, puntoY);// para compararlo con otro objeto
        System.out.println(buscar.allCoordenates());
        boolean existe = lista_coordenadas_arrayList.remove(buscar);
        
        
        if (existe) {
            System.out.println("He borrado el objeto " + buscar.allCoordenates());
        }else{
            System.out.println("Este punto No existe en la lista");
        }
        
    }
}
