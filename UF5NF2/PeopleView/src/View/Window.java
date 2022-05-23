/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ramo4853
 */
public class Window extends JFrame {

    private JPanel student_panel, buttons_panel;
    private JButton btn_list, btn_save, btn_reset, btn_delete;
    private JLabel lbl_name, lbl_last_name, lbl_age, lbl_cicle, lbl_list;
    private JTextField txt_name, txt_last_name, txt_age, txt_cicle;

    public Window() {
        super("Gestor de estudiantes");
        this.setSize(1000, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setElementsparam();
        this.setVisible(true);
    }

    public JButton getBtn_list() {
        return btn_list;
    }

    public void setBtn_list(JButton btn_list) {
        this.btn_list = btn_list;
    }

    public JButton getBtn_save() {
        return btn_save;
    }

    public void setBtn_save(JButton btn_save) {
        this.btn_save = btn_save;
    }

    public JButton getBtn_reset() {
        return btn_reset;
    }

    public void setBtn_reset(JButton btn_reset) {
        this.btn_reset = btn_reset;
    }

    public JButton getBtn_delete() {
        return btn_delete;
    }

    public void setBtn_delete(JButton btn_delete) {
        this.btn_delete = btn_delete;
    }

    public JLabel getLbl_name() {
        return lbl_name;
    }

    public void setLbl_name(JLabel lbl_name) {
        this.lbl_name = lbl_name;
    }

    public JLabel getLbl_last_name() {
        return lbl_last_name;
    }

    public void setLbl_last_name(JLabel lbl_last_name) {
        this.lbl_last_name = lbl_last_name;
    }

    public JLabel getLbl_age() {
        return lbl_age;
    }

    public void setLbl_age(JLabel lbl_age) {
        this.lbl_age = lbl_age;
    }

    public JLabel getLbl_cicle() {
        return lbl_cicle;
    }

    public void setLbl_cicle(JLabel lbl_cicle) {
        this.lbl_cicle = lbl_cicle;
    }

    public JLabel getLbl_list() {
        return lbl_list;
    }

    public void setLbl_list(JLabel lbl_list) {
        this.lbl_list = lbl_list;
    }

    public JTextField getTxt_name() {
        return txt_name;
    }

    public void setTxt_name(JTextField txt_name) {
        this.txt_name = txt_name;
    }

    public JTextField getTxt_last_name() {
        return txt_last_name;
    }

    public void setTxt_last_name(JTextField txt_last_name) {
        this.txt_last_name = txt_last_name;
    }

    public JTextField getTxt_age() {
        return txt_age;
    }

    public void setTxt_age(JTextField txt_age) {
        this.txt_age = txt_age;
    }

    public JTextField getTxt_cicle() {
        return txt_cicle;
    }

    public void setTxt_cicle(JTextField txt_cicle) {
        this.txt_cicle = txt_cicle;
    }

    public JPanel getStudent_panel() {
        return student_panel;
    }

    public void setStudent_panel(JPanel student_panel) {
        this.student_panel = student_panel;
    }

    public JPanel getButtons_panel() {
        return buttons_panel;
    }

    public void setButtons_panel(JPanel buttons_panel) {
        this.buttons_panel = buttons_panel;
    }

    private void setElementsparam() {
        Container cp = getContentPane();
        Container cr = getContentPane();
        //cp.setLayout(new GridLayout(2, 4));
        student_panel = new JPanel(new GridLayout(0, 4, 15, 15));
        buttons_panel = new JPanel(new FlowLayout());

        
        //Labels
        lbl_age = new JLabel("Edad: ");
        lbl_cicle = new JLabel("Ciclo: ");
        lbl_name = new JLabel("Nombre: ");
        lbl_last_name = new JLabel("Apellidos :");
        lbl_list = new JLabel("Listado");
        
         //Textfield
        txt_age = new JTextField(10);
        txt_name = new JTextField(10);
        txt_last_name = new JTextField(10);
        txt_cicle = new JTextField(4);
        
        student_panel.add(lbl_name);
        student_panel.add(txt_name);
        
        student_panel.add(lbl_last_name);
        student_panel.add(txt_last_name);
        
        student_panel.add(lbl_age);
        student_panel.add(txt_age);
        
        student_panel.add(lbl_cicle);
        student_panel.add(txt_cicle);
        
        student_panel.add(lbl_list, BorderLayout.CENTER);
        
       
        
      
       
       //buttons
        btn_delete = new JButton("Borrar");
        btn_list = new JButton("Listar");
        btn_reset = new JButton("Reset");
        btn_save = new JButton("Guardar");
        
        buttons_panel.add(btn_save);
        buttons_panel.add(btn_delete);
        buttons_panel.add(btn_reset);
        buttons_panel.add(btn_list);
        
        
        cp.add(student_panel);
        cr.add(buttons_panel, BorderLayout.SOUTH);

    }

}
