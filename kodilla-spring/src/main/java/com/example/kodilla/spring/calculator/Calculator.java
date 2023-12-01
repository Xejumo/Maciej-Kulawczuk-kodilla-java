package com.example.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Calculator {

    private final Display display;

    @Autowired
    public Calculator(Display display) {
        Objects.requireNonNull(display, "Display cannot be null");
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        display.displayValue(result);
        return result;
    }

    public double sub(double a, double b) {
        double result = a - b;
        display.displayValue(result);
        return result;
    }

    public double mul(double a, double b) {
        double result = a * b;
        display.displayValue(result);
        return result;
    }

    public double div(double a, double b) {
        if (b != 0) {
            double result = a / b;
            display.displayValue(result);
            return result;
        } else {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
    }
}
