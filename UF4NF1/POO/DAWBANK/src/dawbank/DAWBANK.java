/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dawbank;

import Objects.BankAccount;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class DAWBANK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money;
        BankAccount cuentaB;
        cuentaB = askDates();
        int option = menu();
        switch(option){
            case 1:
                cuentaB.printAccount();
                break;
            case 2:
                System.out.println("IBAN:" + cuentaB.getIBAN());
                break;
            case 3:
                System.out.println("Titular:" + cuentaB.getTitular());
                break;
            case 4:
                System.out.println("Saldo:" + cuentaB.getSaldo());
                break;
            case 5:
                System.out.println("Introduce la cantidad a ingresar");
                money = sc.nextInt();
                cuentaB.ingress(money);
                break;
            case 6:
                System.out.println("Introduce la cantidad a retirar");
                money = sc.nextInt();
                cuentaB.retirada(money);
                break;
            case 7:
                cuentaB.displayMovements();
                break;
            case 8:
                System.out.println("Que tengas un buen dia");
                break;
            default:
                System.out.println("Opción desconocida");
                break;
        }
    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Datos de la cuenta. Mostrará el IBAN, el titular y el saldo.\n"
                + "2. IBAN. Mostrará el IBAN.\n"
                + "3. Titular.\n"
                + "4. Saldo.\n"
                + "5. Ingreso.\n"
                + "6. Retirada.\n"
                + "7. Movimientos.\n"
                + "8. Salir.");
        System.out.println("Elige la opción que desea realizar");
        option = sc.nextInt();
        } while (option < 1 || option > 8);
        
        return option;
        
    }

    private static BankAccount askDates() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del titular de la cuenta");
        String name = sc.nextLine();
        System.out.println("Introduce el IBAN");
        String IBAN = sc.nextLine();
        BankAccount aux = new BankAccount(IBAN, name);
        return aux;
    }

}
