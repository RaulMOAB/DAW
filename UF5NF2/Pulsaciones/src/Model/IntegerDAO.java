/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ramo4853
 */
public class IntegerDAO {
    private int num_pulse;

    public IntegerDAO(int num_pulse) {
        this.num_pulse = num_pulse;
    }

    public int getNum_pulse() {
        return num_pulse;
    }

    public void setNum_pulse(int num_pulse) {
        this.num_pulse = num_pulse;
    }
    
    public void sumByOne(){
        num_pulse++;
    }
    public void restByOne(){
        if (num_pulse > 0) {
            num_pulse--;
        }else{
            num_pulse = 0;
        }
        
    }
}
