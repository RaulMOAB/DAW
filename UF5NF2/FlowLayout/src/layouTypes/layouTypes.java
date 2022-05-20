/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layouTypes;

import Windows.DataWindow;
import Windows.flowLayout;
import Windows.gridLayout;

/**
 *
 * @author ramo4853
 */
public class layouTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        flowLayout window = new flowLayout("Pruebas");
        //gridLayout window = new gridLayout("Pruebas grid");
        //DataWindow window = new DataWindow("Datos");
        window.setVisible(true);
    }
    
}
