package com.springjdbc.dao;

import com.springjdbc.crudoperation.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeImpl implements EmployeeDao{

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insert(Employee employee) {
        String query="insert into employee (id,name,dept) values (?,?,?)";
        int update = jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getDept());
        return update;
    }

    @Override
    public int update(Employee employee) {
        String query="update employee set dept where id=?";
        int update = jdbcTemplate.update(query, employee.getId());
        return update;
    }

    @Override
    public int delete(int id) {
        String query="delete employee where id=?";
        int update = jdbcTemplate.update(query, id);
        return update;
    }

    @Override
    public Employee getEmployee(int id) {
        String query="select * from employee where id=?";

        RowMapper<Employee> rowMapper=new RowMapper() {
            @Override
            public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
               Employee emp=new Employee();
               emp.setId(rs.getInt(1));
               emp.setName(rs.getString(2));
               emp.setDept(rs.getString(3));
                return emp;
            }
        };
        Employee employee = jdbcTemplate.queryForObject(query, rowMapper, id);
        return employee;
    }

    @Override
    public Employee allEmployeeDetails() {
        return null;
    }
}
