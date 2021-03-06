/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.DAO;
import Object.VideoGame;
import View.Panel;
import View.Table;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        }else if(e.getSource() == view.getList_btn()){//preguntar
            Table tb = new Table();
            //crear controlador de la otra ventana pasando la vista de la siguiente ventana
            tb.setVisible(true);
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
        if (qty > 0) {
             VideoGame add = new VideoGame(name, platform, qty, online);
             int add_game = model.addVideogame(add);
            if (add_game == 1) {
                Panel.displayMessage("Videojuego a??adido correctamente");
            } else if (add_game == 1062) {
                Panel.displayMessage("Error: PK duplicada");
            } else {
                Panel.displayMessage("Error: " + add_game);
            }
        }else{
            Panel.displayMessage( "Las unidades deben ser positivas");
        }
       

       
    }

    private void deleteVideoGame() {
        String name = view.getName_txt().getText();
        VideoGame del = new VideoGame(name);

        int delete_game = model.delete(del);
        switch (delete_game) {
            case 0:               
                Panel.displayMessage( "El videojuego espec??ficado no existe, no se borra ning??n registro");
                break;
            case -1:               
                Panel.displayMessage( "Error de conexi??n a la base de datos");
                break;
            default:
                Panel.displayMessage("Videojuego eliminado correctamente ");
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
            Panel.displayMessage("El registro especif??cado no existe");
        }
    }

}
