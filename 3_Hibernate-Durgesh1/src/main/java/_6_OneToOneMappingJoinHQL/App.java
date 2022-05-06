package _6_OneToOneMappingJoinHQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started!");
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate6.cfg.xml").buildSessionFactory();

        insertStudentCertiData("Rakib", "Dhaka", "Java", "3 month", sessionFactory);
        insertStudentCertiData("Rakib2", "Dhaka2", "Spring", "6 month", sessionFactory);


//      sessionFactory.close();
    }


    public static void insertStudentCertiData(String name, String address, String course, String duration, SessionFactory sessionFactory) {
        Student student = new Student();
        student.setStudentName(name);
        student.setStudentAddress(address);

        Certificatee certificatee = new Certificatee();
        certificatee.setCourse(course);
        certificatee.setDuration(duration);
        certificatee.setStudent(student);

        student.setCertificate(certificatee);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(certificatee);
        transaction.commit();
        session.close();
    }
}
