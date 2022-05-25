/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raul
 */
public class Table extends JFrame{

    private JPanel table_panel;
    private JTable table;
    private DefaultTableModel model;
    private int rows;

    public Table(/*int rows*/) {
        super("Registros base de datos");
        this.rows = rows;
        this.setSize(600, 350);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        initElements(/*getRows()*/);
        this.setVisible(true);
    }

    private void initElements(/*int rows*/) {
        Container ct = getContentPane();

        table_panel = new JPanel();
        model = new DefaultTableModel();
        table = new JTable(model);
        //table.addColumn(new TableColumn());
        model.addColumn("Nombre");
        model.addColumn("Plataforma");
        model.addColumn("Unidades");
        model.addColumn("Online");
        
        
       

        //table.setModel(model);
        table_panel.add(table);
        ct.add(table_panel);
    }

    public int getRows() {
        return rows;
    }

}
