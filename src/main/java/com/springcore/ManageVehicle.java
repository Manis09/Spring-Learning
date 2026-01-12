package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ManageVehicle {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        System.out.println(context);


        Car car = (Car) context.getBean("car");
        car.start();
        car.stop();
    }
}
