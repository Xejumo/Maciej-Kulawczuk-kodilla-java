package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    private Map<String, Boolean> airportMap;

    public FlightSearch() {
        airportMap = new HashMap<>();
        airportMap.put("Warsaw", true);
        airportMap.put("Berlin", true);
        airportMap.put("Paris", false);
        airportMap.put("New York", true);
    }
    public void findFlight(Flight flight) throws RouteNotFoundException {
        String departureAirport = flight.getDepartureAirport();
        String arrivalAirport = flight.getArrivalAirport();

        if (!airportMap.containsKey(departureAirport) || !airportMap.containsKey(arrivalAirport)) {
            throw new RouteNotFoundException("Route not found for " + departureAirport + " to " + arrivalAirport);
        }

        boolean isRouteAvailable = airportMap.get(arrivalAirport);
        if (!isRouteAvailable) {
            throw new RouteNotFoundException("No available route to " + arrivalAirport);
        }

        System.out.println("Flight from " + departureAirport + " to " + arrivalAirport + " is available.");
    }
}
