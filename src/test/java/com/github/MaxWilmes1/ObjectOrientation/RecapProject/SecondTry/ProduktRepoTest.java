package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.Produkt;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt.ProduktRepo;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProduktRepoTest {

    @Test
    void getProducts() {
        ProduktRepo repo = new ProduktRepo();
        repo.addProduct(new Produkt("1", "apple", 1.5));
        repo.addProduct(new Produkt("2", "apple", 2.1));
        //WHEN
        List<Produkt> actual = repo.getProducts();
        //THEN
        List<Produkt> expected = List.of(new Produkt("1", "apple", 1.5), new Produkt("2", "apple", 2.1));
        assertEquals(expected,actual);
    }

    @Test
    void getProductById() {
        //GIVEN
        ProduktRepo repo = new ProduktRepo();
        repo.addProduct(new Produkt("1", "apple", 1.5));
        //WHEN
        Produkt actual = repo.getProductById("1");
        //THEN
        Produkt expected = new Produkt("1", "apple", 1.5);
        assertEquals(expected,actual);
    }

    @Test
    void addProduct() {
        //GIVEN
        ProduktRepo repo = new ProduktRepo();
        repo.addProduct(new Produkt("3", "banana", 3.6));
        //WHEN
        Produkt actual = repo.getProductById("3");
        //THEN
        Produkt expected = new Produkt("3", "banana", 3.6);
        assertEquals(expected,actual);
        assertEquals(repo.getProductById("3"),actual);
    }

    @Test
    void removeProductById() {
        //GIVEN
        ProduktRepo repo = new ProduktRepo();
        //WHEN
        repo.removeProductById("3");
        //THEN
        assertNull(repo.getProductById("3"));
    }
}