package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.Produkt;

import java.util.List;

public record Bestellung(
        String id,
        List<Produkt> bestellteProdukte
) {
}
