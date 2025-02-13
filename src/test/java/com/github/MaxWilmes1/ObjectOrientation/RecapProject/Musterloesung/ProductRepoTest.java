package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.ProductPackage.Product;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.ProductPackage.ProductRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepoTest {

    @Test
    void getProductsTest() {
        //GIVEN
        ProductRepo repo = new ProductRepo();
        //WHEN
        List<Product> actual = repo.getProducts();
        //THEN
        List<Product> expected = new ArrayList<>();
        expected.add(new Product("1", "apple"));
        assertEquals(expected, actual);
    }

    @Test
    void getProductByIdTest() {
        //GIVEN
        ProductRepo repo = new ProductRepo();
        //WHEN
        Optional<Product> actual = repo.getProductById("1");
        //THEN
        Optional<Product> expected = Optional.of(new Product("1", "apple"));
        assertEquals(expected, actual);
    }

    @Test
    void addProductTest() {
        //GIVEN
        ProductRepo repo = new ProductRepo();
        Product newProduct = new Product("2", "banana");
        //WHEN
        Product actual = repo.addProduct(newProduct);
        //THEN
        Product expected = new Product("2", "banana");
        assertEquals(expected,actual);
//        assertEquals(repo.getProductById("2"),actual);
    }

    @Test
    void removeProductByIdTest() {
        //GIVEN
        ProductRepo repo = new ProductRepo();
        //WHEN
        repo.removeProductById("1");

        //THEN
        assertEquals(repo.getProductById("1"), Optional.empty());
    }
}