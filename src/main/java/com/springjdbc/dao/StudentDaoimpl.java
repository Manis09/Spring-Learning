package com.springjdbc.dao;

import com.springjdbc.crudoperation.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@Component("stdao")
public class StudentDaoimpl implements StudentDao{

    JdbcTemplate jdbcTemplate;

//    public JdbcTemplate getJdbcTemplate() {
//        return jdbcTemplate;
//    }
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        System.out.println("setter");
//        this.jdbcTemplate = jdbcTemplate;
//    }
    @Autowired
    public StudentDaoimpl(JdbcTemplate jdbcTemplate) {
        System.out.println("constructor");
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Student student) {
        String query="insert into student (stu_id,f_name,l_name) values (?,?,?)";
        int i=jdbcTemplate.update(query,student.getStu_id(),student.getF_name(),student.getL_name());
        return i;
    }

    @Override
    public int updateDetails(Student student) {
        String query="update student set f_name where stu_id=?";
        int i=jdbcTemplate.update(query,student.getStu_id());
        return 1;
    }

    @Override
    public int delete(int id) {
        String query="delete student where stu_id=?";
        jdbcTemplate.update(query,id);
        return 0;
    }

    @Override
    public Student getStudent(int id) {
        String query="Select * from student where stu_id=?";

        RowMapper<Student> rowMapper=new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
               Student st=new Student();
               st.setStu_id(rs.getInt(1));
               st.setF_name(rs.getString(2));
               st.setL_name(rs.getString(3));
               return st;
            }
        };
        Student student=jdbcTemplate.queryForObject(query,rowMapper,id);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {

        String query="Select * from student";

        RowMapper<Student> rowMapper=new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student st=new Student();
                st.setStu_id(rs.getInt(1));
                st.setF_name(rs.getString(2));
                st.setL_name(rs.getString(3));
                return st;
            }
        };
        List<Student> list = jdbcTemplate.query(query, rowMapper);
        return list;
    }
}
