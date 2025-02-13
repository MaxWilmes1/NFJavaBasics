package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterlösung.Order;

public enum OrderStatus {
    IN_PROGRESS("1"),
    WAITING_FOR_PAYMENT("3"),
    IN_DELIVERY("2"),
    DONE("4");

    private final String value;

    OrderStatus(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
