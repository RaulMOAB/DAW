/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locationsconnection;

import DAO.DAO;
import DbConnection.DbConnect;
import Objects.Location;
import Utilities.Menu;
import Utilities.Option;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramo4853
 */
public class LocationsConnection {

    private DAO locations;
    private Menu main_menu;

    public static void main(String[] args) {
        LocationsConnection app = new LocationsConnection();
        app.runApp();

    }

    private void runApp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la IP de la máquina");
        String IP = sc.nextLine(); 
        if (IP.isEmpty()) {
            IP = "192.168.143.195";
            System.out.println("Se añade IP por defecto: 192.168.143.195");
        }else{
            IP = sc.nextLine();   
        }
        try {
            DbConnect.loadDriver();
            locations = new DAO(IP);
            main_menu = new Menu("DB Locations");
            addOptions(main_menu);
            int option;
            do {
                main_menu.showMenu();
                option = main_menu.choose("Selecciona una opción: ");
                switch (option) {
                    case 0:
                        System.out.println("Cerrando aplicación");
                        break;
                    case 1:
                        addLocation();
                        break;
                    case 2:
                        deleteLocation();
                        break;
                    case 3:
                        displayLocationsTable();
                        break;
                    default:
                        System.out.println("Opción incorrecta");
                }
            } while (option != 0);

        } catch (ClassNotFoundException ex) {
            System.out.println("Error en la conexión de la base de datos");
        } catch (SQLException ex) {
            Logger.getLogger(LocationsConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void addOptions(Menu main_menu) {
        main_menu.add(new Option("Salir "));
        main_menu.add(new Option("Insertar nuevo registro"));
        main_menu.add(new Option("Borrar registro "));
        main_menu.add(new Option("Listar tabla Locations "));
    }

    private void addLocation() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Introduce la id de la localización");
            int id = sc.nextInt();
            sc.nextLine();// clear buffer
            System.out.println("Introduce la dirección (calle)");
            String address = sc.nextLine();
            System.out.println("Introduce el código postal");
            String postal_code = sc.nextLine();
            System.out.println("¿En qué ciudad está?");
            String city = sc.nextLine();
            System.out.println("Introduce la provincia");
            String province = sc.nextLine();
            System.out.println("introduce la id del país");
            int country_id = sc.nextInt();
            Location new_loc = new Location(id, address, postal_code, city, province, country_id);
            int location_added = locations.add(new_loc);
            if (location_added == 1) {
                System.out.println("Nueva localización " + new_loc.getAddress() + " añadida");  
            } else if (location_added == -2) {
                System.err.println("Error: ya existe una localización con el mismo código PK ");
            } else if (location_added == 2291) {
                 System.err.println("Error: restriccion de FK violada");  
            } else {
                 System.err.println("Conexión nula a la base de datos");
                 System.out.println("Localizaciones añadidas: " + location_added);
            }
        } catch (InputMismatchException ex) {
            System.err.println("Se ha introducido un tipo de dato erroneo");
        }

    }

    private void deleteLocation() {
        Scanner sc = new Scanner(System.in);
        displayLocationsTable();
        try{
            System.out.println("¿Qué ID de localización deseas eliminar?");
            int id_location = sc.nextInt();
            Location del = new Location(id_location);
            int delete = locations.deleteLocation(del);
            if (delete > 0) {
                System.out.println("Localizacion " + del.getLocation_id() + " eliminada con éxito");
                System.out.println("Localizaciones eliminadas " + delete);
            } else if (delete == 0) {
                System.err.println("No existe la ID introducida, no se elimina ninguna localización");
            } else {
                System.err.println("Connexión con la base de datos nula");
            }
        }catch(InputMismatchException ex){
            System.err.println("Se ha introducido un tipo de dato erroneo");
        }
       

    }

    private void displayLocationsTable() {
        ArrayList<Location> allLocations = locations.getLocation();
        if (allLocations != null) {
            for (int i = 0; i < allLocations.size(); i++) {
                System.out.println(allLocations.get(i).toString());
            }
        } else {
            System.out.println("No se ha podido obtener la tabla");
        }
        System.out.println("Numero de registros: " + locations.getRows());
    }

}
