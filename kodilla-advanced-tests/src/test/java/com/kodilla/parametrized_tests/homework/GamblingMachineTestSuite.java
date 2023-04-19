package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    public Set<Integer> convertToSet(String input) {
        Set<Integer> userNumbersSet = new HashSet<>();
        String[] userNumbersList = input.split(",");
        int[] numbers = new int[userNumbersList.length];
        for (int i = 0; i < userNumbersList.length; i++) {
            numbers[i] = Integer.parseInt(userNumbersList[i]);
            userNumbersSet.add(numbers[i]);
        }
        return userNumbersSet;
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbersCorrect.csv", numLinesToSkip = 1)
    public void shouldCheckHitNumbers(String input) throws InvalidNumbersException {
        Set<Integer> userNumbersSet = convertToSet(input);
        boolean inNumberRange = gamblingMachine.howManyWins(userNumbersSet) >= 0 & gamblingMachine.howManyWins(userNumbersSet) <= 6;
        assertTrue(inNumberRange);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/userNumbersIncorrect.csv", numLinesToSkip = 1)
    public void shouldReturnException(String input) throws InvalidNumbersException {
        Set<Integer> userNumbersSet = convertToSet(input);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(userNumbersSet));
    }
}