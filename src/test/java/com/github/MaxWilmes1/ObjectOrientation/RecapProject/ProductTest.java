package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void given_emptyStore_whenAddApple_thenAppleInStore(){
        List<Product> products = new ArrayList<>();
        ProductRepo myStore = new ProductRepo(products);
        Product apple = new Product("apple", 10);
        int expected = 10;
        myStore.add(apple);
        for (Product item : myStore.getProducts()) {

        }


    }

}