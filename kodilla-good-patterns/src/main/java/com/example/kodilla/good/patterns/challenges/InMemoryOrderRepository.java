package com.example.kodilla.good.patterns.challenges;

public class InMemoryOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, Product product, int quantity) {
        System.out.println("Creating order for user: " + user.getUsername() +
                ", product: " + product.getName() +
                ", quantity: " + quantity);
    }
}

