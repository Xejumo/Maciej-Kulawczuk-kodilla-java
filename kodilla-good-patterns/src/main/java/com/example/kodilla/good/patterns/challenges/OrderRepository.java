package com.example.kodilla.good.patterns.challenges;

public interface OrderRepository {
    void createOrder(User user, Product product, int quantity);
}
