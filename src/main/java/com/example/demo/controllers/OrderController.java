package com.example.demo.controllers;

import com.example.demo.model.Order;
import com.example.demo.model.OrderStatus;
import com.example.demo.repositories.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    public List<Order> getOrdersByStatus(@RequestParam(name = "status", required = false) OrderStatus orderStatus, @RequestParam(name = "filterByUserId", required = false) Integer userId) {
        if (orderStatus != null) {
            System.out.println(orderStatus);
            return this.orderRepository.getOrdersByStatus(orderStatus);
        }

        if (userId != null) {
            return this.orderRepository.getOrdersByUserId(userId);
        }

        return this.orderRepository.getOrdersByStatus(OrderStatus.Processed);
    }

    @PostMapping("/orders")
    public Boolean addOrder(@RequestBody Order order){
        return this.orderRepository.addOrder(order);
    }

    @GetMapping("/orders/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return this.orderRepository.getOrderByOrderId(id);
    }

    @PutMapping("/orders/{id}")
    public Order updateOrderById(@PathVariable Integer id, @RequestBody Order order){
        return this.orderRepository.updateOrderById(order);
    }
}
