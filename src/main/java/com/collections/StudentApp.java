package com.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("collectionsconfig.xml");
        System.out.println(context);

        Students student1= (Students) context.getBean("student1");
        System.out.println(student1);
    }
}
