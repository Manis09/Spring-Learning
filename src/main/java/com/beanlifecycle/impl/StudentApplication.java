package com.beanlifecycle.impl;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApplication {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("implcfg.xml");
        context.registerShutdownHook();
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
    }
}
