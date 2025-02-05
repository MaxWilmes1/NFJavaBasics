package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3.Challange;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    void given2EqualVehicls_thenTrue(){

        Vehicle expected = new Vehicle("VW", "Golf", 2002);
        Vehicle actual = new Vehicle("VW", "Golf", 2002);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void given2EqualVehicls_thenFalse(){

        Vehicle unexpected = new Vehicle("VW", "Golf4", 2002);
        Vehicle actual = new Vehicle("VW", "Golf", 2002);
        Assertions.assertNotEquals(unexpected,actual);
    }

    @Test
    void getManufacturer() {
    }

    @Test
    void setManufacturer() {
    }

    @Test
    void getModel() {
    }

    @Test
    void setModel() {
    }

    @Test
    void getYearOfManufacture() {
    }

    @Test
    void setYearOfManufacture() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}
