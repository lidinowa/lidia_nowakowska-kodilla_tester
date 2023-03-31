package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    List<Flight> flightList = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flightFromSelectedAirport = new ArrayList<>();
        for (Flight givenFlight : flightList) {
            if (givenFlight.getDeparture().equals(departure)) {
                flightFromSelectedAirport.add(givenFlight);
            }
        }
        return flightFromSelectedAirport;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flightToSelectedAirport = new ArrayList<>();
        for (Flight givenFlight : flightList) {
            if (givenFlight.getArrival().equals(arrival)) {
                flightToSelectedAirport.add(givenFlight);
            }
        }
        return flightToSelectedAirport;
    }
}