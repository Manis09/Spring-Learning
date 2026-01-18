package com.springjdbc.dao;

import com.springjdbc.crudoperation.Student;

import java.util.List;

public interface StudentDao {

    public int insert(Student student);

    public int updateDetails(Student student);

    public int delete(int id);

    public Student getStudent(int id);

    public List<Student> getAllStudent();



}
