package com.springjdbc.dao;

import com.springjdbc.crudoperation.Employee;

public interface EmployeeDao {

    public int insert(Employee employee);

    public int update(Employee employee);

    public int delete(int id);

    public Employee getEmployee(int id);

    public Employee allEmployeeDetails();
}
