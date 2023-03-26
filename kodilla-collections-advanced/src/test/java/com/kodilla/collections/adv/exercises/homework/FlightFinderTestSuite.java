package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    FlightFinder flightFinder = new FlightFinder();

    @Test
    public void checkWhatAreFlightsFromCity() {
        //given
        List<Flight> result = flightFinder.findFlightsFrom("Warsaw");
        //then
        assertEquals(2, result.size());
    }

    @Test
    public void checkWhatAreFlightsToCity() {
        //given
        List<Flight> result = flightFinder.findFlightsTo("Vienna");
        //then
        assertEquals(1, result.size());
    }

    @Test
    public void checkIfThereIsNoFlightFrom() {
        //given
        List<Flight> result = flightFinder.findFlightsFrom("Tokio");
        //then
        assertEquals(0, result.size());
    }

    @Test
    public void checkIfThereIsNoFlightTo() {
        //given
        List<Flight> result = flightFinder.findFlightsTo("Oslo");
        //then
        assertEquals(0, result.size());
    }
}