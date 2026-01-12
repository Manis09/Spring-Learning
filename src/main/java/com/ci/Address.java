package com.ci;

public class Address {
    private int id;
    private String city;

    public Address(int id, String city) {
        this.id = id;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                '}';
    }
}
