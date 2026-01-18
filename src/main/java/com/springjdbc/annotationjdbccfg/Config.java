package com.springjdbc.annotationjdbccfg;

import com.springjdbc.dao.StudentDaoimpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class Config {
/**Here we created the driver manager data source object and set the values for DriverManager,URL,USERNAME,PASSWORD and get the
   datasource object.*/
    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/spring_jdbc");
        dataSource.setUsername("postgres");
        dataSource.setPassword("manish");
        return dataSource;
    }

    /**Here  we create the object of JDBCTemplate and establish the connection.*/
    @Bean(name = "jdbcTemplet")
    public JdbcTemplate getJdbcTemplet(){
        JdbcTemplate jd=new JdbcTemplate();
        jd.setDataSource(getDataSource());
        return jd;
    }

}