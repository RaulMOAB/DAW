/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblearray;

/**
 *
 * @author alumne
 */
public class BubbleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]values = {34,56,23,78,23,90,120,5,35};
        
        System.out.println("Desordenado");
        displayArray(values);
        sortArray(values);
        System.out.println("Ordenado");
        displayArray(values);
    }

    private static void displayArray(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println("");
    }

    private static void sortArray(int[] values) {
        int aux;
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                if (values[j] > values[j + 1]) {
                    aux = values[j];
                    values[j] = values[j + 1];
                    values[j +1] = aux;
                    
                }
            }
        } 
    }
    
}
