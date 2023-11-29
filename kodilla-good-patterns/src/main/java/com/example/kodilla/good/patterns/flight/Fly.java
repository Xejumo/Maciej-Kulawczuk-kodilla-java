package com.example.kodilla.good.patterns.flight;

import java.util.Objects;

public class Fly {
    private final String departure;
    private String via;
    private final String destination;

    public Fly(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public Fly(String departure, String via, String destination) {
        this.departure = departure;
        this.via = via;
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getVia() {
        return via;
    }

    public String getDestination() {
        return destination;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Fly fly = (Fly) obj;

        if (!departure.equals(fly.departure)) return false;
        if (!Objects.equals(via, fly.via)) return false;
        return destination.equals(fly.destination);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + (via != null ? via.hashCode() : 0);
        result = 31 * result + destination.hashCode();
        return result;
    }

    @Override
    public String toString() {
        if (via != null) {
            return "Flight from " + departure + " via " + via + " to " + destination;
        } else {
            return "Direct flight from " + departure + " to " + destination;
        }
    }
}
