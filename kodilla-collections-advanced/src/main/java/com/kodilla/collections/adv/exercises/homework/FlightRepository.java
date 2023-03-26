package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> listaLotów = new ArrayList<>();
        listaLotów.add(new Flight("Warsaw", "Faro"));
        listaLotów.add(new Flight("Warsaw", "Dublin"));
        listaLotów.add(new Flight("Berlin", "Bangkok"));
        listaLotów.add(new Flight("Katowice", "Vienna"));
    return listaLotów;
    }
}
