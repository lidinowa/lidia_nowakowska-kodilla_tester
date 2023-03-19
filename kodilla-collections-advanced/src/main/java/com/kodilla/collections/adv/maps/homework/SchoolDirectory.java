package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal principalOlympe = new Principal("Olympe");
        Principal principalDumbledore = new Principal("Dumbledore");
        Principal principalIgor = new Principal("Igor");

        School beauxbatonsSchool = new School(Arrays.asList("Fleur", "Gabrielle"), "Beauxbatons");
        School hogwartSchool = new School(Arrays.asList("Ron", "Hermiona", "Harry"), "Hogwart");
        School durmstrangSchool = new School(Arrays.asList("Victor"), "Durmstrang");

        school.put(principalOlympe, beauxbatonsSchool);
//      school.put(principalEva, hogwartSchool); przypisanie wcześniej użytego klucza do nowej szkoły zmienia klucz na nowy
        school.put(principalDumbledore, hogwartSchool);
        school.put(principalIgor, durmstrangSchool);

        for (Map.Entry<Principal, School> schoolDetails : school.entrySet()) {
            System.out.println("School " + schoolDetails.getValue().getScholName() + " is managed by "
                    + schoolDetails.getKey().getPrincipalName() + " and the number of students there is: " +
                    schoolDetails.getValue().numberOfStudents());
        }
    }
}