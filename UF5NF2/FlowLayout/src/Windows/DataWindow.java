/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author ramo4853
 */
public class DataWindow extends JFrame {

    public DataWindow(String title) {
        super(title);
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel datePanel = new JPanel();
        datePanel.setLayout(new FlowLayout());
        datePanel.add(new JTextField(2));//num of character (days)
        datePanel.add(new JLabel("/"));
        datePanel.add(new JTextField(2));//month
        datePanel.add(new JLabel("/"));
        datePanel.add(new JTextField(4));//year

        JPanel userData = new JPanel();
        userData.setLayout(new GridLayout(3, 2));//3 rows 2 columns
        userData.add(new JLabel("Nombre: "));
        userData.add(new JTextField(10));
        userData.add(new JLabel("DNI: "));
        userData.add(new JTextField(10));
        userData.add(new JLabel("Fecha: "));
        userData.add(datePanel);
        
        JPanel btns = new JPanel();
        btns.setLayout(new FlowLayout());
        btns.add(new JButton("Aceptar"));
        btns.add(new JButton("Borrar"));
        
        Container cp = getContentPane();
        cp.add(userData,BorderLayout.CENTER);
        cp.add(btns,BorderLayout.SOUTH);
    }

}
