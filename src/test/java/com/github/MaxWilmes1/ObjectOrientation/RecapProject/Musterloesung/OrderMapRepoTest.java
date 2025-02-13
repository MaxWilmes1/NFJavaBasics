package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.OrderPackage.Order;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.OrderPackage.OrderMapRepo;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.OrderPackage.OrderStatus;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.ProductPackage.Product;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class OrderMapRepoTest {

    @Test
    void getOrders() {
        //GIVEN
        OrderMapRepo orders = new OrderMapRepo();
        //WHEN
        List<Order> actual = orders.getOrders();
        //THEN
        List<Order> expected = new ArrayList<>();
        assertEquals(expected,actual);

    }

    @Test
    void getOrderbyId() {
        //GIVEN
        OrderMapRepo orders = new OrderMapRepo();
        Order o1 = new Order("1", new ArrayList<>(), OrderStatus.IN_PROGRESS);
        //WHEN
        orders.addOrder(o1);
        Order actual = orders.getOrderById("1");
        //THEN
        Order expected = new Order("1", new ArrayList<>(),OrderStatus.IN_PROGRESS);
        assertEquals(actual,expected);
    }

    @Test
    void addOrder() {
        //GIVEN
        OrderMapRepo orders = new OrderMapRepo();
        Product product = new Product("1", "Apfel");
        Order newOrder = new Order("1", List.of(product),OrderStatus.IN_PROGRESS);

        //WHEN
        Order actual = orders.addOrder(newOrder);

        //THEN
        Product product1 = new Product("1", "Apfel");
        Order expected = new Order("1", List.of(product1),OrderStatus.IN_PROGRESS);
        assertEquals(actual, expected);
        assertEquals(orders.getOrderById("1"), expected);
    }

    @Test
    void removeOrder() {
        //GIVEN
        OrderMapRepo repo = new OrderMapRepo();

        //WHEN
        repo.removeOrderById("1");

        //THEN
        assertNull(repo.getOrderById("1"));
    }
  
}