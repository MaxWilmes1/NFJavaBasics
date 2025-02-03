package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3;

public class Instrument {
    String brand;
    double price;

    @Override
    public String toString() {
        return "Instrument{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
