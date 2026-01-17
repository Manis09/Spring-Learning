package com.springcore.autowiring.annotationbased;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {
    private Address address;

    /*public Student() {
    }*/

    @Autowired
    public Student(Address address) {
        System.out.println("Constructor injection");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setter Injection");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
