package com.github.MaxWilmes1.ObjectOrientation.ClassAndObject_1.Challange;

public class Car {
    private String brand;
    private String model;
    private String color;
    private int year;
    private int horsePower;
    private int speed = 0;

    public Car(String brand, String model, String color, int year, int horsePower, int speed){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year= year;
        this.horsePower = horsePower;
        this.speed = speed;
    }

    public Car(String brand, String model, String color, int year, int horsePower){
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year= year;
        this.horsePower = horsePower;
        speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String colour) {
        this.color = color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String startEngine() {
        return "Engine started!";
    }

}
