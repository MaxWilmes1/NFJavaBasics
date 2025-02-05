package com.github.MaxWilmes1.ObjectOrientation.Static_4;

public final class Calculator {

    private static final double pi = 3.1416;

    public static int add(int a, int b){
        System.out.println("Current total count: "+ Student.getTotalCount());
        Student.setTotalCount(5);
        System.out.println("Set total count to: " + Student.getTotalCount());
        return a+b;
    }
    public static int subtract(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static int divide(int a, int b){
        return a/b;
    }
    public static double surfaceOfCircle(int radius){
        System.out.println("pi is set to: "+ pi);
        return pi*(radius*radius);
    }

    public static double getPi() {
        return pi;
    }

}
