/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conecta4;

/**
 *
 * @author alumne
 */
public class Conecta4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1, name2;
        int [][] table = new int [6][7];
        
        //name1 = askName("Introduce el nombre del Jugador 1");
        //name2 = askName("Introduce el nombre del Jugador 2");
        
        //int turn = newTurn();
        displayTable(table);
    }

    public static void displayTable(int[][] table) {
        
        for (int i = 0; i < table.length; i++) {
            for (int column = 0; column < table[i].length; column++) {
                char draw_table = displayCasilla(table, i, column);
                System.out.print("|" + draw_table);
            }
            System.out.println("");
        }
    }

    public static char displayCasilla(int[][] table, int i, int column) {
        if (table[i][column] == 0) {
            return '-';
        }else if(table[i][column] == 1){
            return 'X';
        }else{
            return 'O';
        }
    }
    
}
