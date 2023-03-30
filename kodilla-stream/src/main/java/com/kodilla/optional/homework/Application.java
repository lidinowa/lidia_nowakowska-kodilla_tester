package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ellie", new Teacher("Joel")));
        studentList.add(new Student("Hermiona", new Teacher("Dumbledore")));
        studentList.add(new Student("Draco", new Teacher("Snape")));
        studentList.add(new Student("Luna", null));
        studentList.add(new Student("Mike", null));

        for (Student student : studentList) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String teacherName =
                    optionalTeacher.orElse(new Teacher("<undefined>")).getName();
            System.out.println("uczeń: " + student.getName() + " nauczyciel: " + teacherName);
        }

        // inny sposób:

        for (Student everyStudent : studentList) {
            Optional<Teacher> optionalTeacher2 = Optional.ofNullable(everyStudent.getTeacher());
            if (optionalTeacher2.isPresent()) {
                System.out.println(everyStudent.teacher.getName());
            } else {
                System.out.println("<undefined>");
            }
        }
    }
}