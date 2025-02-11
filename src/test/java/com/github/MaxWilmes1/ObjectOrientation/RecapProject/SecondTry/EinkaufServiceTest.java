package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Bestellung.Bestellung;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.Produkt;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.ProduktRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufServiceTest {

    @Test
    void erstellBestellung() {
        //GIVEN
        EinkaufService plattform = new EinkaufService();
        ProduktRepo meineWare = new ProduktRepo();
        Produkt p1 = new Produkt("1", "banane", 4.1);
        Produkt p2 = new Produkt("2", "apple", 4.1);
        meineWare.addProduct(p1);
        meineWare.addProduct(p2);
        plattform.setProduktRepo(meineWare);

        List<String> bestellteProdukte = new ArrayList<>();
        bestellteProdukte.add("1");
        bestellteProdukte.add("2");

        //WHEN
        Bestellung actual = plattform.erstellBestellung(bestellteProdukte);
        //THEN
        Bestellung expected = new Bestellung("-1", List.of(new Produkt("1", "banane", 4.1), new Produkt("2", "apple", 4.1)));
        assertEquals(actual.bestellteProdukte(),expected.bestellteProdukte());
    }
    @Test
    void erstellBestellung_whenInvalidProductId_thenNull() {
        //GIVEN
        EinkaufService plattform = new EinkaufService();
        ProduktRepo meineWare = new ProduktRepo();
        Produkt p1 = new Produkt("1", "banane", 4.1);
        Produkt p2 = new Produkt("2", "apple", 4.1);
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