/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package neverainteligente;

import DBConnection.DbConnect;
import InventarioDAO.DAO;
import Object.Food;
import Utilities.Menu;
import Utilities.Option;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul
 */
public class NeveraInteligente {

    private DAO inventario;
    private Menu main_menu;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NeveraInteligente app = new NeveraInteligente();
        app.runApp();
    }

    private void runApp() {

        try {
            DbConnect.loadDriver();
            inventario = new DAO();
            main_menu = new Menu("----- Nevera Inteligente ----");
            addOptions(main_menu);
            int option;
            System.out.println("======PANEL DE CONTROL=======");
            do {
                main_menu.showMenu();
                option = main_menu.choose("Selecciona una opción: ");
                switch (option) {
                    case 0:
                        System.out.println("Cerrando App");
                        break;
                    case 1:
                        addFood();
                        break;
                    case 2:
                        deleteFood();
                        break;
                    case 3:
                        displayFood();
                        break;
                    case 4:
                        findFoodQuantity();
                        break;
                    case 5:
                        updateFood();
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                        break;
                }
            } while (option != 0);
        } catch (ClassNotFoundException ex) {
            System.err.println("Conexión con la base de datos fallida " + ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(NeveraInteligente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addOptions(Menu main_menu) {
        main_menu.add(new Option("Salir "));
        main_menu.add(new Option("Añadir alimento "));
        main_menu.add(new Option("Dar de baja alimento "));
        main_menu.add(new Option("Mostrar alimentos de la nevera"));
        main_menu.add(new Option("Lista de la compra "));
        main_menu.add(new Option("Actualizar cantidad alimento "));

    }

    private void addFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el código del producto");
        int id = sc.nextInt();
        sc.nextLine();// clear buffer
        System.out.println("Nombre del producto");
        String name = sc.nextLine();
        System.out.println("Tipo de alimento");
        String food_type = sc.nextLine();
        System.out.println("Cantidad a añadir");
        int num = sc.nextInt();
        Food addItem = new Food(id, name, food_type, num);
        int added = inventario.addFood(addItem);

        if (added > 0) {
            System.out.println("Alimento " + addItem.getName() +  "  añadido correctamente");
            System.out.println("Número de alimentos añadidos: " + added);
        } else if (added == 0) {
            System.err.println("Conexión nula a la base de datos");
        } else {
            System.out.println("Ya existe un alimento con el mismo código, no se puede añadir");
        }

    }

    private void deleteFood() {
        Scanner sc = new Scanner(System.in);       
        displayFood();
        System.out.println("¿Qué alimento quieres eliminar?");
        String del_name = sc.nextLine();
        Food del = new Food(del_name);
        int delete = inventario.deleteFood(del);
        if (delete > 0) {
            System.out.println("Alimento borrado correctamente");
            System.out.println("Alimentos eliminados: " + delete);
        } else if(delete == 0){
            System.err.println("No existe el alimento introducido");
            
        }else{
            System.err.println("Comnexión a la base de datos nula");
        }
    }

    private void displayFood() {
        ArrayList<Food> all_food = inventario.getFood();
        if (all_food != null) {
            for (int i = 0; i < all_food.size(); i++) {
                System.out.println(all_food.get(i).toString());
            }
        } else {
            System.err.println("No se puede obtener listado");
        }
        System.out.println("Numero de alimentos: " + inventario.getItems());
    }

    private void findFoodQuantity() {
        ArrayList<Food> needToBuy = inventario.findFood();
        if (needToBuy != null) {
            System.out.println("---- Lista de la compra ----");
            if (!needToBuy.isEmpty()) {
                for (int i = 0; i < needToBuy.size(); i++) {
                    System.out.println(needToBuy.get(i).toString());
                }
            }else{
                System.out.println("Lista de la compra vacía");
            }
            
        } else {
            System.out.println("No se puede obtener lista de la compra");
        }

    }

    private void updateFood() {
        Scanner sc = new Scanner(System.in);       
        displayFood();
        System.out.println("Indica el alimento a actualizar");
        String name = sc.nextLine();
        System.out.println("Introduce nueva cantidad");
        int new_num = sc.nextInt();
        Food upd = new Food(name, new_num);
        int item_updated = inventario.updateNum(upd,new_num);
        if (item_updated > 0) {
            System.out.println("Cantidad actualizada correctamente");
            System.out.println("Nueva cantidad: " + item_updated);
        }else{
            System.err.println("No se ha podido actualizar el valor");
        }
        
    }
}
