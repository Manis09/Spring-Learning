package com.springjdbc.annotationjdbccfg;

import com.springjdbc.crudoperation.Student;
import com.springjdbc.dao.StudentDaoimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context =new AnnotationConfigApplicationContext("com.springjdbc.annotationjdbccfg");
        /*JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplet", JdbcTemplate.class);
        String query="insert into student (stu_id,f_name,l_name) values (?,?,?)";
        int update = jdbcTemplate.update(query, 2, "Dinesh", "Shrirame");
        System.out.println("Successfully updated"+update);*/

        StudentDaoimpl stdao = context.getBean("stdao", StudentDaoimpl.class);
        List<Student> allStudent = stdao.getAllStudent();

        allStudent.stream().forEach(System.out::println);

    }
}
