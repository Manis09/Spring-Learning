package com.beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student implements InitializingBean, DisposableBean {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Object destroyed interface");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Object initialization by implementing interface");
    }
    @PostConstruct
    public void init(){
        System.out.println("Object initialization by @PostConstruct");
    }
    @PreDestroy
    public void destroy1(){
        System.out.println("Object by @PreDestroy");
    }

    public void init1(){
        System.out.println("Through XML ini");
    }
    public void destroy2(){
        System.out.println("Through XML des");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
