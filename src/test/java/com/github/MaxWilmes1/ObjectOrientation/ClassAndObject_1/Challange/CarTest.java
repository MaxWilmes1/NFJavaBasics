package com.github.MaxWilmes1.ObjectOrientation.ClassAndObject_1.Challange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void createCar() {
        // given
        Car car = new Car("VW", "Golf4", "green", 2002, 100);
        // then
        Assertions.assertEquals("VW", car.getBrand());
        Assertions.assertEquals("Golf4", car.getModel());
        Assertions.assertEquals("green", car.getColor());
        Assertions.assertEquals(2002, car.getYear());
        Assertions.assertEquals(100, car.getHorsePower());
    }

    @Test
    void startCar(){
        // given
        Car car = new Car("VW", "Golf4", "green", 2002, 100);
        // when
        String expected = "Engine started!";
        String actual = car.startEngine();
        // then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void accelerateCar() {
        Car car = new Car("VW", "Golf4", "green", 2002, 100);
        Car car1 = new Car("VW", "Golf4", "green", 2002, 100);
        int expectedCar = 100;
        int expectedCar1 = 250;
        car.setSpeed(100);
        car1.setSpeed(250);
        int actualCar = car.getSpeed();
        int actualCar1 = car1.getSpeed();
        Assertions.assertEquals(expectedCar,actualCar);
        Assertions.assertEquals(expectedCar1,actualCar1);

    }
}
