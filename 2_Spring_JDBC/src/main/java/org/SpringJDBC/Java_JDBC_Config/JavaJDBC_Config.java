package org.SpringJDBC.Java_JDBC_Config;

import org.SpringJDBC.DAO.StudentDAO;
import org.SpringJDBC.DAO.StudentDAOImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import com.mysql.cj.jdbc.Driver;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.SpringJDBC.DAO"})
public class JavaJDBC_Config {

    @Bean("ds")
    public DataSource getDataSource () {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("admin");
        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
/*
    @Bean(name = {"studentDAO"})
    public StudentDAO getStudentDAO() {
        StudentDAOImplement studentDAO = new StudentDAOImplement();
        studentDAO.setJdbcTemplate(getJdbcTemplate());
        return studentDAO;
    }
*/
    // Autowiring instead of above bean declare manually

}
