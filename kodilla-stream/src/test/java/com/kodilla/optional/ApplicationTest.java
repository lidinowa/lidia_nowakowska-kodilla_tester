package com.kodilla.optional;

import com.kodilla.optional.homework.Student;
import com.kodilla.optional.homework.Teacher;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {

    Student studentTest1 = new Student("Anna", new Teacher("Joanna"));
    Student studenTest2 = new Student("Ola", null);

    @Test
    public void studentWithTeacherAssigned() {
        assertEquals(studentTest1.getTeacher().getName(), "Joanna");
    }

    @Test
    public void studentWithoutTeacherAssigned() {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(studenTest2.getTeacher());
        String teacherName =
                optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        assertEquals(teacherName, "<undefined>");
    }
}