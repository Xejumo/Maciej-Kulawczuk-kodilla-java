package com.example.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        System.out.println("Testing calculations:");
        calculator.add(5, 2);
        calculator.sub(5, 2);
        calculator.mul(5, 2);
        calculator.div(5, 2);
    }
}
