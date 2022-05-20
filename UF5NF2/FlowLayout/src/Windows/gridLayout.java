/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ramo4853
 */
public class gridLayout extends JFrame{

    public gridLayout(String title)  {
        super(title);
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container cp = getContentPane();
        GridLayout gr = new GridLayout(4, 3);
        gr.setHgap(5);// distance of px between horizontal components
        gr.setVgap(5);//distance of px between vertical components
        cp.setLayout(gr);
        for (int i = 0; i < 10; i++) {
            cp.add(new JButton(String.valueOf(i)));
        }
        cp.add(new JButton("*"));
        cp.add(new JButton("+"));
        cp.add(new JButton("="));
    }
    
}
