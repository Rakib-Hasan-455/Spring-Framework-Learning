package org.SpringJDBC.DAO;

import org.SpringJDBC.MODEL.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImplement implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setSID(rs.getInt("SID"));
        student.setSName(rs.getString("SName"));
        student.setSCity(rs.getString("SCity"));
        return student;
    }

}
