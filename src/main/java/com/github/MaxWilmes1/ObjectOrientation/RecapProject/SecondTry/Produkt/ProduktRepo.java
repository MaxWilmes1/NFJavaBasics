package com.github.MaxWilmes1.ObjectOrientation.RecapProject.SecondTry.Produkt;

import java.util.ArrayList;
import java.util.List;

public class ProduktRepo {
    private List<Produkt> produkts;

    public ProduktRepo() {
        this.produkts = new ArrayList<>();
    }

    public List<Produkt> getProducts() {
        return produkts;
    }

    public Produkt getProductById(String id){
        for (Produkt produkt : produkts) {
            if ( produkt.id().equals(id) ){
                return produkt;
            }
        }
        return null;
    }

    public Produkt addProduct(Produkt newProdukt){
        produkts.add(newProdukt);
        return newProdukt;
    }

    public void removeProductById(String id){
        for (Produkt produkt : produkts) {
            if ( produkt.id().equals(id) ){
                produkts.remove(produkt);
                return;
            }
        }
    }

}
