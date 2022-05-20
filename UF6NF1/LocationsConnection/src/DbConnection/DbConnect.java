/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ramo4853
 */
public class DbConnect {

    static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String PROTOCOL = "jdbc:oracle:thin:@";
    static String HOST = "192.168.143.195";
    static final String PORT = ":1521";
    static final String SID = ":orcl";
    static final String USER = "HR";
    static final String PASSWORD = "HR";

    //Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.133:1521:orcl", "HR", "HR");
    public static void loadDriver() throws ClassNotFoundException {
        Class.forName(DRIVER);
    }

//    public static Connection getConnection() throws SQLException {
//        final String BD_URL = PROTOCOL + HOST + PORT + SID;
//        Connection conn = null;
//        conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
//        return conn;
//    }

    public static Connection getConnection(String ip) throws SQLException {
        HOST = ip;
        final String BD_URL = PROTOCOL + HOST + PORT + SID;
        Connection conn = null;
        conn = DriverManager.getConnection(BD_URL, USER, PASSWORD);
        return conn;
    }
}
