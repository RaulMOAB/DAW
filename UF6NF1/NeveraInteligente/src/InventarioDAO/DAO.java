/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InventarioDAO;

import DBConnection.DbConnect;
import Object.Food;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul
 */
public class DAO {

    private Connection conn;
    private Statement stmt;

    public DAO() throws SQLException {
        conn = DbConnect.getConnection();
        stmt = conn.createStatement();
    }
/**
 * Method to add a new food
 * @param add new object to add
 * @return the num of rows affected, 0 means the new food has the same PK from other food,
 * greater than zero, food added correctly, -1 base date connection failed
 */
    public int addFood(Food add) {
        int itemAdded = 0;
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "INSERT INTO fridge_items VALUES"
                        + "(" + add.getId() + ",'" + add.getName() + "','" + add.getFood_type() + "'," + add.getNum() + ")";
                itemAdded = stmt.executeUpdate(query);
                stmt.close();
                conn.close();
                return itemAdded;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            return -1;
        }
    }
/**
 * Method to delete a food from table
 * @param del object with the name to delete
 * @return the num of rows affected, 0 means the food does not exist,
 * greater than zero, food deleted correctly, -1 base date connection failed
 */
    public int deleteFood(Food del) {
        int itemDeleted = 0;
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "DELETE FROM fridge_items WHERE name='" + del.getName() + "'";
                itemDeleted = stmt.executeUpdate(query);
                stmt.close();
                conn.close();
                return itemDeleted;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            return -1;
        }
    }
/**
 * Method to get an ArrayList of all items in the table
 * @return ArrayList of foods
 */
    public ArrayList<Food> getFood() {
        ArrayList<Food> all = new ArrayList<>();
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "SELECT * FROM fridge_items";
                ResultSet res = stmt.executeQuery(query);
                while (res.next()) {
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String food_type = res.getString("item_type");
                    int num = res.getInt("quantity");
                    Food items = new Food(id, name, food_type, num);
                    all.add(items);                
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
             return null;
        }
        return all;
    }
/**
 * Method to get the number of items in the table 
 * @return number of items, 0 measn there are no food
 * -1 means connection to base data failed
 */
    public int getItems() {
        int count = 0;
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "SELECT COUNT(*) FROM fridge_items";
                ResultSet res = stmt.executeQuery(query);
                if (res.next()) {
                    count = res.getInt(1);
                }
            }
                stmt.close();
                conn.close();

        } catch (SQLException ex) {
            return -1;
        }

        return count;
    }
/**
 * Method to simulate a list to buy food, a list with equals or less than 2 foods are added to an ArrayList
 * @return the list to buy.
 */
    public ArrayList<Food> findFood() {
        ArrayList<Food> low_quantity = new ArrayList<>();
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "SELECT * FROM fridge_items "+
                        "WHERE quantity <= 2";
                ResultSet res = stmt.executeQuery(query);
                while(res.next()){
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String food_type = res.getString("item_type");
                    int num = res.getInt("quantity");
                    Food aux = new Food(id, name, food_type, num);
                    low_quantity.add(aux);
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            return null;
        }
        return low_quantity;
    }
/**
 * Method to update the number of items
 * @param upd Name of the item to update
 * @param new_num new amount of food that is going to be update
 * @return number of items updated
 */
    public int updateNum(Food upd, int new_num) {
        int updItems = 0;
        try {
            conn = DbConnect.getConnection();
            stmt = conn.createStatement();
            String query = "UPDATE fridge_items SET quantity =" + new_num + " WHERE name ='"+ upd.getName() + "'";
            updItems = stmt.executeUpdate(query);
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
           return -1;
        }
        return updItems;
    }

}
