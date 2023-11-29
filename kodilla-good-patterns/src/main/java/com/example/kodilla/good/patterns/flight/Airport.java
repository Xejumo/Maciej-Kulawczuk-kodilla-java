package com.example.kodilla.good.patterns.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Airport {
    private final List<Fly> flights = new ArrayList<>();

    public void addFlight(Fly fly) {
        flights.add(fly);
    }

    public List<Fly> findFlightsFromCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getDeparture().equals(city))
                .collect(Collectors.toList());
    }

    public List<Fly> findFlightsToCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getDestination().equals(city))
                .collect(Collectors.toList());
    }

    public List<Fly> findFlightsViaCity(String city) {
        return flights.stream()
                .filter(flight -> flight.getDeparture().equals(city) || (flight.getVia() != null && flight.getVia().equals(city)))
                .collect(Collectors.toList());
    }
}
