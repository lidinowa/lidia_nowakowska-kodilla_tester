package com.kodilla.collections.adv.maps.homework;

public class Principal {

    private String principalName;

    public Principal(String principalName) {
        this.principalName = principalName;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "principalName='" + principalName + '\'' +
                '}';
    }

    public String getPrincipalName() {
        return principalName;
    }
}