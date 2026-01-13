package com.beanlifecycle.anotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @PostConstruct
    public void init(){
        System.out.println("Object instantiated");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Object Destroyed");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
