/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dniletter;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DniLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los dígitos de tu DNI");
        final int DNI = sc.nextInt();
        char letter = dniLetter(DNI);
        System.out.println("Tu DNI es " + DNI + "-" + letter);
    }

    private static char dniLetter(int dni) {
        int dniDiv = dni % 23;       
        char letra;
        switch (dniDiv){
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;   
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;  
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;    
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;    
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break; 
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
                    
            default:
                letra= '&';
            break;    
                
        }
        return letra;
    }
    
}
