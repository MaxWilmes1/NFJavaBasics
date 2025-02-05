package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3.Challange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void given2EqualCars_thenTrue(){
        Car expected = new Car("VW", "Golf4", 2002, 5);
        Car actual = new Car("VW", "Golf4", 2002, 5);
        Assertions.assertEquals(expected,actual);
    }

}
