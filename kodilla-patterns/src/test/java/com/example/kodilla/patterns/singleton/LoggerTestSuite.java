package com.example.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        // Given
        Logger logger = Logger.getInstance();

        // When
        logger.log("Test log");

        // Then
        assertEquals("Test log", logger.getLastLog());
    }

    @Test
    public void testSingleton() {
        // Given
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // When
        logger1.log("Log from logger1");

        // Then
        assertEquals("Log from logger1", logger2.getLastLog());
    }
}
