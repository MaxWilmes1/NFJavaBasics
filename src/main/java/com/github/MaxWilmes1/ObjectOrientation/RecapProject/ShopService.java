package com.github.MaxWilmes1.ObjectOrientation.RecapProject;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopService {

    private ProductRepo productRepo = new ProductRepo();
    private OrderListRepo orderListRepo = new OrderListRepo();

    public Order addOrder(List<String> productIds){
        List<Product> orderedProducts = new ArrayList<>();

        for (String productId : productIds) {
            Product productToOrder = productRepo.getProductById(productId);
            if ( productToOrder == null ){
                System.out.println("Product with id "+ productId + " cant be ordered!");
                return null;
            }
            orderedProducts.add(productToOrder);
        }

        Order newOrder = new Order(UUID.randomUUID().toString(), orderedProducts);
        return orderListRepo.addOrder(newOrder);
    }

}
