package com.example.kodilla.good.patterns.food;

public class HealthyShop implements Producer {
    @Override
    public String process(String supplier, int quantity, String productType) {
        System.out.printf("Processing order at HealthyShop for %d %s(s) from %s.%n", quantity, productType, supplier);
        return "Order processed successfully at HealthyShop.";
    }
}
