package com.kodilla.exception.main;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightSearch;
import com.kodilla.exception.test.RouteNotFoundException;

public class ExceptionModuleRunner {
        public static void main(String[] args) {
            FlightSearch flightSearch = new FlightSearch();

            try {
                // Przykład lotu z dostępnym połączeniem
                Flight availableFlight = new Flight("Warsaw", "Berlin");
                flightSearch.findFlight(availableFlight);

                // Przykład lotu z niedostępnym połączeniem
                Flight unavailableFlight = new Flight("Paris", "Berlin");
                flightSearch.findFlight(unavailableFlight);
            } catch (RouteNotFoundException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
}
