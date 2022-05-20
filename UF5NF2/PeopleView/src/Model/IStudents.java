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
public interface IStudents {
    public boolean addStudent(Student add);
    public boolean deleteStudent(Student del);
    public ArrayList<Student> displayStudents();
    public String listStudents();
}
