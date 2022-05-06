package _13_HQL_Pagination;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started!");

        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate13.cfg.xml").buildSessionFactory();

//      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Create & Insert
        Student student = new Student(100, "Rakib", "Dhaka");
        Student student1 = new Student(101, "Rakib", "Dhaka1");
        Student student2 = new Student(102, "Sakib", "Dhaka1");
        Student student3 = new Student(103, "Sakib", "Dhaka1");
        Student student4 = new Student(104, "Sakib", "Dhaka1");
        Student student5 = new Student(105, "Sakib", "Dhaka1");
        Student student6 = new Student(106, "Sakib", "Dhaka1");
        Student student7 = new Student(107, "Sakib", "Dhaka1");
        Student student8 = new Student(108, "Sakib", "Dhaka1");
        Student student9 = new Student(109, "Sakib", "Dhaka1");


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(student1);
        session.save(student2);
        session.save(student3);
        session.save(student4);
        session.save(student5);
        session.save(student6);
        session.save(student7);
        session.save(student8);
        session.save(student9);
        transaction.commit();


        // Retrive with pagination


        String queryRetrive = "from Student";

        Query query1 = session.createQuery(queryRetrive);
        query1.setFirstResult(3); // start from 103
        query1.setMaxResults(4); // show till 3+4 = 107
        List<Student> studentList = query1.list();

        for (Student studentx : studentList) {
            System.out.println(studentx);
        }

        session.close();
        sessionFactory.close();
    }
}
