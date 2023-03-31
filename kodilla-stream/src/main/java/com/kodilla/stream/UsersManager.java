package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;


public class UsersManager {
    public static void main(String[] args) {

        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        System.out.println(filterUsersOlderThan(40));
        System.out.println(whatIsAgeOfUsersFromGroup("Chemists"));
        System.out.println(filterUsersWithManagerRole());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                // .map(user -> user.getUsername())
                .map(UsersManager::getUserName)
                // .forEach(username -> System.out.println(username));
                .collect(Collectors.toList());
    }

    public static List<String> filterChemistGroupUsernames() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());                      // [2]
    }

    public static List<String> filterUsersOlderThan(int age) {
        //List<String> usersOlderThan = UsersRepository.getUsersList()  zamiast tego, return w pierwszej linii
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
    }

    public static List<Integer> whatIsAgeOfUsersFromGroup(String groupName) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals(groupName))
                .map(user -> user.getAge())
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersWithManagerRole() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Manager"))
                .collect(Collectors.toList());
    }
}