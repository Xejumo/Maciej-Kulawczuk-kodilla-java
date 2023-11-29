package com.example.kodilla.spring.forum;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ForumUserTestSuite {

    @Autowired
    private ForumUser forumUser;

    @Test
    public void testGetUsername() {
        // Given

        // When
        String result = forumUser.getUsername();

        // Then
        assertEquals("John Smith", result);
    }
}
