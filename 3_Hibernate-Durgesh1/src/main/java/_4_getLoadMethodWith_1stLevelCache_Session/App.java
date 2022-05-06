package _4_getLoadMethodWith_1stLevelCache_Session;

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
        SessionFactory sessionFactory = configuration.configure("hibernate4.cfg.xml").buildSessionFactory();

//      SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        insertStudentData("Rakib", "Dhaka", sessionFactory);
        insertStudentData("Rakib1", "Dhaka1", sessionFactory);

        showStudentDataWithGet(sessionFactory);

        showStudentDataWithLoad(sessionFactory);
    }


    // 1st level cache
    private static void showStudentDataWithGet(SessionFactory sessionFactory) {
         System.out.println("Get");
        // Query fire hoi ALWAYS jokhon nirdisto data fetch kora hoi & fire hoina
        // jodi sei data already fetched hoi before and gives data from cache

        // Here session is first level cache
        Session session = sessionFactory.openSession();
        Student student = (Student) session.get(Student.class, 1);
        Student student1 = (Student) session.get(Student.class, 2);
        Student student2 = (Student) session.get(Student.class, 3);

        Student student3 = (Student) session.get(Student.class, 1);


        System.out.println(student);
//        System.out.println(student1);
        System.out.println(student2);
        // took student3 from cache
        System.out.println(student3);
        session.close();
    }

    // 1st level cache
    private static void showStudentDataWithLoad(SessionFactory sessionFactory) {
         System.out.println("Load");
        Session session = sessionFactory.openSession();
        Student student = (Student) session.load(Student.class, 1);
        Student student1 = (Student) session.load(Student.class, 1);
        Student student2 = (Student) session.load(Student.class, 3);

        // Only loads data from database or query fire hoi tokhon jokhon
        // we call student.getData()
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        session.close();
    }

    public static void insertStudentData(String name, String address, SessionFactory sessionFactory) {
        Student student = new Student();
        student.setStudentName(name);
        student.setStudentAddress(address);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(student);
        transaction.commit();
        session.close();
    }
}
