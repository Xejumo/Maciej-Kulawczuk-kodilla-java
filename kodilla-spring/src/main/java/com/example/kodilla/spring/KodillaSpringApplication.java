package com.example.kodilla.spring;

import com.example.kodilla.spring.portfolio.FibonacciCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KodillaSpringApplication.class, args);

		FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

		int result = fibonacciCalculator.calculateFibonacci(10);

		System.out.println("Fibonacci(10) = " + result);
	}
}
