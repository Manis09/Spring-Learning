package com.springorm.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

public class App {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("ormconfig.xml");
        HibernateTemplate template = context.getBean("template", HibernateTemplate.class);
        System.out.println(template);

    }
}
