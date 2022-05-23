/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Raul
 */
public class Panel extends JFrame {

    public Panel(String string) {
        super(string);
        setparams();
        initPanel();

    }

    private void setparams() {
        //title
        setTitle("Calcula tu puntuación");
        //set panel size
        setSize(500, 250);
        //close window
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void initPanel() {
        JPanel pointLabel = new JPanel();
        pointLabel.setBackground(Color.orange);
        pointLabel.setLayout(new FlowLayout());

        JLabel points = new JLabel("Puntuación: ");
        points.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField usr_points = new JTextField(5);
        JButton btn = new JButton("Calcular");
        JLabel exp = new JLabel("<html>"
                + "<p style =\\\"width:100px\\\">Sistema de puntos</p></br>"
                + "<p>-------------------------------------</p>"
                + "<p style =\\\"width:100px\\\">Puntos menores a 1000 multiplicador x2</p></br>"
                + "<p style =\\\"width:100px\\\">Puntos entre 1.000  y 10.000 multiplicador x6</p></br>"
                + "<p style =\\\"width:100px\\\">El resto no tiene multiplicador</p>"
                + "</html>");
        exp.setHorizontalAlignment(JLabel.CENTER);
        // add components to Panel
        pointLabel.add(points);
        pointLabel.add(usr_points);
        pointLabel.add(btn);
        pointLabel.add(exp);

        JPanel resPanel = new JPanel();
        resPanel.setLayout(new FlowLayout());
        JLabel res = new JLabel("El resultado es: ");
        res.setFont(new Font("Arial", Font.BOLD, 18));
        JTextField res_calculated = new JTextField(5);
        //add components to second Panel
        resPanel.add(res);
        resPanel.add(res_calculated);
        resPanel.add(pointLabel);

        Container cp = getContentPane();
        cp.add(pointLabel, BorderLayout.CENTER);
        cp.add(resPanel, BorderLayout.SOUTH);
        //add button to Listener        
        ActionListener calcPoints = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int points, calculate;
                String points_text = usr_points.getText();
                try {
                    points = Integer.parseInt(points_text);
                    if (points < 1000) {
                        calculate = points * 2;

                    } else if (points >= 1000 && points < 10000) {
                        calculate = points * 6;
                    } else {
                        calculate = points;
                    }
                    res_calculated.setText(Integer.toString(calculate));
                } catch (NumberFormatException ex) {
                    System.out.println("No es posible la conversión");
                }

            }
        };
        btn.addActionListener(calcPoints);

    }

}
