package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Value("#{10+5}")
    private int add;
    @Value("#{10-5}")
    private int sub;
    @Value("#{10*5}")
    private int mul;
    @Value("#{10/10}")
    private int div;

    @Override
    public String toString() {
        return "Calculator{" +
                "add=" + add +
                ", sub=" + sub +
                ", mul=" + mul +
                ", div=" + div +
                '}';
    }
}
