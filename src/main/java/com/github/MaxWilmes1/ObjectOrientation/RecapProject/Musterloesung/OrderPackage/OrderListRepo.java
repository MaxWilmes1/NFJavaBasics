package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.OrderPackage;

import java.util.ArrayList;
import java.util.List;

public class OrderListRepo implements OrderRepo {
    private final List<Order> orders = new ArrayList<>();

    public List<Order> getOrders() {
        return orders;
    }
    public Order getOrderById(String id){

        for (Order order : orders) {
            if ( order.id().equals(id) ){
                return order;
            }
        }
        return null;
    }

    public Order addOrder(Order newOrder){
        orders.add(newOrder);
        return newOrder;
    }

    public void removeOrderById(String id){
        for (Order order : orders) {
            if ( order.id().equals(id) ){
                orders.remove(order);
                return;
            }
        }
    }
}
