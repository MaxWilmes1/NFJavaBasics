package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import java.util.List;
import java.util.Objects;

public class ProductRepo {
    List<Product> products;

    public ProductRepo(List<Product> products) {
        this.products = products;
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void remove(String product) {
        this.products.removeIf(p -> Objects.equals(p.type(), product));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(products);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }

}
