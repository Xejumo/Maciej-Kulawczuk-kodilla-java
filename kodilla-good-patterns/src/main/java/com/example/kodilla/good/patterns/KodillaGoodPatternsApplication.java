package com.example.kodilla.good.patterns;

import com.example.kodilla.good.patterns.flight.Airport;
import com.example.kodilla.good.patterns.flight.Fly;

public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {
        Airport airport = new Airport();

        airport.addFlight(new Fly("GDAŃSK", "WROCŁAW"));
        airport.addFlight(new Fly("GDAŃSK", "KRAKÓW", "WROCŁAW"));
        airport.addFlight(new Fly("WARSZAWA", "KRAKÓW", "POZNAŃ"));

        System.out.println("Flights from GDAŃSK: " + airport.findFlightsFromCity("GDAŃSK"));
        System.out.println("Flights to WROCŁAW: " + airport.findFlightsToCity("WROCŁAW"));
        System.out.println("Flights via KRAKÓW: " + airport.findFlightsViaCity("KRAKÓW"));
    }
}

