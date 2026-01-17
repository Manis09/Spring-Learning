package com.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("refconfig.xml");
        System.out.println(context);

        Student stu1 = context.getBean("stu1", Student.class);
        System.out.println(stu1);

        Student stu2 = context.getBean("stu2", Student.class);
        System.out.println(stu2);
    }
}
