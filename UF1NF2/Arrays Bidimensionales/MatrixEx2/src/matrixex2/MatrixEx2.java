/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixex2;

/**
 *
 * @author alumne
 */
public class MatrixEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][] matrix = new int[10][10];
        fillArray(matrix);
        displayArray(matrix);
    }

    private static void fillArray(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (i + 1) * (j + 1);
                
                
            }
        }
    }
    
     private static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
}
