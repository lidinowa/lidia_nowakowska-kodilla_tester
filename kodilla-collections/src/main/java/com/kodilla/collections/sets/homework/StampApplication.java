package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampApplication {
    public static void main(String[] args) {

        Stamp stamp1 = new Stamp("LandscapeStamp", 1, true);
        Stamp stamp2 = new Stamp("LandscapeStamp", 1, true); // nie został dodany - inna nazwa obiektu

        Set<Stamp> stampSet = new HashSet<>();

        stampSet.add(stamp1);
        stampSet.add(stamp2);
        stampSet.add(stamp2); // nie powinno dodać
        stampSet.add(new Stamp("HistoricalStamp", 2, false));
        stampSet.add(new Stamp("HistoricalStamp", 2, false)); // nie powinno dodać
        stampSet.add(new Stamp("HistoricalStamp", 2, true));

        for (Stamp stampTest : stampSet){
            System.out.println(stampTest);
        }

    }
}