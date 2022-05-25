/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import DBConnection.DbConnect;
import Object.VideoGame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Raul
 */
public class DAO {

    private Connection conn;
    private Statement stmt;
    private ArrayList<VideoGame> games = new ArrayList<>();

    public DAO() throws SQLException {
        conn = DbConnect.getConnection();
        stmt = conn.createStatement();
    }

    public int addVideogame(VideoGame add) {
        int rowsAdded = 0;
        boolean exist = checkIfExist(add);
        if (!exist) {
            String query = "INSERT INTO videogames VALUES ('" + add.getName() + "','"
                    + add.getPlatform() + "'," + add.getQty() + ",'" + add.getOnline() + "')";
     
            
            try {
                conn = DbConnect.getConnection();
                if (conn != null) {
                    stmt = conn.createStatement();
                    rowsAdded = stmt.executeUpdate(query);
                    stmt.close();
                    conn.close();
                    return rowsAdded;
                }
            } catch (SQLException ex) {
                return ex.getErrorCode();
            }
            return 0;
        }else{
            return -2;
        }

    }

    private boolean checkIfExist(VideoGame add) {
        boolean exist = false;
        String query = "SELECT * FROM videogames"
                + "WHERE Nombre = '" + add.getName().toUpperCase();
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                ResultSet res = stmt.executeQuery(query);
                if (res.next()) {
                    exist = true;
                } else {
                    exist = false;
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            //
        }
        return exist;
    }
    
    public int delete(VideoGame del){
        int rowsDeleted = 0;
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "DELETE FROM videogames WHERE UPPER(Nombre)='" + del.getName().toUpperCase() + "'";
                rowsDeleted = stmt.executeUpdate(query);
                stmt.close();
                conn.close();
                return rowsDeleted;
            }else{
                return 0;
            }
        } catch (SQLException ex) {
            return -1;
        }
    }
    /**
     * Encontrar juegos por nombre
     * @param find videojuego pasado por parametro
     * @return conjunto de videojuegos
     */
    public VideoGame find (VideoGame find){
        VideoGame find_game = null;
        try {
            conn = DbConnect.getConnection();
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "SELECT * FROM videogames"
                        + " WHERE UPPER(Nombre) ='" + find.getName().toUpperCase()+ "'";              
                ResultSet res = stmt.executeQuery(query);
                while (res.next()){
                    String name = res.getString("Nombre");
                    String platform = res.getString("Plataforma");
                    int qty = res.getInt("Unidades");
                    String online = res.getString("Online");                   
                    find_game = new VideoGame(name, platform, qty, online);
                    games.add(find_game);
                    return find_game;
                }
                res.close();
                stmt.close();
                conn.close();
            }
        } catch (SQLException ex) {
            return null;
        }
        return find_game;
    }
}
