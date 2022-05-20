/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DbConnection.DbConnect;
import Objects.Location;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramo4853
 */
public class DAO {
    private String ip;
    private Connection conn;
    private Statement stmt;

    public DAO() throws SQLException {
        conn = DbConnect.getConnection(ip);
        stmt = conn.createStatement();
    }

    public DAO(String ip) throws SQLException {
        this.ip = ip;
        conn = DbConnect.getConnection(this.ip);
        stmt = conn.createStatement();
    }

    public int add(Location new_loc) {
        int rowsAdded = 0;
        try {
            conn = DbConnect.getConnection(ip);
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "INSERT INTO LOCATIONS VALUES (" + new_loc.getLocation_id() + ",'"
                        + new_loc.getAddress() + "','" + new_loc.getPostal_code() + "','" + new_loc.getCity() + "','"
                        + new_loc.getProvince() + "'," + new_loc.getCountry_id() + ")";
                rowsAdded = stmt.executeUpdate(query);
                stmt.close();
                conn.close();
                return rowsAdded;
            } else {
                return 0;
            }
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 1) {
                return -2;
            } else {
                //System.out.println(ex.getErrorCode() + ex.getMessage());//1//2291
                return ex.getErrorCode();
            }

        }
    }

    public int deleteLocation(Location del) {
        int locationDeleted = 0;
        try {
            conn = DbConnect.getConnection(ip);
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "DELETE FROM LOCATIONS WHERE LOCATION_ID=" + del.getLocation_id();
                locationDeleted = stmt.executeUpdate(query);
                stmt.close();
                conn.close();
                return locationDeleted;
            } else {
                return 0;
            }
        } catch (SQLException ex) {            
            return -1;
        }
    }

    public ArrayList<Location> getLocation() {
        ArrayList<Location> all = new ArrayList<>();
        try {
            conn = DbConnect.getConnection(ip);
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "SELECT * FROM LOCATIONS";
                ResultSet res = stmt.executeQuery(query);
                while (res.next()) {
                    int location_id = res.getInt("LOCATION_ID");//poner nombre de columa
                    String address = res.getString("STREET_ADDRESS");
                    String postal_code = res.getString("POSTAL_CODE");
                    String city = res.getString("CITY");
                    String province = res.getString("STATE_PROVINCE");
                    int country_id = res.getInt("COUNTRY_ID");
                    Location loc = new Location(location_id, address, postal_code, city, province, country_id);
                    all.add(loc);
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

    public int getRows() {
        int count = 0;
        try {
            conn = DbConnect.getConnection(ip);
            if (conn != null) {
                stmt = conn.createStatement();
                String query = "SELECT COUNT(*) FROM LOCATIONS";
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

}
