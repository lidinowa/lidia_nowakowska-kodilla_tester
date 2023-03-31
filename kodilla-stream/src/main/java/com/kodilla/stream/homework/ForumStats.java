package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public static void main(String[] args) {
        System.out.println(getAverageNumberOfPostsPeopleOlderThan40(UsersRepository.getUsersList()));
        System.out.println(getAverageNumberOfPostsPeopleYoungerThan40(UsersRepository.getUsersList()));
    }

    public static double getAverageNumberOfPostsPeopleOlderThan40(List<User> users){
        return users
                .stream()
                .filter(user -> user.getAge() >= 45)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }

    public static double getAverageNumberOfPostsPeopleYoungerThan40(List<User> users){
      //  double average = users zamiast, zwracanie od razu do streama
        return users
                .stream()
                .filter(user -> user.getAge() < 45)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .getAsDouble();
    }
}