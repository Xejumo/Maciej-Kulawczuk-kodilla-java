package com.example.kodilla.good.patterns.food;

import java.util.HashMap;
import java.util.Map;

public class OrderHandler {
    private Map<String, Producer> producers = new HashMap<>();

    public void addProducer(String producerName, Producer producer) {
        producers.put(producerName, producer);
    }

    public void placeOrder(String supplier, int quantity, String productType, String producerName) {
        if (producers.containsKey(producerName)) {
            Producer producer = producers.get(producerName);
            String result = producer.process(supplier, quantity, productType);
            System.out.println(result);
        } else {
            System.out.println("Error: Producer " + producerName + " not found.");
        }
    }
}
