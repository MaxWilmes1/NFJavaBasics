package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import java.util.List;

public record Order(
        String id,
        List<Product> products
) {
}
