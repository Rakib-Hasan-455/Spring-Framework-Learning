package org.SpringJDBC.DAO;

import org.SpringJDBC.MODEL.Student;

import java.util.List;

public interface StudentDAO {
    public int insert(Student student);
    public int update(Student student);
    public int delete(int studentID);
    public Student retriveSingleStudent(int studentID);
    public List<Student> retriveAllStudent();
}
