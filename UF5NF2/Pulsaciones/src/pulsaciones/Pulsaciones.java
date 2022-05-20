/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pulsaciones;

import Controler.MyControler;
import Model.IntegerDAO;
import View.WindowPulse;

/**
 *
 * @author ramo4853
 */
public class Pulsaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyControler controller = new MyControler(new WindowPulse(), new IntegerDAO(0));
    }
    
}
