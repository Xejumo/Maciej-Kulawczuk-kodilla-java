package com.example.kodilla.exception.test;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {

    @Test
    void shouldHandleException() {
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 1.5;
        double y = 1.5;

        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void shouldNotThrowException() {
        SecondChallenge secondChallenge = new SecondChallenge();
        double x = 1.0;
        double y = 2.0;

        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x, y));
    }

    @Test
    void shouldHandleEdgeCases() {
        SecondChallenge secondChallenge = new SecondChallenge();

        double x1 = 0.5;
        double y1 = 2.0;
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x1, y1));

        double x2 = 1.0;
        double y2 = 2.0;
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(x2, y2));

        double x3 = 2.1;
        double y3 = 2.0;
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x3, y3));

        double x4 = 1.0;
        double y4 = 1.5;
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(x4, y4));
    }
}