package com.example.demo.repositories;

import com.example.demo.entities.Book;
import com.example.demo.entities.Order;
import com.example.demo.entities.OrderItem;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    public ArrayList<Order> orderList = new ArrayList<Order>();
    public ArrayList<OrderItem> itemsOrdered = new ArrayList<OrderItem>();

    Book book2 = new Book(
            2,
            "Harry Potter and the Chamber of Secrets",
            "George R.R Martin",
            10.96,
            "The Dursleys were so mean that hideous that summer that all Harry Potter wanted was to get back to the Hogwarts School for Witchcraft and Wizardry. But just as he's packing his bags Harry receives a warning from a strange, impish creature named Dobby who says that if Harry Potter returns to Hogwarts, disaster will strike. And strike it does. For in Harry's second year at Hogwarts, fresh torments and horrors arise, including an outrageously stuck-up new professor, Gilderoy Lockheart, a spirit named Moaning Myrtle who haunts the girls' bathroom, and the unwanted attentions of Ron Weasley's younger sister, Ginny. But each of these seem minor annoyances when the real trouble begins, and someone--or something--starts turning Hogwarts students to stone. Could it be Draco Malfoy, a more poisonous rival than ever? Could it possibly be Hagrid, whose mysterious past is finally told? Or could it be the one everyone at Hogwarts most suspects...Harry Potter himself?",
            "data:image/jpeg;base64,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"
    );

    public OrderRepository() {
        this.itemsOrdered.add(new OrderItem(book2, 2));
        Order order1 = new Order(orderList.size()+1, 1, itemsOrdered);
        this.orderList.add(order1);
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

    public Boolean addOrder(Order order) {
        order.id = this.orderList.size() + 1;
            for (OrderItem orderItem: order.itemsOrdered) {
                System.out.println(orderItem);
            }
        return this.orderList.add(order);
    }
}
