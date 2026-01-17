package com.springcore.sterotypeanotation;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.ArrayList;

@Component
public class Student {
    @Value("41")
    private int id;
    @Value("Manish")
    private String name;
    @Value("#{ad}")
    private ArrayList<String> address;


   /* public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
