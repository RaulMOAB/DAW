/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopleview;

import Controller.MyController;
import Model.StudentDAO;
import View.Window;

/**
 *
 * @author ramo4853
 */
public class PeopleView {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyController controller = new MyController(new Window(), new StudentDAO());
    }
    
}
