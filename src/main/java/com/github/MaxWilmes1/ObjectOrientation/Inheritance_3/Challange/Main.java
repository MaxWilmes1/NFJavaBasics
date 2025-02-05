package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3.Challange;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("VW", "Golf4", 2002);
        Car car = new Car("VW", "Golf4", 2002, 5);

        System.out.println(vehicle);
        System.out.println(car);
    }
}
