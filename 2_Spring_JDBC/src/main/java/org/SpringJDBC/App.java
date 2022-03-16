package org.SpringJDBC;

import org.SpringJDBC.DAO.StudentDAO;
import org.SpringJDBC.DAO.StudentDAOImplement;
import org.SpringJDBC.Java_JDBC_Config.JavaJDBC_Config;
import org.SpringJDBC.MODEL.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("XML_JDBC_Config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaJDBC_Config.class);

        StudentDAO studentDAO = context.getBean("studentDAO", StudentDAO.class);

        Student student = new Student(2, "Rakib uPDATED 1", "Pangsha Updated");
//        studentDAO.insert(student);
        studentDAO.update(student);
//        studentDAO.delete(1);

      // Single Row Retrive
        Student student1Retrived = studentDAO.retriveSingleStudent(2);
        System.out.println("Single Row Retrived:");
        System.out.println(student1Retrived);

    /*    // Multiple Row Retrive
        List<Student> students = studentDAO.retriveAllStudent();
        for (Student s: students) {
            System.out.println(s);
        }
    */
    }
}
