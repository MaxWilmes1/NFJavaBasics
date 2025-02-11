package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import java.util.List;

public interface OrderRepo {

    List<Order> getOrders();

    Order getOrderById(String id);

    Order addOrder(Order newOrder);

    void removeOrderById(String id);

}
