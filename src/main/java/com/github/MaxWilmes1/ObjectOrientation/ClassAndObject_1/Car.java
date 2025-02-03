package com.github.MaxWilmes1.ObjectOrientation.ClassAndObject_1;

import java.util.Objects;

public class Car {
    public static final String store = "Max Car Shop";

    int numberOfTires;
    int numberOfDoors;
    boolean seatBelt;
    boolean airbag;

    public Car(int numberOfDoors, int numberOfTires, boolean seatBelt, boolean airbag){
        System.out.println("Create new Object of class car!");
        this.numberOfDoors = numberOfDoors;
        this.numberOfTires = numberOfTires;
        this.seatBelt = seatBelt;
        this.airbag = airbag;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public boolean isSeatBelt() {
        return seatBelt;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void setSeatBelt(boolean seatBelt) {
        this.seatBelt = seatBelt;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfTires=" + numberOfTires +
                ", numberOfDoors=" + numberOfDoors +
                ", seatBelt=" + seatBelt +
                ", airbag=" + airbag +
                ", store=" + store +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return numberOfTires == car.numberOfTires && numberOfDoors == car.numberOfDoors && seatBelt == car.seatBelt && airbag == car.airbag;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfTires, numberOfDoors, seatBelt, airbag);
    }
}
