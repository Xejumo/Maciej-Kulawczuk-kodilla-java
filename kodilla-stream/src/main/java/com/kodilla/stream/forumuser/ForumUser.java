package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String username;
    private char gender;
    private LocalDate birthDate;
    private int posts;

    public ForumUser(int userId, String username, char gender, LocalDate birthDate, int posts) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.birthDate = birthDate;
        this.posts = posts;

    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", posts=" + posts +
                '}';
    }
}
