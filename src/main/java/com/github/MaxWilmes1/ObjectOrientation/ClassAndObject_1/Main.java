package com.github.MaxWilmes1.ObjectOrientation.ClassAndObject_1;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(5, 4, true, true);
        Car car2 = new Car(2, 3, false, false);
        Car quad1 = new Quad(0, 4, false, false, 2);

        printCar(car1);
        printCar(car2);
        printCar(quad1);

        startEngine(quad1);
    }

    public static void printCar(Car car) {
        System.out.println(car);
//        System.out.println("The car has "+ car.numberOfTires +" tires, "+ car.numberOfDoors+ " doors, seatbelt is "+car.seatBelt+ " and airbag is "+ car.airbag);

    }

    public static void startEngine (CanStartEngine sound){
        System.out.println("Starting engine...");
        System.out.println(sound.startEngine());
        System.out.println("Engine started successfully! :)");
    }
}
