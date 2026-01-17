package com.springcore.autowiring.annotationbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnotAutowiringApp {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("anotautowirecfg.xml");
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
    }
}
