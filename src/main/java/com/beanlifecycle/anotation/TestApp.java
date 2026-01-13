package com.beanlifecycle.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        AbstractApplicationContext context =new ClassPathXmlApplicationContext("anotcfg.xml");
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
        context.registerShutdownHook();
    }
}
