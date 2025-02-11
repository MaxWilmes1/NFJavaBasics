package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Product;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.ProductRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProduktRepoTest {

    @Test
    void getProducts() {
        ProduktRepo repo = new ProduktRepo();
        repo.addProduct(new Produkt("1", "apple"));
        repo.addProduct(new Produkt("2", "strawberry"));
        //WHEN
        List<Produkt> actual = repo.getProducts();
        //THEN
        List<Produkt> expected = List.of(new Produkt("1", "apple"), new Produkt("2", "strawberry"));
        assertEquals(expected,actual);
    }

    @Test
    void getProductById() {
        //GIVEN
        ProduktRepo repo = new ProduktRepo();
        repo.addProduct(new Produkt("1", "apple"));
        //WHEN
        Produkt actual = repo.getProductById("1");
        //THEN
        Produkt expected = new Produkt("1", "apple");
        assertEquals(expected,actual);
    }

    @Test
    void addProduct() {
        //GIVEN
        ProduktRepo repo = new ProduktRepo();
        repo.addProduct(new Produkt("3", "banana"));
        //WHEN
        Produkt actual = repo.getProductById("3");
        //THEN
        Produkt expected = new Produkt("3", "banana");
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