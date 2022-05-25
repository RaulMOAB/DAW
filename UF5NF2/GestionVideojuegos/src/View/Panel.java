/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Raul
 */
public class Panel extends JFrame {

    private JPanel data_panel, btn_panel;
    private JLabel name_lbl, platform_lbl, qty_label,jbtn_yes, jbtn_no,online_lbl;
    private JTextField name_txt, platform_txt, qty_txt;
    private JButton add_btn, del_btn, find_btn, list_btn;
    private JRadioButton jbtn_1, jbtn_2;
    private ButtonGroup btn_group;
    //Menu
    private JMenu menu;
    private JMenuBar menuBar;
    private JMenuItem add_it, del_it, find_it, list_it;

    public Panel() {
        super("Gestión videojuegos");
        this.setSize(600, 350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setElements();
        this.setVisible(true);
    }

    public JPanel getData_panel() {
        return data_panel;
    }



    public JLabel getName_lbl() {
        return name_lbl;
    }

    public void setName_lbl(JLabel name_lbl) {
        this.name_lbl = name_lbl;
    }

    public JLabel getPlatform_lbl() {
        return platform_lbl;
    }

    public void setPlatform_lbl(JLabel platform_lbl) {
        this.platform_lbl = platform_lbl;
    }

    public JLabel getQty_label() {
        return qty_label;
    }

    public void setQty_label(JLabel qty_label) {
        this.qty_label = qty_label;
    }

    public JTextField getName_txt() {
        return name_txt;
    }

    public void setName_txt(JTextField name_txt) {
        this.name_txt = name_txt;
    }

    public JTextField getPlatform_txt() {
        return platform_txt;
    }

    public void setPlatform_txt(JTextField platform_txt) {
        this.platform_txt = platform_txt;
    }

    public JTextField getQty_txt() {
        return qty_txt;
    }

    public void setQty_txt(JTextField qty_txt) {
        this.qty_txt = qty_txt;
    }

    public JButton getAdd_btn() {
        return add_btn;
    }


    public JButton getDel_btn() {
        return del_btn;
    }


    public JButton getFind_btn() {
        return find_btn;
    }


    public JButton getList_btn() {
        return list_btn;
    }


    public JRadioButton getJbtn_1() {
        return jbtn_1;
    }


    public JRadioButton getJbtn_2() {
        return jbtn_2;
    }


    public JPanel getBtn_panel() {
        return btn_panel;
    }

    public ButtonGroup getBtn_group() {
        return btn_group;
    }

    public JMenuItem getAdd_it() {
        return add_it;
    }

    public JMenuItem getDel_it() {
        return del_it;
    }

    public JMenuItem getFind_it() {
        return find_it;
    }

    public JMenuItem getList_it() {
        return list_it;
    }

    

    private void setElements() {
        Container cp = getContentPane();
        Container bt = getContentPane();
        data_panel = new JPanel();
        btn_panel = new JPanel(new FlowLayout());
        data_panel.setLayout(null);
        
        //Labels      
        name_lbl = new JLabel("Nombre: ");
        name_lbl.setBounds(100, 50, 120, 30);
        platform_lbl = new JLabel("Plataforma: ");
        platform_lbl.setBounds(100, 100, 120, 30);
        qty_label = new JLabel("Cantidad: ");
        qty_label.setBounds(100, 150, 120, 30);
        jbtn_yes = new JLabel("Sí");
        jbtn_yes.setBounds(220, 220, 20, 20);
        jbtn_no = new JLabel("No");
        jbtn_no.setBounds(420, 220, 20, 20);
        online_lbl = new JLabel("Online: ");
        online_lbl.setBounds(100, 220, 50, 20);
        

        //Textfield
        name_txt = new JTextField(20);
        name_txt.setBounds(220, 50, 200, 30);
        platform_txt = new JTextField(20);
        platform_txt.setBounds(220, 100, 200, 30);
        qty_txt = new JTextField(15);
        qty_txt.setBounds(220, 150, 200, 30);

        //jradioButtons
        jbtn_1 = new JRadioButton();//hay que añadir jtextfield
        jbtn_1.setBounds(200, 220, 20, 20);
        jbtn_2 = new JRadioButton();
        jbtn_2.setBounds(400, 220, 20, 20);
        
        //Buttons
        add_btn = new JButton("Añadir");       
        del_btn = new JButton("Eliminar");
        find_btn = new JButton("Encontrar");
        list_btn = new JButton("Listar");
        
        //ButtonGroup
        btn_group = new ButtonGroup();
        btn_group.add(jbtn_1);
        btn_group.add(jbtn_2);
        
        //Menu
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        menu = new JMenu("Opciones");
        menuBar.add(menu);
        
        //MenuItems
        add_it = new JMenuItem("Añadir");
        del_it = new JMenuItem("Eliminar");
        find_it = new JMenuItem("Encontrar");
        list_it = new JMenuItem("Listar");
        
        menu.add(add_it);
        menu.add(del_it);
        menu.add(find_it);
        menu.add(list_it);
        
        // add to panel
        data_panel.add(name_lbl);
        data_panel.add(name_txt);
        data_panel.add(platform_lbl);
        data_panel.add(platform_txt);
        data_panel.add(qty_label);
        data_panel.add(qty_txt);
        
        data_panel.add(online_lbl);
        data_panel.add(jbtn_1, BorderLayout.WEST);
        data_panel.add(jbtn_yes, BorderLayout.WEST);
        data_panel.add(jbtn_2, BorderLayout.EAST);
        data_panel.add(jbtn_no ,BorderLayout.EAST);
        
        btn_panel.add(add_btn);
        btn_panel.add(del_btn);
        btn_panel.add(find_btn);
        btn_panel.add(list_btn);

        //add to container
        cp.add(data_panel);
        bt.add(btn_panel, BorderLayout.SOUTH);
        
    }
    
    public static void displayMessage(String msg){
         JOptionPane.showMessageDialog(null, msg);
    }
}
