package _12_HQL_Join_Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started!");
        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate12.cfg.xml").buildSessionFactory();


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
        Certificatee stu2Certificate3 = new Certificatee(6, "Adv Java", "3 Months", student2);
        stu2Certificates.add(stu2Certificate1);
        stu2Certificates.add(stu2Certificate2);
        stu2Certificates.add(stu2Certificate3);
        insertStudentCertiData(student2, stu2Certificates, sessionFactory);

        Session session = sessionFactory.openSession();

        // Retrieve by join query
        String joinQuery = "select s.studentID, c.course from Student as s INNER JOIN s.certificates as c";
        Query queryX = session.createQuery(joinQuery);
        // Multiple List
        List<Object[]> studentList1 = queryX.getResultList();

        for (Object[] studentx : studentList1) {
            System.out.println(Arrays.toString(studentx));
        }
        session.close();
        sessionFactory.close();

    }

    public static void insertStudentCertiData(Student student, List<Certificatee> certificatees, SessionFactory sessionFactory) {
        student.setCertificates(certificatees);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(student);
        for (Certificatee certificatee : certificatees) {
            session.save(certificatee);
        }
        transaction.commit();
        session.close();
    }
}
