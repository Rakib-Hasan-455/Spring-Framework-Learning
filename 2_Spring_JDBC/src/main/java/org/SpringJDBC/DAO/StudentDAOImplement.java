package org.SpringJDBC.DAO;

import org.SpringJDBC.MODEL.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("studentDAO")
public class StudentDAOImplement implements StudentDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String query = "INSERT INTO STUDENT (SID, SName, SCity) VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(query, student.getSID(), student.getSName(), student.getSCity());
        return result;
    }

    @Override
    public int update(Student student) {
        String query = "UPDATE STUDENT SET SNAME = ?, SCITY = ? WHERE SID = ?";
        int result = jdbcTemplate.update(query, student.getSName(), student.getSCity(), student.getSID());
        return result;
    }

    @Override
    public int delete(int studentID) {
        String query = "DELETE FROM STUDENT WHERE SID = ?";
        int result = jdbcTemplate.update(query, studentID);
        return result;
    }

    @Override
    public List<Student> retriveAllStudent() {
        // Selecting all student data
        String query = "SELECT * FROM STUDENT";

        RowMapper<Student> rowMapper = new RowMapperImplement();
        List<Student> students =  jdbcTemplate.query(query, new RowMapperImplement());
        return students;
    }

    @Override
    public Student retriveSingleStudent(int studentID) {
        // Select single student data
        String query = "SELECT * FROM STUDENT WHERE SID = ?";

        RowMapper<Student> rowMapper = new RowMapperImplement();
        Student student = jdbcTemplate.queryForObject(query, rowMapper, studentID);
        return student;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

//    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
