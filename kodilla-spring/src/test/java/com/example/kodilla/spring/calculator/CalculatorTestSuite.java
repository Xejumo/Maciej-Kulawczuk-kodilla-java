package com.example.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    public void testCalculations() {
        System.out.println("Testing calculations:");

        double addResult = calculator.add(5, 2);
        assertEquals(7, addResult, 0.001);

        double subResult = calculator.sub(5, 2);
        assertEquals(3, subResult, 0.001);

        double mulResult = calculator.mul(5, 2);
        assertEquals(10, mulResult, 0.001);

        double divResult = calculator.div(5, 2);
        assertEquals(2.5, divResult, 0.001);
    }
}
