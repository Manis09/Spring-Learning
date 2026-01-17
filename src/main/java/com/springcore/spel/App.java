package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("spelcfg.xml");
        Calculator calculator = context.getBean("calculator", Calculator.class);
        System.out.println(calculator);
    }
}
