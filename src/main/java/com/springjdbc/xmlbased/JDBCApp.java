package com.springjdbc.xmlbased;

import com.springjdbc.crudoperation.Student;
import com.springjdbc.dao.StudentDaoimpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.SQLException;

public class JDBCApp {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context =new ClassPathXmlApplicationContext("jdbcxmlcfg.xml");
        /*JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String query="insert into student(stu_id,f_name,l_name) values (?, ? ,?)";
        int update = jdbcTemplate.update(query,1,"Manish","Bhawsar");
        System.out.println("Successfully inserted "+update);*/

        StudentDaoimpl stdao = context.getBean("stdao", StudentDaoimpl.class);

        Student st=new Student();
        st.setStu_id(4);
        st.setF_name("Avinash");
        st.setL_name("Surwase");

        int insert = stdao.insert(st);
        System.out.println("Inserted successfully: "+insert);

    }
}
