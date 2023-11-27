package com.example.kodilla.good.patterns;

import com.example.kodilla.good.patterns.challenges.*;

public class KodillaGoodPatternsApplication {

    public static void main(String[] args) {
        InformationService informationService = new ConsoleInformationService();
        OrderRepository orderRepository = new InMemoryOrderRepository();

        ProductOrderService productOrderService = new ProductOrderService(informationService, orderRepository);

        User user = new User("john_doe");
        Product product = new Product("Laptop");
        int quantity = 1;

        boolean isOrdered = productOrderService.order(user, product, quantity);

        if (isOrdered) {
            System.out.println("Order successfully placed!");
        } else {
            System.out.println("Failed to place the order.");
        }
    }
}
