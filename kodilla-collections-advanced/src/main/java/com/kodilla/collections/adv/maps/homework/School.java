package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<String> students = new ArrayList<>();
    private String schoolName;

    public School(List<String> students, String scholName) {
        this.students = students;
        this.schoolName = scholName;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }

    public int numberOfStudents() {
        return students.size();
    }

    public String getScholName() {
        return schoolName;
    }
}