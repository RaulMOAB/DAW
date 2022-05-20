/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Objects;

/**
 *
 * @author ramo4853
 */
public class Student {
    private String name;
    private String last_name;
    private int age;
    private String cicle;

    public Student(String name, String last_name, int age, String cicle) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.cicle = cicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!(this.age > 0 && age > 0)) {
            this.age = 0;
        }else{
            this.age = age;
        }
        
    }

    public String getCicle() {
        return cicle;
    }

    public void setCicle(String cicle) {
        if (cicle.equalsIgnoreCase("DAW") || cicle.equalsIgnoreCase("DAM") || cicle.equalsIgnoreCase("ASIX")) {
             this.cicle = cicle;
        }else{
            this.cicle = "DAW";
        }
       
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.last_name, other.last_name)) {
            return false;
        }
        return true;
    }
    
}
