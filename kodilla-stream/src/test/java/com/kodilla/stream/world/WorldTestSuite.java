package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        // Given
        World world = new World();

        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("38000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("83000000")));

        Continent asia = new Continent();
        asia.addCountry(new Country("China", new BigDecimal("1400000000")));
        asia.addCountry(new Country("India", new BigDecimal("1300000000")));

        world.addContinent(europe);
        world.addContinent(asia);

        // When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();

        // Then
        assertEquals(new BigDecimal("2737000000"), totalPeopleQuantity);
    }
}
