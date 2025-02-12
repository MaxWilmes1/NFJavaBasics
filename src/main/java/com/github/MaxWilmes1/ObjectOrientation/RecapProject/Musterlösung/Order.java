package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung;

import java.util.List;

public record Order(
        String id,
        List<Product> products,
        OrderStatus status
) {
}
