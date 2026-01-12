package com.springcore;

public class Bike implements Vehicle{


    public Bike() {
        System.out.println("Bike object get created");
    }

    @Override
    public void start() {
        System.out.println("Bike start with kick");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stop by applying break");
    }
}
