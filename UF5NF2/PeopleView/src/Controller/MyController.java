/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.StudentDAO;
import View.Window;

/**
 *
 * @author ramo4853
 */
public class MyController {
    private Window view;
    private StudentDAO model;

    public MyController(Window view, StudentDAO model) {
        this.view = view;
        this.model = model;
        //initListener
    }
    
}
