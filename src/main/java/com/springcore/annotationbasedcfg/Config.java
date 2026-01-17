package com.springcore.annotationbasedcfg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Config {
    @Bean
    public Student getStudent(){
        return new Student(addr());
    }
    @Bean
    public Address getAddress(){
        return new Address("Fist Bean");
    }
    @Bean
    public Address addr(){
        return new Address("Second Bean");
    }
}
