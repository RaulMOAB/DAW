/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ramo4853
 */
public class WindowPulse extends JFrame {

    private JButton btn_pulse, btn_reset;
    private JLabel label_message, label_num;
    private JCheckBox ck_box;

    public WindowPulse() {
        super("Contador de pulsaciones");
        this.setSize(175, 115);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        defineElements();
        this.setVisible(true);
    }

    public JButton getBtn_pulse() {
        return btn_pulse;
    }

    public JButton getBtn_reset() {
        return btn_reset;
    }

    public JLabel getLabel_message() {
        return label_message;
    }

    public JLabel getLabel_num() {
        return label_num;
    }

    public void setLabel_num(JLabel label_num) {
        this.label_num = label_num;
    }

    public JCheckBox getCk_box() {
        return ck_box;
    }

    public void setCk_box(JCheckBox ck_box) {
        this.ck_box = ck_box;
    }

    private void defineElements() {
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        btn_pulse = new JButton("Pulsar");
        btn_reset = new JButton("Reset");
        label_message = new JLabel("Pulsaciones: ");
        label_num = new JLabel("0");
        ck_box = new JCheckBox();
        cp.add(label_message);
        cp.add(label_num);
        cp.add(btn_pulse);
        cp.add(btn_reset);
        cp.add(ck_box);
       

    }

}
