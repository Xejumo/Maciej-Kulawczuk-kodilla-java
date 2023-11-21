package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println("Element " + (n + 1) + ": " + numbers[n]));

        double average = IntStream.range(0, numbers.length)
                .average()
                .orElse(0);

        System.out.println("Średnia: " + average);
        return average;
    }
}
