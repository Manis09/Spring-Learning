package com.springcore.annotationbasedcfg;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private Address address;

    public Student() {
    }

    public Student(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "address=" + address +
                '}';
    }
}
