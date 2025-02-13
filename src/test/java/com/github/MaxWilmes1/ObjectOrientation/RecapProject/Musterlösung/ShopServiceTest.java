package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order.Order;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order.OrderStatus;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Product.Product;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    void addOrderTest() {
        //GIVEN
        ShopService shopService = new ShopService();
        //WHEN
        Order actual = shopService.addOrder(List.of("1"));
        //THEN
        Order expected = new Order("-1", List.of(new Product("1", "apple")), OrderStatus.IN_PROGRESS);
        assertEquals(actual.products(),expected.products());
    }
    @Test
    void addOrderTest_whenInvalidProductId_expectNull() {
        //GIVEN
        ShopService shopService = new ShopService();
        //WHEN
        Order actual = shopService.addOrder(List.of("1","2"));
        //THEN
        assertNull(actual);
    }
}