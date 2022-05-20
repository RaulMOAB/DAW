/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Model.IntegerDAO;
import View.WindowPulse;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ramo4853
 */
public class MyControler implements ActionListener {

    private WindowPulse view;
    private IntegerDAO model;

    public MyControler(WindowPulse view, IntegerDAO model) {
        this.view = view;
        this.model = model;
        initListener();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (view.getBtn_pulse() == e.getSource()) {
            if (view.getCk_box().getModel().isSelected()) {
                sumByOne();
            } else {
                restByOne();
            }
        } else {//event produced by btn_reset
            reset();
        }

        //update num_pulse on window
        view.getLabel_num().setText(String.valueOf(model.getNum_pulse()));
    }

    private void sumByOne() {
        model.sumByOne();
    }

    private void restByOne() {
        model.restByOne();
    }

    private void reset() {
        model.setNum_pulse(0);
    }

    /**
     * A todos los componenetes de la pantalla se asocian la mismo listener en
     * nuestro caso es la clase MyController
     */
    private void initListener() {
        view.getBtn_pulse().addActionListener(this);
        view.getBtn_reset().addActionListener(this);
    }

}
