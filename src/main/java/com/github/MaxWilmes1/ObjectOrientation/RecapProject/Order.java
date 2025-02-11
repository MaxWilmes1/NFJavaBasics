package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import java.math.BigDecimal;

public record Order(
        String  type,
        int amount,
        BigDecimal value
) {
}
