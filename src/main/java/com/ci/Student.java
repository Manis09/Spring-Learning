package com.ci;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private Address address;
    private List<String> course;

    public Student(int id, String name, Address address, List<String> course) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", course=" + course +
                '}';
    }
}
