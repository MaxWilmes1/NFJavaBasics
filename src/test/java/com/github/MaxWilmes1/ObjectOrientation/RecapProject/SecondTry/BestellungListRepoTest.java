package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestellungListRepoTest {

    @Test
    void getBestellungen() {
        //GIVEN
        BestellungListRepo repo = new BestellungListRepo();
        Bestellung b1 = new Bestellung("1", List.of(new Produkt("1", "apple"), new Produkt("2", "banana")));
        repo.addBestellung(b1);
        //WHEN
        List<Bestellung> actual = repo.getBestellungen();
        //THEN
        List<Bestellung> expected = List.of(new Bestellung("1", List.of(new Produkt("1", "apple"), new Produkt("2", "banana"))));
        assertEquals(expected,actual);
    }

    @Test
    void getBestellungById() {
        //GIVEN
        BestellungListRepo repo = new BestellungListRepo();
        Bestellung b1 = new Bestellung("1", List.of(new Produkt("1", "apple"), new Produkt("2", "banana")));
        repo.addBestellung(b1);
        //WHEN
        Bestellung actual = repo.getBestellungById("1");
        //THEN
        Bestellung expected = new Bestellung("1", List.of(new Produkt("1", "apple"), new Produkt("2", "banana")));
        assertEquals(actual,expected);
    }

    @Test
    void addBestellung() {
        //GIVEN
        BestellungListRepo repo = new BestellungListRepo();
        Bestellung b1 = new Bestellung("1", List.of(new Produkt("1", "apple"), new Produkt("2", "banana")));
        repo.addBestellung(b1);
        //WHEN
        Bestellung actual = repo.getBestellungById("1");
        //THEN
        Bestellung expected = new Bestellung("1", List.of(new Produkt("1", "apple"), new Produkt("2", "banana")));
        assertEquals(actual,expected);
        assertEquals(repo.getBestellungById("1"),actual);
    }

    @Test
    void removeBestellungById() {
        //GIVEN
        BestellungListRepo repo = new BestellungListRepo();
        //WHEN
        repo.removeBestellungById("2");
        //THEN
        assertNull(repo.getBestellungById("2"));

    }
}