package com.springcore;

public class Car implements Vehicle {

    public Car() {
        System.out.println("Car object get created");
    }

    @Override
    public void start() {
        System.out.println("Car started ");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
