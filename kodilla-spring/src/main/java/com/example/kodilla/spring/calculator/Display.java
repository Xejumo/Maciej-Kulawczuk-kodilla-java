package com.example.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Display {
    private double displayedValue;

    public double displayValue(double val) {
        System.out.println("Result: " + val);
        displayedValue = val;
        return val;
    }
}
