package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung;

import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order.Order;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order.OrderMapRepo;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order.OrderRepo;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order.OrderStatus;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Product.Product;
import com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Product.ProductRepo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ShopService {

    private ProductRepo productRepo = new ProductRepo();
    private OrderRepo orderRepo = new OrderMapRepo();

    public Order addOrder(List<String> productIds){
        List<Product> orderedProducts = new ArrayList<>();

        for (String productId : productIds) {
            Optional<Product> productToOrder = productRepo.getProductById(productId);
            if ( productToOrder.isEmpty() ){
                System.out.println("Product with id "+ productId + " cant be ordered!");
                return null;
            }
            orderedProducts.add(productToOrder.get());
        }

        Order newOrder = new Order(UUID.randomUUID().toString(), orderedProducts, OrderStatus.DONE);
        return orderRepo.addOrder(newOrder);
    }

}
