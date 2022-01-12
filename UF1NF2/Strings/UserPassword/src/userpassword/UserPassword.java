/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package userpassword;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class UserPassword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user, password;
        boolean userCheck, passCheck;

        do {
            System.out.println("Introduce un nombre de uusario (correo electrónico)");
            user = sc.nextLine();
            userCheck = userValidation(user);
        } while (!userCheck);

        System.out.println("Introduce una contraseña (mínimo 8 caractéres)");
        password = sc.nextLine();
        passCheck = passValidation(password);
        if (passCheck) {
            System.out.println("Password incorrecto, debe ser de almenos 8 caractéres");
        } else {
            System.out.println("Usuario y password correcto");
        }

    }

    public static boolean userValidation(String user) {
        if (hasSpaceOrNot(user)) {
            System.out.println("Formato incorrecto no debe contener espacios");
            return false;
        } else {
            if (!user.contains("@proven.cat")) {
                System.out.println("Usuario incorrecto");
                System.out.println("Dominio mail incorrecto");
            } else {
                return user.contains("@proven.cat");
            }
        }
        return false;
    }

    public static boolean hasSpaceOrNot(String user) {
        return user.contains(" ");
    }

    public static boolean passValidation(String password) {
        int pass = password.length();
        return pass < 8;
    }

}
