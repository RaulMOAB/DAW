/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Student;
import Model.StudentDAO;
import View.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ramo4853
 */
public class MyController implements ActionListener{
    private Window view;
    private StudentDAO model;

    public MyController(Window view, StudentDAO model) {
        this.view = view;
        this.model = model;
        initListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (view.getBtn_save() == e.getSource()) {
            String name = String.valueOf(view.getTxt_name());
            String last_name = String.valueOf(view.getTxt_last_name());
           // int age = Integer.parseInt(String.valueOf(view.getTxt_age()));
            String cicle = String.valueOf(view.getTxt_cicle());
            Student addStudent = new Student(name, last_name, cicle);
            model.getClase().add(addStudent);
            model.displayStudents();
        }
    }

    private void initListener() {
        view.getBtn_save().addActionListener(this);
    }
    
}
