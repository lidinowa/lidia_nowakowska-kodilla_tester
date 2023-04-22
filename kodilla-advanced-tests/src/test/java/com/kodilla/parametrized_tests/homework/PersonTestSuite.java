package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    private static Stream<Arguments> dataForBMITest() {
        return Stream.of(
                Arguments.of(1.90, 50, "Very severely underweight"),
                Arguments.of(1.80, 50, "Severely underweight"),
                Arguments.of(1.70, 50, "Underweight"),
                Arguments.of(1.60, 50, "Normal (healthy weight)"),
                Arguments.of(1.60, 65, "Overweight"),
                Arguments.of(1.60, 80, "Obese Class I (Moderately obese)"),
                Arguments.of(1.55, 85, "Obese Class II (Severely obese)"),
                Arguments.of(1.55, 100, "Obese Class III (Very severely obese)"),
                Arguments.of(1.55, 120, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.55, 140, "Obese Class V (Super Obese)")
        );
    }

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonTestSuite#dataForBMITest")
    public void shouldShowShowBMIDescription(double height, double weight, String expectedBMIResult) {
        Person person = new Person(height, weight);
        assertEquals(expectedBMIResult, person.getBMI());
    }
}