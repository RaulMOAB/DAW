/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionvideojuegos;
import Controller.MyController;
import Model.DAO;
import View.Panel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class GestionVideojuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MyController controller = new MyController(new Panel(),new DAO());
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error en la conexión con la base de Datos ");

        }
    }
    
}
