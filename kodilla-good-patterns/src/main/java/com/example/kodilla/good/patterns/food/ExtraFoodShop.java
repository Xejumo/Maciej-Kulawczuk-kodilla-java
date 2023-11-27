package com.example.kodilla.good.patterns.food;

public class ExtraFoodShop implements Producer {
    @Override
    public String process(String supplier, int quantity, String productType) {
        System.out.printf("Processing order at ExtraFoodShop for %d %s(s) from %s.%n", quantity, productType, supplier);
        return "Order processed successfully at ExtraFoodShop.";
    }
}
