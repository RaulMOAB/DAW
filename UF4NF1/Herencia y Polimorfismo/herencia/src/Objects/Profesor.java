/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objects;

/**
 *
 * @author alumne
 */
public class Profesor extends Persona{
    private int cod_teacher;
    private String department;
    private String modules;

    public Profesor(int cod_teacher, String department, String name, String DNI, String adress, String phone_num) {
        super(name, DNI, adress, phone_num);//constructor de la clase padre(Persona)
        this.cod_teacher = cod_teacher;
        this.department = department;
    }

   
    
    

    public int getCod_teacher() {
        return cod_teacher;
    }

    public void setCod_teacher(int cod_teacher) {
        this.cod_teacher = cod_teacher;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getModules() {
        return modules;
    }

    public void setModules(String modules) {
        this.modules = modules;
    }
    
    @Override
    public void saludarPorManyana() {
        System.out.println("Soy profesor, hola y adiós");
    }

    @Override
    public String toString() {
        String atr_persona = super.toString();
        return "Profesor{" + "cod_teacher=" + cod_teacher + ", department=" + department + ", modules=" + modules + " - " + atr_persona;
    }
    
    
    
}
