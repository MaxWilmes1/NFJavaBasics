package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class ProductTest {

    @Test
    void given_emptyStore_whenAddApple_thenAppleInStore(){
        ProductRepo myStore = new ProductRepo(new ArrayList<>());
        int expected = 1;
        myStore.add(new Product("apple", 10));
        int actual = myStore.getProducts().size();
        Assertions.assertEquals(expected,actual );
    }

}