package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;


class ProductTest {

    @Test
    void given_emptyStore_whenAddApple_thenAppleInStore(){
        ProductRepo myStore = new ProductRepo(new ArrayList<>());
        int expected = 1;
        myStore.add(new Product("apple", 10, new BigDecimal("0.1")));
        int actual = myStore.getProducts().size();
        Assertions.assertEquals(expected,actual );
    }

    @Test
    void given_StoreWith2Entries_whenGet1Product_then2InStore(){
        ProductRepo myStore = new ProductRepo(new ArrayList<>());
        int expected = 1;
        myStore.add(new Product("apple", 10, new BigDecimal("0.1")));
        myStore.add(new Product("banana", 10, new BigDecimal("0.2")));
        myStore.remove("banana");
        int actual = myStore.getProducts().size();
        Assertions.assertEquals(expected,actual );
    }

}