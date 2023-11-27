package com.example.kodilla.good.patterns;

import com.example.kodilla.good.patterns.food.*;

public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {
        OrderHandler orderHandler = new OrderHandler();

        orderHandler.addProducer("ExtraFoodShop", new ExtraFoodShop());
        orderHandler.addProducer("HealthyShop", new HealthyShop());
        orderHandler.addProducer("GlutenFreeShop", new GlutenFreeShop());

        orderHandler.placeOrder("LocalFarm", 10, "Apples", "ExtraFoodShop");
        orderHandler.placeOrder("OrganicFarm", 5, "Quinoa", "HealthyShop");
        orderHandler.placeOrder("BioFarm", 8, "Gluten-Free Bread", "GlutenFreeShop");
    }
}

