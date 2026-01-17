package com.springcore.annotationbasedcfg;

public class Address {
    private String name;

    public Address(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                '}';
    }
}
