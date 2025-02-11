package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt;

import java.math.BigDecimal;

public record Produkt(
        String id,
        String name,
        BigDecimal price
) {
}
