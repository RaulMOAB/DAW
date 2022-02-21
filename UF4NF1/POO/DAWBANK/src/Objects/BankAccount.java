/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class BankAccount {

    private final String IBAN;
    private final String titular;
    private int saldo;
    private int[] movimientos;
    private int numOfMovement;

    public BankAccount(String IBAN, String titular) {
        if (IBAN.length() == 24 && IBAN.startsWith("ES")) {
            this.IBAN = IBAN;
            this.titular = titular;
            this.saldo = 0;
            this.movimientos = new int[100];
            this.numOfMovement = 0;
        } else {
            this.IBAN = " ";
            this.titular = " ";
            System.err.println("IBAN incorrecto");
        }

    }

    public String getIBAN() {
        return IBAN;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void printAccount() {
        System.out.println("IBAN:" + this.IBAN + "\nTitular:" + this.titular + "\nSaldo actual:" + this.saldo);
    }

    public void ingress(int money) {
        if (money > 0) {
            this.saldo += money;
            this.movimientos[numOfMovement] = money;
            numOfMovement++;
        } else {
            System.out.println("La cantidad debe ser mayor a 0");
            if (money >= 3000) {
                System.out.println("AVISO:\n"
                        + "Notificar a hacienda.");
            }
        }

    }
    
    public void retirada(int money){
        if (money > 0) {
            this.saldo -= money;
            this.movimientos[numOfMovement] = (-1) * money;// pasa la cantidad a negativo
            this.numOfMovement++;
        }else{
            System.out.println("La retirada debe ser superior a 0€");
            if (this.saldo < -50) {
                System.out.println("AVISO: Saldo negativo");
            }
        }
    }
    
    public void displayMovements(){
        for (int i = 0; i < this.numOfMovement; i++) {
            if (this.movimientos[i] < 0) {
                System.out.println("Transferencia:" + this.movimientos[i]);
            }else{
                System.out.println("Ingreso:" + this.movimientos[i]);
            }
            
        }
    }
    
    
}
