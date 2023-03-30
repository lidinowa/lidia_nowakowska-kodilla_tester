package com.kodilla.stream;

import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {
    @BeforeAll
    public static List<User> dataSetUp() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 10, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4000, "Sales"));
        users.add(new User("Tuco Salamanca", 40, 30, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));
        return users;
    }

    @Test
    public void checkAveragePostsUserAbove40(){
        assertEquals(ForumStats.getAverageNumberOfPostsPeopleOlderThan40(dataSetUp()), 5);
    }

    @Test
    public void checkAveragePostsUserYoungerThan40(){
        assertEquals(ForumStats.getAverageNumberOfPostsPeopleYoungerThan40(dataSetUp()),2015);
    }
}