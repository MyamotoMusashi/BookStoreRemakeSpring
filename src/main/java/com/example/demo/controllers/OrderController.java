package com.example.demo.controllers;

import com.example.demo.entities.Order;
import com.example.demo.repositories.OrderRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OrderController {
    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @GetMapping("/orders")
    public List<Order> getOrdersByUserId(@RequestParam(name = "filterByUserId", required = false) Integer userId) {
        if (userId != null) {
            return this.orderRepository.getOrdersByUserId(userId);
        }

        return  this.orderRepository.orderList;
    }

    @PostMapping("/orders")
    public Boolean addOrder(@RequestBody Order order){
        return this.orderRepository.addOrder(order);
    }

    @GetMapping("orders/{id}")
    public Order getOrderById(@PathVariable Integer id){
        return this.orderRepository.getOrderByOrderId(id);
    }
}
