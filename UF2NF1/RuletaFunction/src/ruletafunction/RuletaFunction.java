/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ruletafunction;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class RuletaFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int money = 50; //dinero principal
        while(keepPlaying(money))
        {
            
        }
        //System.out.println(ballNum());
        System.out.println(checkWin(14, 15));
        
    }
    //int tirar_bola(), int pedir_apuesta(int dinero), boolean comprobar_resultado(int num_aspostado, int_numBola),
    // calcular_premio(int num_apostado, int cantidad ),boolean seguir_jugando(int money), actualizar_money(int money, int dinero_ganado, booleano ganado)
    public static int playerNum(){
        Scanner sc = new Scanner(System.in);
        int num;
        do {
           System.out.println("Introduce un número entre 0 y 36. 38 es apostar a par, 37 es apostar a impares");
           num = sc.nextInt();
             
        } while (num < 0 || num >= 38);

        return num;
    }
    
    public static int askBet(int money){
        Scanner sc = new Scanner(System.in);
        int bet = 0;
        do {
            System.out.println("Introduce tu apuesta");
            bet = sc.nextInt();
        } while (money < 0 || bet > money || bet < 0);
        
        return bet;
    }
    
    public static int ballNum(){
        Random r = new Random();
        int ballNum = r.nextInt(36);
        return ballNum;
    }
    
    public static boolean checkWin(int playerNum, int ballNum){
        boolean win = false;
        if (playerNum == ballNum) {
            win = true;
        }else if(playerNum == 37){
            if(ballNum % 2 != 0){
             win = true;
            }
        }else if(playerNum == 38){
            if (ballNum % 2 == 0) {
                win = true;
            }
        }
        return win;
    }
    
    public static int calcPrize(int playerNum, int bet){
        int prize = 0;
        if (playerNum == 38 || playerNum == 37) {
            prize = bet * 2;
        }else{
            prize = bet * 36;
        }
        return prize;
    }
    
    public static int updateCredit(int money, int prize, boolean win){
        
        if (win) {
            money+= prize;
        }else{
            money -= prize;
        }
        return money;
    }
    
    public static boolean keepPlaying(int money){
        Scanner sc = new Scanner(System.in);
        boolean play = false;
        if (money > 0) {
            char option;
            do {
            System.out.println("Quieres seguir jugando? s/n");
            option = sc.nextLine().charAt(0);
                if (option == 's' || option == 'S') {
                    play = true;
                }
            } while (option != 's' || option != 'S');
            
            System.out.println("Hasta la proxima!");
        }
        return play;
    }
}
