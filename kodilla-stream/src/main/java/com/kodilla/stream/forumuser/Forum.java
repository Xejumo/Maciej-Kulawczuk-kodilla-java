package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        ForumUser user1 = new ForumUser(1, "JohnDoe", 'M', LocalDate.of(1990, 5, 15), 5);
        ForumUser user2 = new ForumUser(2, "JaneDoe", 'F', LocalDate.of(1985, 8, 22), 10);
        ForumUser user3 = new ForumUser(3, "BobSmith", 'M', LocalDate.of(2000, 3, 10), 3);

        addUser(user1);
        addUser(user2);
        addUser(user3);
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }

    public void addUser(ForumUser user) {
        userList.add(user);
    }
}
