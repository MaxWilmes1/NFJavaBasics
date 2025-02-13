package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Product.Product;

import java.util.List;

public record Order(
        String id,
        List<Product> products,
        OrderStatus status
) {
}
