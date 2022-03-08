/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class Alumno extends Persona{
    private int num_exp;
    private String cicle;
    private int curse;

    public Alumno(int num_exp, String cicle, int curse, String name, String DNI, String adress, String phone_num) {
        super(name, DNI, adress, phone_num);
        this.num_exp = num_exp;
        this.cicle = cicle;
        this.curse = curse;
    }
    
    

    public int getNum_exp() {
        return num_exp;
    }

    public void setNum_exp(int num_exp) {
        this.num_exp = num_exp;
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public int getCurse() {
        return curse;
    }

    public void setCurse(int curse) {
        this.curse = curse;
    }

    @Override
    public void saludarPorManyana() {
        super.saludarPorManyana(); 
        System.out.println("Heyy, ZZZZZZZZZZZZ");
    }

    @Override
    public String toString() {
        return "Alumno{" + "num_exp=" + num_exp + ", cicle=" + cicle + ", curse=" + curse + this.name;
    }

    
    
    
    
}
