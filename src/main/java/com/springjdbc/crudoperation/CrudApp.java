package com.springjdbc.crudoperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CrudApp {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context =new AnnotationConfigApplicationContext("com.springjdbc.crudoperation");
        JdbcTemplate jd = context.getBean("jd", JdbcTemplate.class);
        if(jd.getDataSource().getConnection()!=null){
            System.out.println("Connection Established");
        }else{
            System.out.println("Connection not established");
        }

        /**For updating exiting data*/
       /* String query="update student set f_name=? where stu_id=?";
        int update = jd.update(query, "Dani", 2);
        System.out.println("Updated successfully "+update);*/

        /**For Inserting data*/
        /*String query="insert into student(stu_id,f_name,l_name) values (?,?,?)";
        int update = jd.update(query, 4, "Bharat", "Karle");
        System.out.println("Inserted successfully "+update);*/

        /**For deleting data*/
        /*String query="delete from student where stu_id=?";
        int update = jd.update(query, 4);
        System.out.println("Deletion successful "+update);*/

        /**For accessing data by id
         *
         * When we want to fetch single row object from the database we should go for Row Mapper*/
        /*String query="select * from student where stu_id=?";
        RowMapper rowMapper=new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                String name = rs.getString(2);
                return name;
            }
        };
        String name = jd.queryForObject(query, rowMapper, 1).toString();
        System.out.println(name);*/

        /**Fetch all data from table*/

        String query="select * from student";
        RowMapper rowMapper=new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                String name = rs.getString(2);
                return name;
            }
        };
         List<String> list =jd.query(query,rowMapper);
         for(String s:list){
             System.out.println(s);
         }


    }
}
