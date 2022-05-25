/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DAO;
import Object.VideoGame;
import View.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul
 */
public class MyController implements ActionListener {

    private Panel view;
    private DAO model;

    public MyController(Panel view, DAO model) {
        this.view = view;
        this.model = model;
        initListener();
    }

    private void initListener() {
        view.getAdd_btn().addActionListener(this);
        view.getDel_btn().addActionListener(this);
        view.getFind_btn().addActionListener(this);
        view.getList_btn().addActionListener(this);
        view.getAdd_it().addActionListener(this);
        view.getDel_it().addActionListener(this);
        view.getFind_it().addActionListener(this);
        view.getList_it().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.getAdd_btn() || e.getSource() == view.getAdd_it()) {
            addVideoGame();
        } else if (e.getSource() == view.getDel_btn() || e.getSource() == view.getDel_it()) {
            deleteVideoGame();
        } else if (e.getSource() == view.getFind_btn() || e.getSource() == view.getFind_it()) {
            findGameByName();
        }
    }

    private String validateJRadio() {
        String option = "";
        if (view.getJbtn_1().isSelected()) {
            option = "Si";
        }
        if (view.getJbtn_2().isSelected()) {
            option = "No";
        }
        return option;
    }

    private void addVideoGame() {
        String name = view.getName_txt().getText();
        String platform = view.getPlatform_txt().getText();
        int qty = Integer.parseInt(view.getQty_txt().getText());
        String online = validateJRadio();
        VideoGame add = new VideoGame(name, platform, qty, online);

        int add_game = model.addVideogame(add);
        if (add_game == 1) {
            JOptionPane.showMessageDialog(null, "Videojuego añadido correctamente");

        } else if (add_game == 1062){
            JOptionPane.showMessageDialog(null, "Error: PK duplicada" );
        }else{
              JOptionPane.showMessageDialog(null, "Error: "  + add_game);
        }
    }

    private void deleteVideoGame() {
        String name = view.getName_txt().getText();
        VideoGame del = new VideoGame(name);

        int delete_game = model.delete(del);
        switch (delete_game) {
            case 0:// el Joption debe ser clase statica en Panel.java
                JOptionPane.showMessageDialog(null, "El videojuego específicado no existe, no se borra ningún registro");
                break;
            case -1:
                JOptionPane.showMessageDialog(null, "Error de conexión a la base de datos");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Videojuego eliminado correctamente ");

                break;
        }
    }

    private void findGameByName() {
        String name = view.getName_txt().getText();

        VideoGame find = new VideoGame(name);

        VideoGame game_found = model.find(find);
        if (game_found != null) {
            String name_found = game_found.getName();
            String platform_found = game_found.getPlatform();
            int qty_found = game_found.getQty();
            String online_found = game_found.getOnline();

            view.getName_txt().setText(name_found);
            view.getPlatform_txt().setText(platform_found);
            view.getQty_txt().setText(String.valueOf(qty_found));
            if (online_found.equalsIgnoreCase("Si")) {
                view.getJbtn_1().setSelected(true);
            } else {
                view.getJbtn_2().setSelected(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El registro especifícado no existe");
        }
    }

}
