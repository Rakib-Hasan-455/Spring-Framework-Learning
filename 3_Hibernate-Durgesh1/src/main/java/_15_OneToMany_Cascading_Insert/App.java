package _15_OneToMany_Cascading_Insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started!");
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate15.cfg.xml").buildSessionFactory();


        Student student1 = new Student(1, "Rakib", "Dhaka");

        List<Certificatee> stu1Certificates = new ArrayList<>();
        Certificatee stu1Certificate1 = new Certificatee(10, "Java", "3 Months", student1);
        Certificatee stu1Certificate2 = new Certificatee(2, "Intermid Java", "3 Months", student1);
        Certificatee stu1Certificate3 = new Certificatee(3, "Adv Java", "3 Months", student1);
        stu1Certificates.add(stu1Certificate1);
        stu1Certificates.add(stu1Certificate2);
        stu1Certificates.add(stu1Certificate3);

        insertStudentCertiData(student1, stu1Certificates, sessionFactory);


        Student student2 = new Student(2, "Rakib2", "Dhaka2");

        List<Certificatee> stu2Certificates = new ArrayList<>();
        Certificatee stu2Certificate1 = new Certificatee(4, "Java", "3 Months", student2);
        Certificatee stu2Certificate2 = new Certificatee(5, "Intermid Java", "3 Months", student2);

        stu2Certificates.add(stu2Certificate1);
        stu2Certificates.add(stu2Certificate2);

        insertStudentCertiData(student2, stu2Certificates, sessionFactory);

        fetchStudentDataWithGet(sessionFactory);
    }

    public static void insertStudentCertiData(Student student, List<Certificatee> certificatees, SessionFactory sessionFactory) {
        student.setCertificates(certificatees);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        // Cascading = No needed to save certificates in session via for loop
        transaction.commit();
        session.close();
    }

    private static void fetchStudentDataWithGet(SessionFactory sessionFactory) {
        System.out.println("Get");
        Session session = sessionFactory.openSession();
        Student student = session.get(Student.class, 1);
        Student student1 = session.get(Student.class, 2);
        // Eager Loading = Always fetches student and certificate both tables data
        System.out.println(student);
        // Lazy loading = Only loads/fetches certificate database when it's get
        System.out.println(student1.getCertificates());
        session.close();
    }
}
