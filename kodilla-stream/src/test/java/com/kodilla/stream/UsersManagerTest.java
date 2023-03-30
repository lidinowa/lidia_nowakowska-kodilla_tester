package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {

    @Test
    public void checkNamesFromChemistGroup() {
        List<String> result = new ArrayList<>();
        result.add("Walter White");
        result.add("Gale Boetticher");
        assertEquals(UsersManager.filterChemistGroupUsernames(), result);
    }

    @Test
    public void checkUsersOlderThan51() {
        List<String> result = new ArrayList<>();
        result.add("Mike Ehrmantraut");
        assertEquals(UsersManager.filterUsersOlderThan(51), result);
    }

    @Test
    public void checkWhatIsAgeOfUsersFromChemistsGroup() {
        List<Integer> result = new ArrayList<>();
        result.add(50);
        result.add(44);
        assertEquals(UsersManager.whatIsAgeOfUsersFromGroup("Chemists"), result);
    }

    @Test
    public void checkFilteredUsersToManagerRole() {
        List<User> result = new ArrayList<>();
        result.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        assertEquals(UsersManager.filterUsersWithManagerRole(), result);

    }
}