package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3;

public class Instrument {
    public static final String store = "Max Instrument Shop";

    String brand;
    double price;

    @Override
    public String toString() {
        return "Instrument{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", store=" + store +
                '}';
    }
}
