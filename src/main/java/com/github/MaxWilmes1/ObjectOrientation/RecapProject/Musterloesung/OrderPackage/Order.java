package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.OrderPackage;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.ProductPackage.Product;

import java.util.List;

public record Order(
        String id,
        List<Product> products,
        OrderStatus status
) {
}
