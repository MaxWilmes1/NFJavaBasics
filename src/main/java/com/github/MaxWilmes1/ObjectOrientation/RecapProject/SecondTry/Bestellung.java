package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import java.util.List;

public record Bestellung(
        String id,
        List<Produkt> bestellteProdukte
) {
}
