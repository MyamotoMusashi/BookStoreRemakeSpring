package com.example.demo.repositories;

import com.example.demo.model.service.BookServiceModel;
import com.example.demo.model.Order;
import com.example.demo.model.OrderItem;
import com.example.demo.model.OrderStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    public ArrayList<Order> orderList = new ArrayList<Order>();
    public ArrayList<OrderItem> itemsOrdered = new ArrayList<OrderItem>();



    public OrderRepository() {

    }

    public List<Order> getOrdersByUserId(Integer id) {
        System.out.println(this.orderList
                .stream()
                .filter(o -> o.userId == id)
                .toList());

        return this.orderList
                .stream()
                .filter(o -> o.userId == id)
                .toList();
    }

    public Order getOrderByOrderId(Integer orderId) {
      return this.orderList
                .stream()
                .filter((o -> o.id == orderId))
                .findFirst()
                .orElse(null);
    }

    public List<Order> getOrdersByStatus(OrderStatus orderStatus) {
        return this.orderList
                .stream()
                .filter((o -> o.status == orderStatus))
                .toList();
    }

    public Boolean addOrder(Order order) {
        order.id = this.orderList.size() + 1;
            for (OrderItem orderItem: order.itemsOrdered) {
                System.out.println(orderItem);
            }
        return this.orderList.add(order);
    }

    public Order updateOrderById(Order order) {
        Order orderToBeUpdated = this.orderList
                    .stream()
                    .filter((o -> o.id == order.id))
                    .findFirst()
                    .orElse(null);

        if (orderToBeUpdated != null) {
            orderToBeUpdated.status = order.status;

            return  orderToBeUpdated;
        }

        return  null;
    }
}
