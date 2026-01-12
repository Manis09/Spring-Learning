package com.primitivetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("stuconfig.xml");


        Student stu1 = context.getBean("stu1",Student.class);
        Student stu2 = context.getBean("stu2",Student.class);

        System.out.println(stu1);
        System.out.println(stu2);
    }
}
