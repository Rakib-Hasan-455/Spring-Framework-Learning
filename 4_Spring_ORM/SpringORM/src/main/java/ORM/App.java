package ORM;

import ORM.DAO.StudentDAO;
import ORM.Entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringORMConfig1.xml");


        StudentDAO studentDAO = applicationContext.getBean("studentDAO", StudentDAO.class);

        // Create/Insert
        Student student = new Student(1, "RT", "Dhaka");
        Student student2 = new Student(2, "RT", "Dhaka");
        System.out.println(studentDAO.insert(student) + " inserted table rows");
        System.out.println(studentDAO.insert(student2) + " inserted table rows");

        // Retrieve
        System.out.println(studentDAO.getOneStudent(1));
        System.out.println();
        System.out.println(studentDAO.getManyStudent());

        // Update
        Student student3 = new Student(1, "RTA", "DhakAa");
        studentDAO.updateStudent(student3);


        // Delete
        studentDAO.deleteStudent(2);


        // Retrieve Final
        System.out.println(studentDAO.getManyStudent());

    }
}
