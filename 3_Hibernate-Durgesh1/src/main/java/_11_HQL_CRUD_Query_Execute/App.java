package _11_HQL_CRUD_Query_Execute;

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
        SessionFactory sessionFactory = configuration.configure("hibernate11.cfg.xml").buildSessionFactory();

//      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Create & Insert
        Student student = new Student(100, "Rakib", "Dhaka");
        Student student1 = new Student(101, "Rakib", "Dhaka1");
        Student student2 = new Student(102, "Sakib", "Dhaka1");


        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        session.save(student1);
        session.save(student2);
        transaction.commit();


        // Retrive

        // String query = "from Student where studentName = 'Rakib' ";

        String queryRetrive = "from Student where studentName = :studentName";

        Query query1 = session.createQuery(queryRetrive);
        query1.setParameter("studentName", "Rakib");
        // Single Row (Unique)
        // query1.uniqueResult()
        // Multiple List
        List<Student> studentList = query1.list();

        for (Student studentx : studentList) {
            System.out.println(studentx);
        }


        // Update

        Transaction transaction2 = session.beginTransaction();
        String queryUpdate = "Update from Student set studentName = :studentName where studentID = :studentID";
        Query query3 = session.createQuery(queryUpdate);
        query3.setParameter("studentID", 100);
        query3.setParameter("studentName", "RRaakibb");
        int updatedCnt = query3.executeUpdate();
        System.out.println(updatedCnt + " rows Updated");
        transaction2.commit();


        // Delete
        Transaction transaction1 = session.beginTransaction();
        String queryDelete = "delete from Student where studentID = :studentID";
        Query query2 = session.createQuery(queryDelete);
        query2.setParameter("studentID", 101);
        int deleted = query2.executeUpdate();
        System.out.println(deleted + " rows deleted");
        transaction1.commit();


        // Retrive Final
        String queryRetrive1 = "from Student";

        Query queryX = session.createQuery(queryRetrive1);
        // Multiple List
        List<Student> studentList1 = queryX.list();

        for (Student studentx : studentList1) {
            System.out.println(studentx);
        }

        session.close();
        sessionFactory.close();
    }
}
