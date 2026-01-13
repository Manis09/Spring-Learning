package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("tconfig.xml");

        Test t = context.getBean("t", Test.class);
        System.out.println(t);
    }
}
