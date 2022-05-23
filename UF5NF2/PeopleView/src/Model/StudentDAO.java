/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ramo4853
 */
public class StudentDAO implements IStudents {

    private ArrayList<Student> clase = new ArrayList<>();

    @Override
    public boolean addStudent(Student add) {
        //clase = new ArrayList<>();
        if (!clase.contains(add)) {           
            clase.add(add);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStudent(Student del) {
        return clase.remove(del);
    }

    @Override
    public ArrayList<Student> displayStudents() {
      
        return clase;
    }

    @Override
    public String listStudents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ArrayList<Student> getClase() {
        return clase;
    }
    
}
