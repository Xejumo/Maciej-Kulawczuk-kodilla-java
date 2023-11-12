package com.example.kodillatesting.statistics;

import com.kodilla.testing.statistics.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class StatisticsCalculatorTest {

    private Statistics statistics;
    private StatisticsCalculator statisticsCalculator;

    @BeforeEach
    void setUp() {
        statistics = mock(Statistics.class);
        statisticsCalculator = new StatisticsCalculator();
    }

    @Test
    void testCalculateAdvStatisticsWhenNoPosts() {
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(10);
        when(statistics.usersNames()).thenReturn(java.util.Arrays.asList("User1", "User2"));

        statisticsCalculator.calculateAdvStatistics(statistics);

        assertEquals(0, statisticsCalculator.getAveragePostsPerUser());
        assertEquals(5, statisticsCalculator.getAverageCommentsPerUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhen1000Posts() {
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(500);
        when(statistics.usersNames()).thenReturn(java.util.Arrays.asList("User1", "User2", "User3"));

        statisticsCalculator.calculateAdvStatistics(statistics);

        assertEquals(333.33, statisticsCalculator.getAveragePostsPerUser(), 0.01);
        assertEquals(166.66, statisticsCalculator.getAverageCommentsPerUser(), 0.01);
        assertEquals(0.5, statisticsCalculator.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatisticsWhenNoComments() {
        when(statistics.postsCount()).thenReturn(20);
        when(statistics.commentsCount()).thenReturn(0);
        when(statistics.usersNames()).thenReturn(java.util.Arrays.asList("User1", "User2", "User3"));

        statisticsCalculator.calculateAdvStatistics(statistics);

        assertEquals(6.66, statisticsCalculator.getAveragePostsPerUser(), 0.01);
        assertEquals(0, statisticsCalculator.getAverageCommentsPerUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsLessThanPosts() {
        when(statistics.postsCount()).thenReturn(30);
        when(statistics.commentsCount()).thenReturn(20);
        when(statistics.usersNames()).thenReturn(java.util.Arrays.asList("User1", "User2", "User3"));

        statisticsCalculator.calculateAdvStatistics(statistics);

        assertEquals(10, statisticsCalculator.getAveragePostsPerUser());
        assertEquals(6.66, statisticsCalculator.getAverageCommentsPerUser(), 0.01);
        assertEquals(0.66, statisticsCalculator.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatisticsWhenCommentsMoreThanPosts() {
        when(statistics.postsCount()).thenReturn(10);
        when(statistics.commentsCount()).thenReturn(30);
        when(statistics.usersNames()).thenReturn(java.util.Arrays.asList("User1", "User2", "User3"));

        statisticsCalculator.calculateAdvStatistics(statistics);

        assertEquals(3.33, statisticsCalculator.getAveragePostsPerUser(), 0.01);
        assertEquals(10, statisticsCalculator.getAverageCommentsPerUser());
        assertEquals(3, statisticsCalculator.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatisticsWhenNoUsers() {
        when(statistics.postsCount()).thenReturn(5);
        when(statistics.commentsCount()).thenReturn(15);
        when(statistics.usersNames()).thenReturn(java.util.Collections.emptyList());

        statisticsCalculator.calculateAdvStatistics(statistics);

        assertEquals(0, statisticsCalculator.getAveragePostsPerUser());
        assertEquals(0, statisticsCalculator.getAverageCommentsPerUser());
        assertEquals(3, statisticsCalculator.getAverageCommentsPerPost(), 0.01);
    }

    @Test
    void testCalculateAdvStatisticsWhen100Users() {
        when(statistics.postsCount()).thenReturn(50);
        when(statistics.commentsCount()).thenReturn(100);
        when(statistics.usersNames()).thenReturn(createUserList(100));

        statisticsCalculator.calculateAdvStatistics(statistics);

        assertEquals(0.5, statisticsCalculator.getAveragePostsPerUser(), 0.01);
        assertEquals(1, statisticsCalculator.getAverageCommentsPerUser(), 0.01);
        assertEquals(2, statisticsCalculator.getAverageCommentsPerPost(), 0.01);
    }

    private java.util.List<String> createUserList(int count) {
        java.util.List<String> userList = new java.util.ArrayList<>();
        for (int i = 1; i <= count; i++) {
            userList.add("User" + i);
        }
        return userList;
    }
}