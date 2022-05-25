/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Raul
 */
public class Table extends JFrame{
    private JPanel table_panel;
    public Table()  {
        super("Registros base de datos");
        this.setSize(600, 350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initElements();
        this.setVisible(true);
    }

    private void initElements() {
       Container ct = getContentPane();
       
       table_panel = new JPanel(new GridLayout());
    }
    
}
