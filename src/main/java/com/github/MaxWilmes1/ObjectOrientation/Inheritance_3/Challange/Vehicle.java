package com.github.MaxWilmes1.ObjectOrientation.Inheritance_3.Challange;

import java.util.Objects;

public class Vehicle {
    private String manufacturer;
    private String model;
    private int YearOfManufacture;

    public Vehicle() {
    }

    public Vehicle(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        YearOfManufacture = yearOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return YearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        YearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return YearOfManufacture == vehicle.YearOfManufacture && Objects.equals(manufacturer, vehicle.manufacturer) && Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, YearOfManufacture);
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", YearOfManufacture=" + YearOfManufacture +
                '}';
    }
}
