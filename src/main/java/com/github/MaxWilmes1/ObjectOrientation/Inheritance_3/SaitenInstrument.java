package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3;

public class SaitenInstrument extends Instrument{
    int saiten;

    @Override
    public String toString() {
        return "SaitenInstrument{" +
                "saiten=" + saiten +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
