/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundogui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author ramo4853
 */
public class HolaMundoGUI extends JFrame{

    public HolaMundoGUI() {
        //componenete JLabel es una etiqueta
        JLabel message = new JLabel("Hola Mundo");
        //configuro algunos parametros de la ventana JFrame
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.getContentPane().add(message,"Center");
        //damos tamaño a la ventana
        this.setSize(200, 100);
        this.setVisible(true);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new HolaMundoGUI();
        
    }
    
}
