package _2_FirstHibernateWithAnnotation;

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
        SessionFactory sessionFactory = configuration.configure("hibernate2.cfg.xml").buildSessionFactory();

//      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        System.out.println(sessionFactory);
        System.out.println(sessionFactory.isOpen());
        System.out.println(sessionFactory.isClosed());

        Student student = new Student(100, "Rakib", "Dhaka");
        System.out.println(student);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
