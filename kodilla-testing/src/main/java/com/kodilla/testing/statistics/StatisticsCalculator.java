package com.kodilla.testing.statistics;

public class StatisticsCalculator {
    private int userCount;
    private int postCount;
    private int commentCount;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.usersNames().size();
        postCount = statistics.postsCount();
        commentCount = statistics.commentsCount();

        if (userCount > 0) {
            averagePostsPerUser = (double) postCount / userCount;
            averageCommentsPerUser = (double) commentCount / userCount;
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }

        if (postCount > 0) {
            averageCommentsPerPost = (double) commentCount / postCount;
        } else {
            averageCommentsPerPost = 0;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + userCount);
        System.out.println("Number of posts: " + postCount);
        System.out.println("Number of comments: " + commentCount);
        System.out.println("Average posts per user: " + averagePostsPerUser);
        System.out.println("Average comments per user: " + averageCommentsPerUser);
        System.out.println("Average comments per post: " + averageCommentsPerPost);
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostCount() {
        return postCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
