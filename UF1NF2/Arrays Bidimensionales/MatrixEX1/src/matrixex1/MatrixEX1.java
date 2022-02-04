/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixex1;

/**
 *
 * @author alumne
 */
public class MatrixEX1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int matrix [][] = new int [5][5];
       int matrix2 [][] = new int [5][5];
       fillArray(matrix);
       fillByColumns(matrix2);
       displayArray(matrix);
       displayArray(matrix2);
    }

    private static void fillArray(int[][] matrix) {
        int value = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = value;
                value++;
            }
        }
    }

    private static void displayArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
    }

    private static void fillByColumns(int[][] matrix2) {
        int value = 1;
        for (int i = 0; i < matrix2[0].length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[j][i] = value;
                value++;
            }
        }
    }
    
}
