package com.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("ciconfig.xml");
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
        Student stu1 = context.getBean("stu1", Student.class);
        System.out.println(stu1);
    }

}
