package _3_InsertDifferentTypeDataHQL;

import _2_FirstHibernateWithAnnotation.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Project Started!");

        Configuration configuration = new Configuration();
        SessionFactory sessionFactory = configuration.configure("hibernate3.cfg.xml").buildSessionFactory();

//      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        System.out.println(sessionFactory);
        System.out.println(sessionFactory.isOpen());
        System.out.println(sessionFactory.isClosed());

        Address address = new Address();
        address.setCity("Delhi");
        address.setOpen(false);
        address.setAddedDate(new Date());
        address.setX(12.22);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(address);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
