package _10_Hibernate_Object_States;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // Hibernate Object Persistent States
        // 1) Transient
        // 2) Persistent
        // 3) Detached
        // 4) Removed

        System.out.println("Project Started!");

        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate10.cfg.xml").buildSessionFactory();

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

        // Transient State : student object
        Student student = new Student();
        student.setStudentName(name);
        student.setStudentAddress(address);
        student.setCertificate(new Certificatee(course, duration));
        //


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        // Persistent State : student object
        session.save(student);
        //
        student.setStudentName("Updated " + name);
        transaction.commit();
        // Detached State : student
        session.close();
        //
        student.setStudentName("After Detached");

        // Removed State : student with id 1
        Session session1 = sessionFactory.openSession();
        Student student1 = (Student) session.get(Student.class, 1);
        session1.remove(student1);
        //
    }
}
