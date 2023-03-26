package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {

    List<Flight> listaLotów = FlightRepository.getFlightsTable();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> lotyZWybranegoMiasta = new ArrayList<>();
        for (Flight iterowanyLot : listaLotów) {
            if (iterowanyLot.getDeparture().equals(departure)) {
                lotyZWybranegoMiasta.add(iterowanyLot);
            }
        }
        return lotyZWybranegoMiasta;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> lotyDoWybranegoMiasta = new ArrayList<>();
        for (Flight iterowanyLot : listaLotów) {
            if (iterowanyLot.getArrival().equals(arrival)) {
                lotyDoWybranegoMiasta.add(iterowanyLot);
            }
        }
        return lotyDoWybranegoMiasta;
    }
}