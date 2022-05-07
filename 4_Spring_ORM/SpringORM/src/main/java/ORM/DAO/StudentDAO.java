package ORM.DAO;

import ORM.Entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class StudentDAO {

    private HibernateTemplate hibernateTemplate;

@Transactional
    public int insert(Student student) {
        Integer nOfRows = (Integer) this.hibernateTemplate.save(student);
        return nOfRows;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    // Take one student
    public Student getOneStudent(int studentID) {
        Student student = this.hibernateTemplate.get(Student.class, studentID);
        return student;
    }

    // Take Many Student
    public List<Student> getManyStudent() {
        List<Student> list = this.hibernateTemplate.loadAll(Student.class);
        return list;
    }

    // Update
    @Transactional
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }

    // Delete
    @Transactional
    public void deleteStudent(int studentID) {
        Student student = this.hibernateTemplate.get(Student.class, studentID);
        this.hibernateTemplate.delete(student);
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
