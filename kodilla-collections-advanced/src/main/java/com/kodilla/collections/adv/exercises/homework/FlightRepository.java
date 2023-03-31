package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flightList = new ArrayList<>();
        flightList.add(new Flight("Warsaw", "Faro"));
        flightList.add(new Flight("Warsaw", "Dublin"));
        flightList.add(new Flight("Berlin", "Bangkok"));
        flightList.add(new Flight("Katowice", "Vienna"));
    return flightList;
    }
}
