/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionvideojuegos;
import Controller.MyController;
import Model.DAO;
import View.Panel;

/**
 *
 * @author Raul
 */
public class GestionVideojuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyController controller = new MyController(new Panel(),new DAO());
    }
    
}
