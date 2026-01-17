package com.springcore.beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanApp {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("cfgbean.xml");
        context.registerShutdownHook();
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
    }
}
