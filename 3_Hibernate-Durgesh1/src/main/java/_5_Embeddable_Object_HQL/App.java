package _5_Embeddable_Object_HQL;

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
        SessionFactory sessionFactory = configuration.configure("hibernate5.cfg.xml").buildSessionFactory();

//      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        insertStudentCertiData("Rakib", "Dhaka", "Java", "3 month", sessionFactory);
        insertStudentCertiData("Rakib2", "Dhaka2", "Spring", "6 month", sessionFactory);

        showStudentDataWithGet(sessionFactory);

//        showStudentDataWithLoad(sessionFactory);
    }

    private static void showStudentDataWithLoad(SessionFactory sessionFactory) {
        System.out.println("Load");
        Session session = sessionFactory.openSession();
        Student student = (Student) session.load(Student.class, 1);
        Student student1 = (Student) session.load(Student.class, 2);
        Student student2 = (Student) session.load(Student.class, 3);

        System.out.println(student);
        System.out.println(student1);
//        System.out.println(student2);
        session.close();
    }

    private static void showStudentDataWithGet(SessionFactory sessionFactory) {
        System.out.println("Get");
        Session session = sessionFactory.openSession();
        Student student = (Student) session.get(Student.class, 1);
        Student student1 = (Student) session.get(Student.class, 2);
        Student student2 = (Student) session.get(Student.class, 3);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        session.close();
    }

    public static void insertStudentCertiData(String name, String address, String course, String duration, SessionFactory sessionFactory) {
        Student student = new Student();
        student.setStudentName(name);
        student.setStudentAddress(address);

        Certificatee certificatee = new Certificatee();
        certificatee.setCourse(course);
        certificatee.setDuration(duration);
        student.setCertificate(certificatee);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
}
