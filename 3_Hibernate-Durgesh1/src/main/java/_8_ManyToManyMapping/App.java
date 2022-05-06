package _8_ManyToManyMapping;

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
        SessionFactory sessionFactory = configuration.configure("hibernate8.cfg.xml").buildSessionFactory();

        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Rakib", "Dhaka");
        Student student2 = new Student(2, "Rakib2", "Dhaka2");
        students.add(student1);
        students.add(student2);


        List<Certificatee> studentCertificates = new ArrayList<>();
        Certificatee studentCertificate1 = new Certificatee(10, "Java", "3 Months");
        Certificatee studentCertificate2 = new Certificatee(2, "Intermid Java", "3 Months");
        Certificatee studentCertificate3 = new Certificatee(3, "Adv Java", "3 Months");
        studentCertificates.add(studentCertificate1);
        studentCertificates.add(studentCertificate2);
        studentCertificates.add(studentCertificate3);

        student1.setCertificates(studentCertificates);
        student2.setCertificates(studentCertificates);

        studentCertificate1.setStudents(students);
        studentCertificate2.setStudents(students);
        studentCertificate3.setStudents(students);

        insertStudentCertiData(students, studentCertificates, sessionFactory);
    }

    public static void insertStudentCertiData(List<Student> students, List<Certificatee> certificatees, SessionFactory sessionFactory) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        for (Student student : students) {
            session.save(student);
        }

        for (Certificatee certificatee : certificatees) {
            session.save(certificatee);
        }
        transaction.commit();
        session.close();
    }
}
