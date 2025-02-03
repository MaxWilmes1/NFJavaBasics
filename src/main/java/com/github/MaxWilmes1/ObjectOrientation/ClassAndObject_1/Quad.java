package com.github.MaxWilmes1.ObjectOrientation.ClassAndObject_1;

public class Quad extends Car{
    int seats;

    public Quad(int numberOfDoors, int numberOfTires, boolean seatBelt, boolean airbag, int seats) {
        super(numberOfDoors, numberOfTires, seatBelt, airbag);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Quad{" +
                "seats=" + seats +
                ", numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                ", store=" + store +
                '}';
    }
}
