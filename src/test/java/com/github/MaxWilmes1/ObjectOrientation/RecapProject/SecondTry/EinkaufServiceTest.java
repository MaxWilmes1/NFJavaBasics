package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung.Bestellung;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.Produkt;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.ProduktRepo;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufServiceTest {

    @Test
    void erstellBestellung() {
        //GIVEN
        EinkaufService plattform = new EinkaufService();
        ProduktRepo meineWare = new ProduktRepo();
        Produkt p1 = new Produkt("1", "banane", new BigDecimal("4.1"),3);
        Produkt p2 = new Produkt("2", "apple", new BigDecimal("3.5"),4);
        meineWare.addProduct(p1);
        meineWare.addProduct(p2);
        plattform.setProduktRepo(meineWare);

        List<String> bestellteProdukte = new ArrayList<>();
        bestellteProdukte.add("1");
        bestellteProdukte.add("2");

        //WHEN
        Bestellung actual = plattform.erstellBestellung(bestellteProdukte);
        //THEN
        Bestellung expected = new Bestellung("-1", List.of(new Produkt("1", "banane", new BigDecimal("4.1"),3), new Produkt("2", "apple", new BigDecimal("3.5"),4)), new BigDecimal("26.3"));
        assertEquals(actual.bestellteProdukte(),expected.bestellteProdukte());
        assertEquals(actual.total(),expected.total());
    }
    @Test
    void erstellBestellung_whenInvalidProductId_thenNull() {
        //GIVEN
        EinkaufService plattform = new EinkaufService();
        ProduktRepo meineWare = new ProduktRepo();
        Produkt p1 = new Produkt("1", "banane", new BigDecimal("4.1"),6);
        Produkt p2 = new Produkt("2", "apple", new BigDecimal("4.1"),12);
        meineWare.addProduct(p1);
        meineWare.addProduct(p2);
        plattform.setProduktRepo(meineWare);

        List<String> bestellteProdukte = new ArrayList<>();
        bestellteProdukte.add("1");
        bestellteProdukte.add("3");

        //WHEN
        Bestellung actual = plattform.erstellBestellung(bestellteProdukte);
        //THEN
        assertNull(actual);
    }
}