package com.example.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;

    public ProductOrderService(InformationService informationService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean order(User user, Product product, int quantity) {

        informationService.inform(user);
        orderRepository.createOrder(user, product, quantity);

        return true;
    }
}
