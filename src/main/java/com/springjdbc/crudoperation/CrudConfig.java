package com.springjdbc.crudoperation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class CrudConfig {
    @Bean
    public DataSource getDataSource(){
        DriverManagerDataSource ds=new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/spring_jdbc");
        ds.setUsername("postgres");
        ds.setPassword("manish");
        return ds;
    }
    @Bean(name = "jd")
    public JdbcTemplate getJdbcTemplate(){
        JdbcTemplate jd=new JdbcTemplate();
        jd.setDataSource(getDataSource());
        return jd;
    }
}
