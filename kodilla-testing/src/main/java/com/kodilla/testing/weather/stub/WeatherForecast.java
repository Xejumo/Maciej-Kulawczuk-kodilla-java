package com.kodilla.testing.weather.stub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverageTemperature() {
        Map<String, Double> temperatureMap = temperatures.getTemperatures();
        double sum = temperatureMap.values().stream().mapToDouble(Double::doubleValue).sum();
        return sum / temperatureMap.size();
    }

    public double calculateMedianTemperature() {
        List<Double> temperatureList = new ArrayList<>(temperatures.getTemperatures().values());
        temperatureList.sort(Double::compareTo);
        int size = temperatureList.size();
        if (size % 2 == 0) {
            return (temperatureList.get(size / 2 - 1) + temperatureList.get(size / 2)) / 2.0;
        } else {
            return temperatureList.get(size / 2);
        }
    }
}
