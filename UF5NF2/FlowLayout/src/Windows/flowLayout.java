/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ramo4853
 */
public class flowLayout extends JFrame{

    public flowLayout(String title) {
        super(title);
        setParam();
    }

    private void setParam() {
        //windows size
        setSize(500, 400);
        //close windows
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // JFrame container(it's a panel)
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta_name = new JLabel("Nombre: ");
        JTextField cuadro_nombre = new JTextField(20);//20 it's the max num of characters
        JButton btn = new JButton("Enviar");
        cp.add(etiqueta_name);
        cp.add(cuadro_nombre);
        cp.add(btn);
        
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = cuadro_nombre.getText();//recupera el texto del cuadro de texto
                String hello = "Hola " + name;
                cuadro_nombre.setText(hello);
            }
        };
        btn.addActionListener(al);
        
    }
    
}
