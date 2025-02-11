package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import java.math.BigDecimal;

public record Product(
        String type,
        int quantity,
        BigDecimal price
) {
}
