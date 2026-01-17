package com.springcore.autowiring.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowiringXMLApp {
    public static void main(String[] args) {
       ApplicationContext context =new ClassPathXmlApplicationContext("autowiringxml.xml");
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
    }
}
