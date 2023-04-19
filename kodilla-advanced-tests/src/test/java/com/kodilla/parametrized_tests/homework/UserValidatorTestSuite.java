package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @CsvSource(value = {"Ala", "123", ".-_", "User123456."})
    public void shouldReturnTrueForCorrectUsername(String input) {
        assertTrue(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"12", "ab", "A"})
    public void shouldReturnFalseForIncorrectUsernameTooShortUsername(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"abc!@", "+XY+", "@#$"})
    public void shouldReturnFalseForIncorrectUsernameForbiddenSigns(String input) {
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfStringIsEmpty(String input) {
        System.out.println("|" + input + "|");
        assertFalse(userValidator.validateUsername(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"lidia@nowa.pl", "lIDiA.NO.9102@email.com", "a-_a-_@a.pl", "a@a.a", "-@-.plplpl"})
    public void shouldReturnTrueForCorrectEmail(String input) {
        assertTrue(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"lidia.@p", "Lidia11@.onet.pl", "1@-_..pl", "lll", "12", "l@l.plplplplpl", "l@l.123"})
    public void shouldReturnFalseForIncorrectEmail(String input) {
        assertFalse(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnFalseIfEmailIsNull(String input) {
        assertFalse(userValidator.validateEmail(input));
    }

    @ParameterizedTest
    @EmptySource
    public void shouldReturnFalseIfEmailIsEmpty(String email) {
        assertTrue(userValidator.validateEmail(email));
    }

//    @ParameterizedTest
//    @CsvSource(value = {"zaba", "Gora", "laka"})
//    public void shouldReturnFalseForIncorrectUsernamePolishLetters(String input) {
//        assertFalse(userValidator.validateUsername(input));
//    }

//    @ParameterizedTest
//    @NullSource
//    public void shouldReturnFalseIfStringIsNull(String input) {
//        System.out.println("|" + input + "|");
//        assertFalse(userValidator.validateUsername(input));
//    }
}